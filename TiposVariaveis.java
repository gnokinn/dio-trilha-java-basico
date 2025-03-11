public class TiposVariaveis {
    public static void main(String[] args) {
        //tipos primitivos



        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        /* forma errada:
        short numeroCurto2 = numeroNormal; */
        short numeroCurto2 = (short) numeroNormal; //forma correta

        int numero = 5;

        numero = 10; //variável sofre alteração

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14; //constante que nunca pode ser auterada


    }
}
