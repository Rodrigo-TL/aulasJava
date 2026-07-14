package atividades.atividade3;

import java.util.Scanner;

public class VerificadorAcesso {


    public static boolean verificarMaioridade(int idade) {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite a sua idade: ");
        int idadeDigitada = entrada.nextInt();


        boolean ehMaiorDeIdade = verificarMaioridade(idadeDigitada);



        if (ehMaiorDeIdade == true) {
            System.out.println("Acesso Liberado");
        } else {
            System.out.println("Acesso Negado");
        }

        entrada.close();
    }
}
