package homework_06;

//Task 1
//Дан текст Programming is fun.
//
//Напишите программу, которая проверяет, содержит ли эта строка слово “fun”, и выведите результат в виде булевой переменной

public class Task1 {
    public static void main(String[] args) {
        String string = "Programming is fun";
        boolean contains = string.contains("fun");
        System.out.println(contains);
    }
}