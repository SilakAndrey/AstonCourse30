package org.example;

public class LessonOne {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(task5(10, 10) + "\n");
        task6(-2);
        System.out.println(task7(10) + "\n");
        task8("Не ставьте 59 баллов ", 5);
        System.out.println("\n\n" + task9(1900) + "\n");
        task10();
        task11();
        task12();
        task13();
        task14(10, 59);
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
            return true;
        }
        else {System.out.println("Число отрицательное\n");
            return false;
        }
    }

    public static boolean task7(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void task8(String text, int a){
        for (int i = a; i > 0; i--){
            System.out.print(text);
        }
    }

    public static boolean task9(int a) {
        if (a % 400 == 0) {
            return true;
        }
        if (a % 100 == 0) {
            return false;
        }
        if (a % 4 == 0) {
            return true;
        }
        else return false;
    }

     public static void task10(){
        int[] a = new int[5];
        a[0] = 1; a[1] = 0; a[2] = 1; a[3] = 0; a[4] = 1;
        for (int i = 0; i < 5; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++){
            if(a[i] == 1){
                a[i] = 0;
            }
            else {a[i] = 1;
            }
        }
         for (int i = 0; i < 5; i++){
             System.out.print(a[i] + " ");
         }
         System.out.println("\n");
     }

    public static void task11(){
        int[] a = new int[100];
        for (int i = 0; i < 100; i++){
            a[i] = i + 1;
        }
        for (int i = 0; i < 100; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
    }

    public static void task12(){
        int[] a = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < 12; i++){
            if(a[i] < 6){
                a[i] *= 2;
            }
        }
        for (int i = 0; i < 12; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
    }

    public static void task13(){
        int[][] a = new int[5][5];
        for (int i = 0; i < 5; i++){
            for (int j1 = 0, j2 = 4; j1 < 5; j1++, j2--){
                if (j1 == i){
                    a[i][j1] = 1; a[i][j2] = 1;
                }
            }
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");
    }

    public static int[] task14(int len, int initialValue){
        int[] a = new int[len];
            for (int i = 0; i < len; i++){
                a[i] = initialValue;
                System.out.print(a[i] + " ");
            }
        return a;
    }
}