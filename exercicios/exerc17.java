import java.util.Scanner;

public class exerc17{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String nome;
        double horas;
        double valor;
        String mes;

        System.out.println("A qual mes se refere: ");
        mes = s.nextLine();
        
        System.out.println("Informe seu nome: ");
        nome= s.nextLine();

        System.out.println("Informe as horas trabalhadas: ");
        horas = s.nextDouble();

        System.out.println("Informe o valor ganho por hora trabalhada: ");
        valor = s.nextDouble();
        
        double salario;

        if (horas <= 200){
            salario = horas * valor;
        } 
        else {
            double horasnormais = 200;
            double horasextra = horas - 200;
            double valorextra = valor * 1.5;

            salario = (horasnormais * valor) + (horasextra * valorextra);
        }
     
        System.out.println("O funcionario: " + nome + "\n" + "Trabalhou: " + horas + " horas" + "\n" + "No mes de: " + mes + "\n" + "Por: " + valor + " R$ a hora" + "\n" + "E recebeu: " + salario + " R$");

    }
}