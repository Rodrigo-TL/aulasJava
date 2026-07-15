package atividades.atividade4;

public class sistemaCorrigido {

    public static void main(String[] args) {

        // ERRO 1: Nome de variável não pode começar com número (1valor).
        // COMO ARRUMEI: Mudei o nome para valor1.

        int valor1 = 10;

        // ERRO 2: Faltava o ponto e vírgula (;) no final da linha.
        // COMO ARRUMEI: Coloquei o ; no fim do comando.

        int contador = 5;

        // ERRO 3: O método pedia um texto e um número, mas só mandaram o texto.
        // COMO ARRUMEI: Adicionei o número 1 para dizer quantas vezes o texto vai repetir.

        exibirMensagens("Bem-vindo ao sistema!", 1);

        while (contador > 0) {
            System.out.println("Iniciando em: " + contador);

            // ERRO 4: O código ia ficar rodando para sempre (loop infinito).
            // COMO ARRUMEI: Coloquei "contador--" para diminuir o número até chegar a zero e parar.
            contador--;
        }
    }

    // ERRO 5: O método estava fora da classe por causa de chaves erradas e faltava a palavra "static".
    // COMO ARRUMEI: Ajustei as chaves e coloquei "static" para o método main conseguir usar ele.

    public static void exibirMensagens(String texto, int repeticoes) {

        for (int i = 0; i < repeticoes; i++) {

            System.out.println(texto);
        }
    }
}
