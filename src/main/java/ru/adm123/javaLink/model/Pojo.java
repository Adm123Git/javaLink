package ru.adm123.javaLink.model;

import lombok.Value;

/**
 * @author Dmitry Ushakov at 02.03.2022<br>
 * Просто некий объект, которым будем забивать кучу
 */
@Value
public class Pojo {

    int id;
    String name;

    public Pojo(int id) {
        if (id < 1) {
            throw new IllegalArgumentException("id < 1");
        }
        this.id = id;
        this.name = "pojoObject" + id;
    }

}
