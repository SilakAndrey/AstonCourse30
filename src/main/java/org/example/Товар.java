package org.example;

public class Товар {
    public static void main(String[] args) {
        Товар a = new Товар("Часы", "19.09.2009", "Сунь Цзынь", "Китай", 65000, false);
        a.info();

        Товар[] productsArray = new Товар[5];
        productsArray[0] = new Товар("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Товар("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[2] = new Товар("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[3] = new Товар("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[4] = new Товар("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);

    }
    private String название;
    private String датаПроизводства;
    private String производитель;
    private String странаПроисхождения;
    private int цена;
    private boolean состояниеБронированияПокупателем;
    public Товар (String название, String датаПроизводства, String производитель, String странаПроисхождения, int цена, boolean состояниеБронированияПокупателем){
        this.название = название;
        this.датаПроизводства = датаПроизводства;
        this.производитель = производитель;
        this.странаПроисхождения = странаПроисхождения;
        this.цена = цена;
        this.состояниеБронированияПокупателем = состояниеБронированияПокупателем;
    }
    public void info(){
        System.out.println("Название: " + название);
        System.out.println("Дата производства: " + датаПроизводства);
        System.out.println("Производитель: " + производитель);
        System.out.println("Страна происхождения: " + странаПроисхождения);
        System.out.println("Цена: " + цена);
        System.out.println("Состояние бронирования покупателем: " + (состояниеБронированияПокупателем ? "Забронирован" : "Не забронирован"));
    }
}

