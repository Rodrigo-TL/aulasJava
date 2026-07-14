package Aulas;

import java.util.Scanner;

public class TerceiraAula {
    static Scanner entrada = new Scanner(System.in);

    public static int somaDeVariaveis(int x, int y){
        int resultado = x + y;
        return resultado;
    }

    public static void imprimirSoma(){
        System.out.println("\n= MÉTODO DE IMPRESSÃO =\n");
        System.out.println(somaDeVariaveis(10, 20));
        System.out.println("\n= FIM DO MÉTODO DE IMPRESSÃO =\n");
    }

    public static boolean metodoDeComparacao(int resultado){
        if(resultado == 1){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== MÉTODO MAIN ===\n\n");
        imprimirSoma();
        int opcao = entrada.nextInt();

        if(metodoDeComparacao(opcao)){
            System.out.println("A opção estava CORRETA");
        } else {
            System.out.println("A opção estava ERRADA");
        }

        System.out.println("\n\n=== FIM MÉTODO MAIN ===");
    }
}