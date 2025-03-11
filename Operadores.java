public class Operadores {
    public static void main(String[] args) {

        // Testando a concatenação
        String nomeCompleto = "JOSÉ" + "VINÍCIUS";

        System.out.println(nomeCompleto);

        // Teste de concatenação + utilizando o debug
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao); // "31"

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao); // "1111"

        concatenacao = 1 + "1" + 1 + "1"; // "1111"

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1; // "1111"

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1); // "13"

        System.out.println(concatenacao);

        // Trabalhando com unários

        int numero = 5;

        System.out.println(- numero); // "-5" (isso não significa dizer que essa nossa variável ficou negativa)

        System.out.println(numero); // "5"

        // Para fazer de maneira correta:

        numero = - numero;
        System.out.println(numero); // "-5"

        // Deixando o número positivo novamente:

        numero = numero * -1; // Essa é a forma correta, pois se usássemos "+ numero" o resultado ainda seria "-5"
        System.out.println(numero); // "5"

        // Utilizando Operadores unários

        int numero_ = 5;

        numero_++; // acrescenta +1 ao valor da variável

        System.out.println(numero_); // “6”

        numero_--; //decrementa -1 ao valor da variável

        System.out.println(numero_); // “5”

        // Utilizando Operador ternário

        // Representando um código simples em sistema condicional
        int a, b;

        a = 5;
        b = 6;

        String resultado = "";

        if (a == b) {
            resultado = "verdadeiro”;
        } else {
            resultado = "falso”;
        }

        System.out.println(resultado); // "falso"

        // Operador ternário

        resultado = a == b ? "Verdadeiro" : "Falso";

        System.out.println(resultado); // "Falso"

        // Utilizando Operadores relacionais

        int x = 1;
        int y = 2;

        if (x < y) {
            System.out.println("a nossa condição é verdadeira"); // Irá printar.
        }

        boolean simNao = x == y; // Usando ==

        System.out.println("x é IGUAL a y? " + simNao); // "false"

        simNao = x != y; // Usando !=

        System.out.println("x é DIFERENTE de y? " + simNao); // "true"

        simNao = x > y; // Usamdo >

        System.out.println("x é MAIOR QUE y? " + simNao); // "false"

        simNao = x < y; // Usando <

        System.out.println("x é MENOR QUE y? " + simNao); // "true"

        simNao = x >= y; // Usando >=

        System.out.println("x é MAIOR OU IGUAL a y? " + simNao); // "false"

        simNao = x <= y; // Usando <=

        System.out.println("x é MENOR OU IGUAL a y? " + simNao); // "true"

        String nomeUm = "VINICIUS";
        String nomeDois = new String ("VINICIUS");

        System.out.println(nomeUm.equals(nomeDois)); // Deve-se usar o método equals para comparar objetos, esse método compara conteúdos

        // Usando Operadores lógicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao1) { // Utlizando "E"
            System.out.println("Ambas são verdadeiras");
        }
        else if (condicao1 || condicao2) { // Utilizando "OU"
            System.out.println("Uma delas é verdadeira");
        }
    }
}
