import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int numeroinput = -2;
        int tentativa = 0;
        boolean desistiu = false;
        while (numeroinput != numeroSecreto) {
            System.out.println("Digite um numero entre 0 e 100, para desistir digite -1: ");
            numeroinput = leitura.nextInt();
            if (numeroinput == -1) {
                desistiu = true;
                break;
            } else {
                tentativa ++;
                if (numeroinput < numeroSecreto) {
                    System.out.println("O número secreto é maior que " + numeroinput);
                }
                if (numeroinput > numeroSecreto) {
                    System.out.println("O número secreto é menor que " + numeroinput);
                }
            }
        }
        if (!desistiu)  {
            System.out.println("Voce acertou o número secreto " + numeroSecreto + " com " + tentativa + " tentativas!!!!");
        } else {
            System.out.println("Você desistiu após " + tentativa + " tentativas, o número secreto era " + numeroSecreto);
        }
    }
}