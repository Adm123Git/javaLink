package ru.adm123.javaLink.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Dmitry Ushakov at 02.03.2022
 * Сервис для работы с объектами
 */
public class ServicePojo {

    public <T> List<T> generateList(int count,
                                    Supplier<T> supplier) {
        if (count < 1) {
            throw new IllegalArgumentException("count < 1");
        }
        List<T> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(supplier.get());
        }
        return list;
    }

}
