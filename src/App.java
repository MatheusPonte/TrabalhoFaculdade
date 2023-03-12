import java.util.Scanner;

import entities.Festa;
import entities.Local;

import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Digite CPF do Responsavel: ");

        String cpf = sc.nextLine();

        boolean cpfIsValid = Festa.validarCPF(cpf);
        if(cpfIsValid == false){
            cpf = Festa.formatarCPf(cpf);
        }

        System.out.println(cpf);

        System.out.print("Digite quantidade de pessoas: ");
        int quantidade = sc.nextInt();
        System.out.print("quanto pretende gastar: ");
        double custo = sc.nextDouble();

        Festa festa = new Festa(cpf, quantidade, custo);

        System.out.print("Digite largura: ");
        double largura = sc.nextDouble();
        System.out.print("Digite comprimento: ");
        double comprimento = sc.nextDouble();

        Local local = new Local(largura, comprimento);

         festa.mostrar();
         local.mostrar();

        System.out.println("Tipo da festa: " + festa.classifcar());
        System.out.println("é possivel realizar a festa nesse local?: " + festa.possivelLocal(local));

    }
}
