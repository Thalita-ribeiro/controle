package controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um dia da semana:");
        String diaDaSemana = ler.next();

        if ("sabado".equalsIgnoreCase(diaDaSemana.toLowerCase())) {
            System.out.println("1");
        } else if ("Segunda".equalsIgnoreCase(diaDaSemana)) {
            System.out.println("2");
        } else if ("terça".equalsIgnoreCase(diaDaSemana) || "terca".equalsIgnoreCase(diaDaSemana)) {
            System.out.println("3");
        } else if ("quanta".equalsIgnoreCase(diaDaSemana)) {
            System.out.println("4");
        } else if ("quinta".equalsIgnoreCase(diaDaSemana)) {
            System.out.println("5");
        } else if ("sexta".equalsIgnoreCase(diaDaSemana)) {
            System.out.println("6");
        } else if ("sabado".equalsIgnoreCase(diaDaSemana)) {
            System.out.println("7");
        } else {
            System.out.println("Dia inválido!");
        }
        ler.close();
    }
}
