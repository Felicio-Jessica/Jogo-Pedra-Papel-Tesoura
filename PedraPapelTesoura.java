import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        while (true) {
            System.out.println("Escolha uma opção (Pedra, Papel, Tesoura). Para sair digite 'sair': ");
            String escolhaUsuario = scanner.nextLine();

            if (escolhaUsuario.equalsIgnoreCase("sair")) {
                break;
            }

            if (!escolhaUsuario.equalsIgnoreCase("Pedra") &&
                    !escolhaUsuario.equalsIgnoreCase("Papel") &&
                    !escolhaUsuario.equalsIgnoreCase("Tesoura")) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            int escolhaComputadorIndex = random.nextInt(3);
            String escolhaComputador = opcoes[escolhaComputadorIndex];

            System.out.println("Computador escolheu: " + escolhaComputador);

            if (escolhaUsuario.equalsIgnoreCase(escolhaComputador)) {
                System.out.println("Empate!");
            } else if ((escolhaUsuario.equalsIgnoreCase("Pedra") && escolhaComputador.equals("Tesoura")) ||
                    (escolhaUsuario.equalsIgnoreCase("Papel") && escolhaComputador.equals("Pedra")) ||
                    (escolhaUsuario.equalsIgnoreCase("Tesoura") && escolhaComputador.equals("Papel"))) {
                System.out.println("Você ganhou!");
            } else {
                System.out.println("Você perdeu!");
            }
        }

        scanner.close();
    }
}