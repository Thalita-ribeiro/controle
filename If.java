package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a média: ");
        double media = ler.nextDouble();

        if(media >= 7.0 ){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }

        ler.close();
    }
}
