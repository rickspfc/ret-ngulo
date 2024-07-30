package je03_retangulo;
import java.util.Scanner;
public class retangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        System.out.println("Digite a base do retângulo: ");
        double base = sc.nextDouble();

        double area = base * altura / 2;
        double perimetro = 2 * (altura + base);

        System.out.printf("A área do retângulo é: %.2f%n ", area);
        System.out.printf("O perímetro do retângulo é: %.2f%n ", perimetro);
    }
}
