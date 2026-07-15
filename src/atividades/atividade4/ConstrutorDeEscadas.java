package atividades.atividade4;

public class ConstrutorDeEscadas {

    public static void main(String[] args) {

        desenharEscada(4, '#');
    }

    public static void desenharEscada(int degraus, char simbolo) {

        for (int linha = 1; linha <= degraus; linha++) {


            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(simbolo);
            }


            System.out.println();
        }
    }
}
