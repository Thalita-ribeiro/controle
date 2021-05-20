package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String coisa = "";
        while (!coisa.equalsIgnoreCase("sair")) {
            System.out.println("Digite alguma coisa: ");
            coisa = ler.next();
        }

        ler.close();
    }
}
