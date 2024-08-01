import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 17;
        boolean agE = age >= 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то, он совершеннолетний");
        }   else  {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
             }

        System.out.println("Задача 2");
        int temperature = 7;
            if (temperature > 5) {
                System.out.println("На улице " + temperature + " градусов,можно идти без шапки");
            } else {
                System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
            }

        System.out.println("Задание 3");
            int speed = 55;
            if (speed > 60) {
                System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
            }else {
                System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
            }

        System.out.println("Задание 4");
        int age1 = 25;
                if (age1 >2 && age1 <6) {
                    System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");}
        if (age1 >7 && age1 <18) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");}
        if (age1 >18 && age1 <24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");}
        if (age1 >24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");}

        System.out.println("Задание 5");
        /*Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.
        Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.*/
        int chilldren = 15;
        int grown =1;
        if (chilldren <5){
            System.out.println("Если возраст ребенка "+ chilldren + ", то ему нельзя кататься на атракционе");}
        if ((chilldren >= 5 && chilldren < 14) && grown == 1){
            System.out.println("Если возраст ребенка " + chilldren + ", то ему нельзя кататься на атракционе без сопровождения");}
        if (chilldren >14){
            System.out.println("Если возраст ребенка " + chilldren + ", то ему можно кататься на атракционе без сопровождения");}


        System.out.println("Задание 6.");
        int oneTrain = 106;
        int seating = oneTrain - 60;
        int standingPlace = oneTrain - seating;
        int occupiedPlace = 105;
        if (oneTrain > occupiedPlace){
            System.out.println("В вагоне есть места");}
        else {
            System.out.println("Вагон полный, нету мест");
        }
        if (occupiedPlace < seating && occupiedPlace < oneTrain){
            System.out.println("В вагоне есть сидячие места");}
        else {
            System.out.println("В вагоне нет сидячих мест");}
        if (occupiedPlace > seating && occupiedPlace < oneTrain){
            System.out.println("В вагоне остались стоячие места");
        }


        System.out.println("Задание 7.");

        System.out.println("первое число");
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        System.out.println("второе число");
        int two = sc.nextInt();
        System.out.println("третье число");
        int three = sc.nextInt();
        if(one > two){
            if(one > three){
                System.out.println("1 число самое большое");
            }
            if(one < three){
                System.out.println("3 число самое большое");
            }
            if(one == three){
                System.out.println("1 и 3 равны и больше 2");
            }
        }
        if (two > three){
            if(two > one){
                System.out.println("2 число самое большое");
            }
            if(one < two){
                System.out.println("1 число самое большое");
            }
            if(one == two){
                System.out.println("1 и 2 равны и больше 3");
            }
        }
        if (three > one){
            if(three > two){
                System.out.println("3 число самое большое");
            }
            if(three < two){
                System.out.println("2 число самое большое");
            }
            if(three == two){
                System.out.println("2 и 3 равны и больше 1");
            }
        } else {
            System.out.println("Все числа равны");
        }
    }
}