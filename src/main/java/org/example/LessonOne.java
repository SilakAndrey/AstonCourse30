package org.example;

public class LessonOne {

    public static void main(String[] args) {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        //System.out.println(task5(10, 10)+ "\n");
        task6(1);
    }

    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple\n");
    }

    public static void checkSumSign(){
        int a = 10, b = -9, c = a + b;
        if (c >= 0){
            System.out.println("Сумма положительная\n");
        }
        else System.out.println("Сумма отрицательная\n");
    }

    public static void printColor(){
        int value = 10;
        if (value <= 0){
            System.out.println("Красный\n");
        }
        else if (value > 0 &&  value <=100) {
            System.out.println("Желтый\n");
        }
        else {System.out.println("Зеленый\n");
        }
    }

    public static void compareNumbers(){
        int a = 10, b = 10;
        if(a >= b){
            System.out.println("a >= b\n");
        }
        else {System.out.println("a < b\n");
        }
    }
    public static boolean task5(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        }
        else {return false;
        }
    }

    public static boolean task6(int a) {
        if (a >= 0) {
            System.out.println("Число положительное\n");
        }
        else {System.out.println("Число отрицательное\n");
        }
    }
}
