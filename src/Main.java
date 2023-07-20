import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    
    public static void  task1() {
        System.out.println("\n" + "Задача 1" + "\n");

        int age = 15;

        if (age>=18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

    }

    public static void task2() {
        System.out.println("\n" + "Задача 2" + "\n");

        int weatherTemperature = 6;
        if (weatherTemperature<=5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        } else {
            System.out.println("На улице тепло, можно гулять без шапки.");
        }

    }

    public static void task3() {
        System.out.println("\n" + "Задача 3" + "\n");

        int driverSpeed = 60;
        if (driverSpeed>60) {
            System.out.println("Если скорость равна " + driverSpeed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость равна " + driverSpeed + ", можно ездить спокойно.");
        }

    }

    public static void  task4() {
        System.out.println("\n" + "Задача 4" + "\n");

        int manAge = 1 + (int) (Math.random() * 65);
        System.out.println("Если возраст человека равен " + manAge + ", то ");
        if (manAge < 2) {
            System.out.println("ему пора спать.");
        } else if (manAge>=2 && manAge<=6) {
            System.out.println("ему нужно ходить в детский сад.");
        } else if (manAge>=7 && manAge<=18) {
            System.out.println("ему нужно ходить в школу.");
        } else if (manAge>18 && manAge<=24) {
            System.out.println("ему нужно ходить в университет.");
        } else if (manAge > 24 && manAge <= 60) {
            System.out.println("ему нужно ходить на работу.");
        } else if (manAge > 60) {
            System.out.println("ему пора отдохнуть.");
        }

    }

    public static void task5() {
        System.out.println("\n" + "Задача 5" + "\n");

        int childAge = 2 + (int) (Math.random() * 16);
        System.out.println("Если возраст ребенка равен " + childAge + ", то");
        if (childAge < 5) {
            System.out.println("он не может кататься на аттракционе.");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("он может кататься в сопровождении взрослого.");
        } else if (childAge >= 14) {
            System.out.println("он может кататься без сопровождения взрослого.");
        }
    }

    public static void task6() {
        System.out.println("\n" + "Задача 6" + "\n");
        int train = 1 + (int) (Math.random() * 103);
        if (train < 60) {
            System.out.println("В вагоне есть свободные сидячие места.");
        } else if (train >= 60 && train < 102) {
            System.out.println("В вагоне нет сидячих мест, но есть стоячие.");
        } else if (train >= 102) {
            System.out.println("Вагон полностью забит.");
        }
    }

    public static void task7() {
        System.out.println("\n" + "Задача 7" + "\n");
        int one = 56;
        int two = 59;
        int three = 58;
        if (one >= two && one >=three) {
            System.out.println(one);
        } else if (two >= three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }

    }

    }

