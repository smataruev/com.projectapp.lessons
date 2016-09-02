package com.projectapp.lessons._5_Inheritance._4_Interface;


public class A1_Call implements A1_InterfaceCallback {

    @Override
    public void call(int a) {
        System.out.println("Вызван метод реализуемый из интерфейса и принимающее значение = " + a);
    }

    public void showSmg() {
        System.out.println("Вызов метода класса A1_Call ");
    }

    /**
     *
     * Переменные можно объявлять как ссылки на объекты, в которых используется
     * тип интерфейса, а не тип класса.
     * С помощью такой переменной можно ссылаться
     * на любой экземпляр какого угодно класса, реализующего объявленный интерфейс.
     *
     *  A1_InterfaceCallback ref = new A1_Call();
     *  ref.call(6);
     *
     *  Переменная ссылки на интерфейс
     *  располагает только сведениями о методах, объявленных в том интерфейсе.
     *
     *  Переменной интерфейса не будут доступны методы или поля, которые обьявлены и реализвованы
     *  в классе.
     *
     *
     */






}