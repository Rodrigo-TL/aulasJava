package atividades.atividade4;

import java.util.Scanner;

public class CofreDigital {

    public static void main(String[] args) {

        abrirCofre();
    }

    public static void abrirCofre() {
        Scanner leitor = new Scanner(System.in);
        int tentativas = 5;


        while (tentativas > 0) {
            System.out.print("Digite o código: ");
            int codigo = leitor.nextInt();


            if (codigo == 9999) {
                System.out.println("Cofre Aberto!");
                break;
            }


            tentativas = tentativas - 1;

            if (tentativas > 0) {
                System.out.println("Código Errado. Restam " + tentativas + "...");
            } else {
                System.out.println("Cofre Bloqueado!");
            }
        }

        leitor.close();
    }
}
