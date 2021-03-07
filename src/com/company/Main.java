package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println("Задание 1");
        int t = 4;
        if (t % 9 == 0)
            System.out.print(t * 1.5f);
        else {
            System.out.println(t * t);
            System.out.println();
        }


        System.out.println("Задание 2");
        int h = 1;
        if (h == 1) {
            System.out.println("Понедельник");
        }
        if (h == 2) {
            System.out.println("Вторник");
        }
        if (h == 3) {
            System.out.println("Среда");
        }
        if (h == 4) {
            System.out.println("Четверг");
        }
        if (h == 5) {
            System.out.println("Пятница");
        }
        if (h == 6) {
            System.out.println("Суббота");
        }
        if (h == 7) {
            System.out.println("Воскресенье");
        }
        System.out.println();


        System.out.println("Задание 3");
        for (int i = 1; i <= 50; i++) {
            if (i % 9 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println("Задание 4");
        System.out.println(getFuctorial(0));
        System.out.println(getFuctorial(5));
    }

    public static int getFuctorial ( int f){
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
