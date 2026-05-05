import java.util.Scanner;

public class calcular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double N1, N2, N3, N4, media;

        System.out.print("Digite o primeiro número: ");
        N1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        N2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        N3 = scanner.nextDouble();

        System.out.print("Digite o quarto número: ");
        N4 = scanner.nextDouble();

        media = (N1 + N2 + N3 + N4) / 4;

        System.out.print("A média dos números é: ");
        System.out.print(media);

        scanner.close();

    }
}