package org.example;

public class Park {
    private String name = "Мгновение Радости";
    public static void main(String[] args) {
        Park.Attractions attraction1 = new Attractions("На крыльях ужаса", "16:00-20:00", 5000);
    }
    public static class Attractions{
        private String информация;
        private String времяРаботы;
        private int стоимость;
        public Attractions (String информация, String времяРаботы, int стоимость){
            this.информация = информация;
            this.времяРаботы = времяРаботы;
            this.стоимость = стоимость;
        }
    }
}
