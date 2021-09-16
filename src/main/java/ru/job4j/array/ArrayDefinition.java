package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
            System.out.println("Размер массива ages: " + ages.length);
        String[] surnames = new String[100500];
            System.out.println("Размер массива surnames: " + surnames.length);
        float[] pieces = new float[40];
            System.out.println("Размер массива pieces: " + pieces.length);
        String[] names = new String[4];
            names[0] = "Andrey";
        System.out.println("Объект 1 ваше имя: " + names[0]);
            names[1] = "Tommy";
        System.out.println("Объект 2 ваше имя: " + names[1]);
            names[2] = "Gaby";
        System.out.println("Объект 3 ваше имя: " + names[2]);
            names[3] = "Evlampiy";
        System.out.println("Объект 4 ваше имя: " + names[3]);
    }
}
