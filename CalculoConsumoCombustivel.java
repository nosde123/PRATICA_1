import java.util.Scanner;

public class CalculoConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempoViagem = scanner.nextDouble();

        System.out.print("Digite a velocidade média (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        System.out.print("Digite o valor de km por litro do veículo: ");
        double kmPorLitro = scanner.nextDouble();

        double distanciaPercorrida = tempoViagem * velocidadeMedia;
        double consumoCombustivel = distanciaPercorrida / kmPorLitro;

        System.out.println("Distância percorrida: " + distanciaPercorrida + " km");
        System.out.println("Consumo de combustível: " + consumoCombustivel + " litros");

        scanner.close();
    }
}
