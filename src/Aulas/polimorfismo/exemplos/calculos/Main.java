package Aulas.polimorfismo.exemplos.calculos;

public class Main {
    public static void main(String[] args) {
        Calculos calculos = new Calculos();

        System.out.println(calculos.soma(1, 1));
        System.out.println(calculos.soma(1.0,1.0));
        calculos.soma(1.0,1);
        calculos.soma(1,1.0);
    }
}