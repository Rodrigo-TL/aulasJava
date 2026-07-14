package atividades.atividade3;

import java.util.Scanner;

public class MaquinaDoDobro {


    public static int calcularDobro(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroDigitado = entrada.nextInt();


        int resultadoFinal = calcularDobro(numeroDigitado);

        System.out.println("O dobro do número é: " + resultadoFinal);

        entrada.close();
    }
}
