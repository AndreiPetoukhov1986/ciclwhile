public class Main {
    public static void main(String[] args) {
        task1();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8();

    }
    public static void task1 () {
        System.out.println("Задача №1");
        int rub = 0;
        int sum = 15_000;
        int i = 1;
        while (rub<2_459_000){
            rub = rub+sum;
            System.out.println("Месяц: " + i++ + " Cумма накоплений равна = "+ rub +" рублей");

        }

    }
    public static void task2 () {
        System.out.println("Задача №2");
        int i=1;
        while (i<=10){
            System.out.print(i++ +" ");
        }
        System.out.println();
        for (int z = 10; z >=1; z--) {
            System.out.print(z+" ");
        }
        System.out.println();
    }

    public static void task3 (){
        System.out.println("Задача №3");
        int people= 12_000_000;
        int year = 0;
        int dead = 8;
        int life = 17;
        while (year<10){
            year++;
            people = people + (life-dead)*people/1000;

            System.out.println("год " + year + " численность населения составляет " +people);
        }
        }

    public static void task4 () {
        System.out.println("Задача №4");
        double rub = 0;
        int sum = 15_000;
        int i = 1;
        while (rub<=12_000_000){
            rub = (rub+sum)*1.07;
            System.out.printf("Месяц: " + i++ + " Cумма накоплений равна = %.2f%n", rub ," рублей");

        }
    }


    public static void task5 (){
        System.out.println("Задача №5");
        double rub = 0;
        int sum = 15_000;
        int i = 1;
       for (; rub<=12_000_000; i++){
            rub = (rub + sum)*1.07;

            if (i%6==0) {
                System.out.printf("Месяц: " + i + " Cумма накоплений равна = %.2f%n", rub ," рублей");
            }
            }
    }
    public static void task6 (){
        System.out.println("Задача №6");
        double rub = 0;
        int sum = 15_000;
        int i = 1;
        for (; i<=108; i++){
            rub = (rub + sum)*1.07;

            if (i%6==0) {
                System.out.printf("Месяц: " + i + " Cумма накоплений равна = %.2f%n", rub ," рублей");
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача №7");
        int day = 5;
        for (; day < 31; day=day+7) {
             System.out.println("Сегодня пятница, " + day+ "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8 () {
        System.out.println("Задача №8");
        int year = 2023;
        int a = (year-200);
        int b = (year + 100);
        for (int i=0; i<b;i=i+79) {
if (i>a){
            System.out.println(i);}
        }

        }
    }
