package ru.adm123.javaLink.model.factory;

import ru.adm123.javaLink.model.Pojo;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @author Dmitry Ushakov at 02.03.2022<br>
 * Просто фабрика для создания объектов {@link Pojo}, возвращающая ссылки разных типов на созданные объекты
 */
public class FactoryPojo {

    private static int counter;

    private FactoryPojo() {
    }

    /**
     * Создает объект {@link Pojo}
     * @return {@code weak}-ссылка на созданный объект
     */
    public static WeakReference<Pojo> getWeak() {
        return new WeakReference<>(new Pojo(++counter));
    }

    /**
     * Создает объект {@link Pojo}
     * @return {@code soft}-ссылка на созданный объект
     */
    public static SoftReference<Pojo> getSoft() {
        return new SoftReference<>(new Pojo(++counter));
    }

    /**
     * Создает объект {@link Pojo}
     * @return {@code strong}-ссылка на созданный объект
     */
    public static Pojo getStrong() {
        return new Pojo(++counter);
    }

}
