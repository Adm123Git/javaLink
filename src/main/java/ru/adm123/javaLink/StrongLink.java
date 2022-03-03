package ru.adm123.javaLink;

import ru.adm123.javaLink.model.Pojo;
import ru.adm123.javaLink.model.factory.FactoryPojo;
import ru.adm123.javaLink.service.ServicePojo;

import java.util.List;

/**
 * @author Dmitry Ushakov at 02.03.2022<br>
 * Демо для "обычных" (strong) ссылок
 */
public class StrongLink {

    private static final ServicePojo servicePojo = new ServicePojo();

    public static void main(String[] args) {
        System.out.println("----------- start STRONG LINK test -----------");
        List<Pojo> list = servicePojo.generateList(100000, FactoryPojo::getStrong);
        System.out.println("list contains " + list.size() + " elements now");
        System.out.println("And all of them are live");
        System.out.println("------------ end STRONG LINK test ------------");
    }

}
