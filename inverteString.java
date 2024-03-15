import java.util.Scanner;

public class inverteString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = "";
        String textoInvertido = "";
        System.out.println("Digite um texto: ");
        texto = sc.nextLine();
        if (texto.length() == 0) {
            System.out.println("Texto invalido!");
            return;
        } else {
            for (int i = texto.length() - 1; i >= 0; i--) {
                textoInvertido += texto.charAt(i);
            }
            System.out.println("O texto invertido eh: " + textoInvertido);      
        }
        
    }
}