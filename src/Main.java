
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float valor1;
        float valor2;
        float valor3;
        float MediaArit;

        Scanner scan = new Scanner(System.in);
        System.out.println("Olá, vamos calcular a média aritmética de três números \n e ver qual o maior e menor valor");

        System.out.println("Digite o primeiro número");
        valor1 = scan.nextFloat();

        System.out.println("Digite o segundo número");
        valor2 = scan.nextFloat();

        System.out.println("Digite o terceiro número");
        valor3 = scan.nextFloat();

        MediaArit = (float) ((valor1 + valor2 + valor3)/3.0);

        System.out.println("A média Aritmética é " + MediaArit + "\n");

        if(valor1 > valor2 && valor1 > valor3){
            System.out.println("O maior número é o primeiro\n");
        } else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O maior número é o segundo\n");
        } else if (valor3 > valor1 && valor3 > valor2) {
            System.out.println("O maior número é o terceiro\n");
        } else {
            System.out.println("Dois ou três números maiores são iguais\n");
        }

        if (valor1 < valor2 && valor1 < valor3) {
            System.out.println("O menor número é o primeiro");
        } else if (valor2 < valor1 && valor2 < valor3) {
            System.out.println("O menor número é o segundo");
        } else if (valor3 < valor1 && valor3 < valor2) {
            System.out.println("O menor número é o terceiro");
        } else {
            System.out.println("Dois ou três números menores são iguais");
        }

    }

} // Os meus erros no início foi ter confundido ||(or) e &&(and) , por isto meu código dava erro
//e não saber declarar a MediaArit de um Float. Como não pedia no enunciado da questão,
// eu não coloquei a opção de 2 ou 3 números separados.