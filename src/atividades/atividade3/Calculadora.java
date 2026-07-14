package atividades.atividade3;

import java.util.Scanner;

public class Calculadora {


    public static int subtrairNumeros(int x, int y) {
        return x - y;
    }


    public static void imprimirResultado(int valor) {
        System.out.println("O resultado da operação é: " + valor);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();


        int resultadoCalculado = subtrairNumeros(numero1, numero2);


        imprimirResultado(resultadoCalculado);

        entrada.close();
    }
}
