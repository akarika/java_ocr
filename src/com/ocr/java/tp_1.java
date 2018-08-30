package com.ocr.java;

import java.util.Scanner;

public class tp_1 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int celOrFah;
        int tempToconvert;
        char yesOrNot = ' ';
        System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
        System.out.println("-------------------------------------------------");
        do {
            System.out.println("Choississez le mode de conversion");
            System.out.println("1 - Convertisseur Celsius - Fahrenheit");
            System.out.println("2 - Convertisseur Fahrenheit - Celsius");
            celOrFah = sc.nextInt();
            sc.nextLine();
            System.out.println("Température à convertir :");
            tempToconvert = sc.nextInt();
            sc.nextLine();
            if (celOrFah == 1) {
                double temp = celsiusToFahrenheit(tempToconvert);
                System.out.println(tempToconvert + ".0 °C correspond à : " + temp + "°F");
            } else if (celOrFah == 2) {
                double temp = FahrenheitTocelsius(tempToconvert);
                System.out.println(tempToconvert + ".0 °F correspond à : " + temp + "°C");
            }
            System.out.println("Souhaitez-vous convertir une autre température ?(O/N)");

            yesOrNot = sc.nextLine().charAt(0);

        } while (yesOrNot != 'N');
        System.out.println("Au revoir !");
    }

    public static double arrondi(double A, int B) {
        return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }

    /**
     * @param temp
     * @return double
     */
    public static double celsiusToFahrenheit(int temp) {
        double fahrenheit;
        fahrenheit = ((9.0 / 5.0) * temp) + 32;

        return arrondi(fahrenheit, 1);
    }

    /**
     * @param temp
     * @return double
     */
    public static double FahrenheitTocelsius(double temp) {
        double celsius;
        celsius = ((temp - 32) * 5.0) /9.0;
        return arrondi(celsius, 2);
    }
}
/*
 *
 *
 * */