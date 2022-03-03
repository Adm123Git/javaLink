package ru.adm123.javaLink;

import ru.adm123.javaLink.model.Pojo;
import ru.adm123.javaLink.model.factory.FactoryPojo;
import ru.adm123.javaLink.service.ServicePojo;

import java.lang.ref.SoftReference;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Dmitry Ushakov at 02.03.2022<br>
 * Демо для "мягких" (soft) ссылок
 */
public class SoftLink {

    private static final ServicePojo servicePojo = new ServicePojo();

    public static void main(String[] args) {
        System.out.println("----------- start SOFT LINK test -----------");
        List<SoftReference<Pojo>> list = servicePojo.generateList(100000, FactoryPojo::getSoft);
        List<SoftReference<Pojo>> listLiveObjects = list.stream()
                .filter(softReference -> softReference.get() != null)
                .collect(Collectors.toList());
        System.out.println("list contains " + list.size() + " elements now");
        System.out.println("But only " + listLiveObjects.size() + " of them are live");
        System.out.println("------------ end SOFT LINK test ------------");
    }

}
