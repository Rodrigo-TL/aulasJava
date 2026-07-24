package Aulas.polimorfismo.exemplos.formulario;

public class Main {
    public static void main(String[] args) {
        Cadastro pessoa1 = new Cadastro("Joao", 22, "Professor", true);
        Cadastro pessoa2 = new Cadastro("Fulano", 33, true);
        Cadastro pessoa3 = new Cadastro("Ciclano", true);
        Cadastro pessoa4 = new Cadastro("Beltrano");

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
        System.out.println(pessoa4);

        /**
         * FALHA NO MEU CADASTRO
         *
         * Nesse cadastro, estou criando pessoas sem
         * todas as informações
         *
         * ATIVIDADE
         *
         * 1. Permitir a criação de pessoas cadastradas
         *    sem todas as informações.
         *    Essas pessoas, tem que entrar
         *    numa lista de DADOS INCOMPLETOS
         *
         * 2. Permitir que as pessoas que tem os
         *    dados incompletos, preencham os
         *    dados que faltam no seu cadastro.
         *
         *
         *
         */




    }
}