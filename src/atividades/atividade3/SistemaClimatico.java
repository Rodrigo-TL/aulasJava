package atividades.atividade3;

import java.util.Scanner;

public class SistemaClimatico {


    public static double converterParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }


    public static void avaliarClima(double fahrenheit) {
        if (fahrenheit < 50.0) {
            System.out.println("Clima Frio.");

        } else if (fahrenheit >= 50.0 && fahrenheit <= 79.9) {
            System.out.println("Clima Agradável.");

        } else {
            System.out.println("Clima Quente.");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = entrada.nextDouble();


        double fahrenheitCalculado = converterParaFahrenheit(temperaturaCelsius);


        avaliarClima(fahrenheitCalculado);

        entrada.close();
    }
}
