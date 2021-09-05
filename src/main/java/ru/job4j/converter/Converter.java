package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float testEuro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        return out;
    }

    public static float testDollar() {
        float in = 120;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);
        return out;
    }

    public static float testEuroToDollar() {
        float in = 70;
        float expected = 1.1666666f;
        float out = Converter.euroToDollar(in);
        boolean passed = expected == out;
        System.out.println("1 euro are 1,16 dollars. Test result : " + passed);
        return out;
    }

    public static float testDollarToEuro() {
        float in = 60;
        float expected = 0.85714287f;
        float out = Converter.dollarToEuro(in);
        boolean passed = expected == out;
        System.out.println("1 dollar are 0,85 euro. Test result : " + passed);
        return out;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        float euroToDollar = Converter.euroToDollar(70);
        float dollarToEuro = Converter.dollarToEuro(60);

        float testEuro = Converter.testEuro();
        float testDollar = Converter.testDollar();
        float testEuroToDollar = Converter.testEuroToDollar();
        float testDollarToEuro = Converter.testDollarToEuro();

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");
        System.out.println("1 euro is " + euroToDollar + " dollar.");
        System.out.println("1 dollar is " + dollarToEuro + " euro.");

        System.out.println(testEuro);
        System.out.println(testDollar);
        System.out.println(testEuroToDollar);
        System.out.println(testDollarToEuro);
    }
}
