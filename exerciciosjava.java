import java.util.Scanner;

public class exerciciosjava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU DE EXERCÍCIOS ===");
            System.out.println("1 - Exercício de Preços");
            System.out.println("2 - Exercício de Faltas dos Alunos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    exercicioPrecos(scanner);
                    break;
                case 2:
                    exercicioFaltas(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);

        scanner.close();
    }

    public static void exercicioPrecos(Scanner scanner) {
        System.out.println("\n--- EXERCÍCIO 1: PREÇOS ---");

        System.out.print("Quantos preços você deseja informar? ");
        int quantidade = scanner.nextInt();

        double[] precos = new double[quantidade];

        preencherPrecos(scanner, precos);

        exibirResultadosPrecos(precos);
    }

    public static void preencherPrecos(Scanner scanner, double[] precos) {
        System.out.println("\nInforme os preços:");
        for(int i = 0; i < precos.length; i++) {
            System.out.print("Preço " + (i + 1) + ": R$ ");
            precos[i] = scanner.nextDouble();
        }
    }

    public static void exibirResultadosPrecos(double[] precos) {
        double menor = encontrarMenorPreco(precos);
        double maior = encontrarMaiorPreco(precos);
        double media = calcularMediaPrecos(precos);

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Menor preço: R$ " + menor);
        System.out.println("Maior preço: R$ " + maior);
        System.out.println("Média dos preços: R$ " + String.format("%.2f", media));
    }

    public static double encontrarMenorPreco(double[] precos) {
        double menor = precos[0];
        for(int i = 1; i < precos.length; i++) {
            if(precos[i] < menor) {
                menor = precos[i];
            }
        }
        return menor;
    }

    public static double encontrarMaiorPreco(double[] precos) {
        double maior = precos[0];
        for(int i = 1; i < precos.length; i++) {
            if(precos[i] > maior) {
                maior = precos[i];
            }
        }
        return maior;
    }

    public static double calcularMediaPrecos(double[] precos) {
        double soma = 0;
        for(int i = 0; i < precos.length; i++) {
            soma += precos[i];
        }
        return soma / precos.length;
    }

    public static void exercicioFaltas(Scanner scanner) {
        System.out.println("\n--- EXERCÍCIO 2: CONTROLE DE FALTAS ---");

        int[][] alunos = new int[5][2];

        preencherDadosAlunos(scanner, alunos);

        exibirSituacaoAlunos(alunos);
    }

    public static void preencherDadosAlunos(Scanner scanner, int[][] alunos) {
        System.out.println("\nPreencha os dados dos alunos:");

        for(int i = 0; i < alunos.length; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");

            System.out.print("Informe o RA: ");
            alunos[i][0] = scanner.nextInt();

            System.out.print("Informe a quantidade de faltas: ");
            alunos[i][1] = scanner.nextInt();
        }
    }

    public static void exibirSituacaoAlunos(int[][] alunos) {
        System.out.println("\n=== SITUAÇÃO DOS ALUNOS ===");
        System.out.println("----------------------------------------");

        for(int i = 0; i < alunos.length; i++) {
            int ra = alunos[i][0];
            int faltas = alunos[i][1];
            String situacao = verificarSituacao(faltas);

            System.out.println("Aluno " + (i + 1) + ":");
            System.out.println("  RA: " + ra);
            System.out.println("  Faltas: " + faltas);
            System.out.println("  Situação: " + situacao);
            System.out.println("----------------------------------------");
        }
    }

    public static String verificarSituacao(int faltas) {
        if(faltas > 20) {
            return "REPROVADO POR FALTA";
        } else {
            return "APROVADO";
        }
    }
}