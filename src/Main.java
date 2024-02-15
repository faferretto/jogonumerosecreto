import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int numeroInput = -2;
        int i = 0;
        boolean desistiu = false;
        while (numeroInput != numeroSecreto) {
            System.out.println("Digite um número entre 0 e 100, para desistir digite -1: ");
            numeroInput = leitura.nextInt();
            if (numeroInput == -1) {
                desistiu = true;
                break;
            } else {
                i++;
                if (numeroInput < numeroSecreto) {
                    System.out.println("O número secreto é maior que " + numeroInput);
                }
                if (numeroInput > numeroSecreto) {
                    System.out.println("O número secreto é menor que " + numeroInput);
                }
            }
        }
        if (!desistiu)  {
            System.out.println("Você acertou o número secreto " + numeroSecreto + " com " + i + " tentativas!!!!");
        } else {
            System.out.println("Você desistiu após " + i + " tentativas, o número secreto era " + numeroSecreto);
        }
    }
}