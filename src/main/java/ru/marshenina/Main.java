package ru.marshenina;

public class Main {
    public static void main(String[] args) {
        //Математические операторы
        int a = 5;
        int b = -2;

        int sum = a + b;
        System.out.println("Результат сложения: " + sum);
        int diff = a - b;
        System.out.println("Результат вычитания: " + diff);
        int mult = a * b;
        System.out.println("Результат умножения: " + mult);
        int div = a / b;
        System.out.println("Результат деления: " + div);
        int rem = a % b;
        System.out.println("Остаток от деления: " + rem);

        //Операторы сравнения
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("b >= a: " + (b >= a));
        System.out.println("b <= a: " + (b <= a));

        //Логические операторы
        if ((a > 0) && (b > 0)) {
            System.out.println("Положительные числа");
        } else if ((a < 0) && (b < 0)) {
            System.out.println("Отрицательные числа");
        } else if ((a > 0) && (b < 0) || (a < 0) && (b > 0)) {
            System.out.println("Положительные и отрицательные");
        } else {
            System.out.println("Error");
        }

        //        Тернарный оператор
        int minValue = (a < b) ? a : b;
        System.out.println("min = " + minValue);

//        Переполнение
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("Максимальное значение int: " + intMaxValue);
        int intOverflow = intMaxValue + 1;
        System.out.println("Результат переполнения: " + intOverflow);

//        Комбинация разных типов данных (int и double)
        int aInt = 2;
        double aDouble = 0.5;

        System.out.println(aInt + aDouble); // приведение к типу double
    }
}
