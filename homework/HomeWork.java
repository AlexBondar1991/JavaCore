package com.company.lesson_first.homework;

public class HomeWork {
    // Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {

        // Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte one = 7;
        short two = 77;
        int three = 777;
        long four = 7777L;
        float five = 7.7777f;
        double six = 7.77777;
        char seven = '7';
        boolean isSeven = true;


    }

    // Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //        где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float mathTask(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }

    // Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static boolean taskFour(int a, int b) {
        boolean isTaskFout = false;
        if (a + b >= 10 && a + b <= 20) {
            isTaskFout = true;
        } else isTaskFout = false;

        return isTaskFout;
    }


    // Написать метод, которому в качестве параметра передается целое число, метод должен
    // напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void taskFive(int a) {
        if (a < 0) {
            System.out.println(a + "- отрицательное число");
        } else if (a >= 0) {
            System.out.println(a + "- положительное число число");
        }
    }

    // Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean isPositivTry (int a){
        if (a < 0) return false;
        return false;
    }


    // Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    public static void helloName (String name){
        System.out.println("Привет " + name);
    }

    // *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Кажды4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.




}
