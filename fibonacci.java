import java.util.Scanner;

public class fibonacci {
// cria funcao para verificar se um numero eh quadrado perfeito, necessário para a formula de binet
    private static double quadradoPerfeito(double n) {
        double raiz = Math.sqrt(n);
        double ehQuadrado = raiz * raiz; 
            if (ehQuadrado == n) {
                return n;
            } else {
                return 0;
            }
    }
    // cria funcao para verificar se um numero eh fibonacci, atraves da formula de binet
    private static boolean ehFibonacci(double n) {
        double a = 5 * n * n + 4;
        double b = 5 * n * n - 4;
        if (quadradoPerfeito((double) a) > 0 || quadradoPerfeito((double) b) > 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        //gera na tela a pergunta para o usuario digitar um numero
        System.out.println(" Descubra se um numero faz parte da sequencia de fibonacci!!");
        System.out.println("digite um numero entre 2 e 2000: ");
        x = sc.nextInt();
        //verifica se o numero digitado eh valido
        if (x < 2 || x > 2000) {
            System.out.println("numero invalido");
        } else {
            // aplica a funcao ehFibonacci para o numero digitado
            if (ehFibonacci(x)) {
                System.out.println("O numero " + x + " faz parte da sequencia de fibonacci");
            } else {
                System.out.println("O numero " + x + " nao faz parte da sequencia de fibonacci");

            }
        }
        
    }
}