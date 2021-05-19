package controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digita a nota: ");
        double nota = ler.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida!");
        } else if (nota > 8.1) {
            System.out.println("Conceito A!");
        }
        ler.close();
    }
}
