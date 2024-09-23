import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro");
        int parametroUm = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro");
        int parametroDois = entrada.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Imprimir a mensagem de erro
            System.out.println("O segundo número deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validação parâmetro
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        // Contar de parametroUm até parametroDois
        for (int contador = parametroUm; contador < parametroDois; contador++) {
            System.out.println("Contagem: " + contador);
        }
    }
}

// Classe de exceção
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        System.out.println("O primeiro número deve ser maior que o segundo");
    }
}
