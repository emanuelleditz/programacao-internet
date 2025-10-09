import java.util.Scanner;

public class listadeexercios {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String opçao = "";

        while (!opçao.equals("0")) {
            System.out.println("===== MENU DE EXERCÍCIOS =====");
            System.out.println("1 - Comparar dois números inteiros");
            System.out.println("2 - Comparar se é par ou ímpar");
            System.out.println("3 - Consumo médio da água");
            System.out.println("4 - Potência ou raiz");
            System.out.println("5 - Lados de um triângulo");
            System.out.println("6 - Peso Ideal");
            System.out.println("7 - Já tem idade para votar e tirar habilitação?");
            System.out.println("8 - Qual sua categoria de nadador?");
            System.out.println("9 - Números pares");
            System.out.println("10 - Advinhe o número");
            System.out.println("11 - Sortear número entre 10-29");
            System.out.println("12 - Ordenar 3 números");
            System.out.println("13 - Contar vogais e consoantes");
            System.out.println("14 - Validador de senha");
            System.out.println("15 - Função cálculo com retorno");
            System.out.println("0 - Sair");
            System.out.println("==============================");
            opçao = s.nextLine();

            switch (opçao) {
                case "1":
                    exerc1(s);
                    break;
                case "2":
                    exerc2(s);
                    break;
                case "3":
                    exerc3(s);
                    break;
                case "4":
                    exerc4(s);
                    break;
                case "5":
                    exerc5(s);
                    break;
                case "6":
                    exerc6(s);
                    break;
                case "7":
                    exerc7(s);
                    break;
                case "8":
                    exerc8(s);
                    break;
                case "9":
                    exerc9(s);
                    break;
                case "10":
                    exerc10(s);
                    break;
                case "11":
                    exerc11(s);
                    break;
                case "12":
                    exerc12(s);
                    break;
                case "13":
                    exerc13(s);
                    break;
                case "14":
                    exerc14(s);
                    break;
                case "15":
                    exerc15(s);
                    break;
                case "0":
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    public static void exerc1(Scanner s){
       int valor1, valor2;

        System.out.println("Informe o primeiro número: ");
        valor1 = s.nextInt();

        System.out.println("Informe o segundo número: ");
        valor2 = s.nextInt();
        s.nextLine();

        if(valor1 > valor2){
            System.out.println("O valor 1 é maior que valor 2! ");
        } else if(valor1 < valor2){
            System.out.println("O Valor 2 é maior que valor 1! ");
        } else{
            System.out.println("Os valores são iguais! ");
        }
    }

    public static void exerc2(Scanner s){
        int valor1;

        System.out.println("Informe um número: ");
        valor1 = s.nextInt();
        s.nextLine();

        if(valor1 %2 == 0){
            System.out.println("É par!");
        }else{
            System.out.println("É ímpar!");
        }
    }

    public static void exerc3(Scanner s){
        double leituradia1;
        double leituradia30;
        double mediapordia;

        System.out.println("Informe a leitura do 1° dia: ");
        leituradia1 = s.nextDouble();
        System.out.println("Informe a leitura do 30° dia: ");
        leituradia30 = s.nextDouble();
        s.nextLine();

        mediapordia = (leituradia30 - leituradia1) /30;
        System.out.println("A média por dia é: " + mediapordia);
    }

    public static void exerc4(Scanner s){
        int valor1;
        double resultado;

        System.out.println("Digite um número inteiro: ");
        valor1 = s.nextInt();
        s.nextLine();

        if(valor1 > 10 && valor1 < 100){
            resultado = Math.pow(valor1,2);
            System.out.println("Resultado da potência: " + resultado);
        }else{
            resultado = Math.sqrt(valor1);
            System.out.println("Resultado da raiz quadrada: " + resultado);
        }
    
    }

    public static void exerc5(Scanner s){
        System.out.println("Dado os tres valores, A, B e C, verificar se eles podem ser os comprimentos dos lados de um triangulo, se forem,");
        System.out.println("verificar se compoem um triangulo equilatero, isosceles ou escaleno.\n");

        System.out.print("Digite o valor do lado A: ");
        double A = s.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double B = s.nextDouble();

         System.out.print("Digite o valor do lado C: ");
         double C = s.nextDouble();

         if (A < B + C && B < A + C && C < A + B) {
         if (A == B && B == C) {
            System.out.println("Triângulo Equilátero: três lados iguais.");
         } else if (A == B && A == C && B == C) {
            System.out.println("Triângulo Isosceles: dois lados iguais.");
         } else {
            System.out.println("Triângulo Escaleno: todos os lados diferentes.");
         }
         } else {
         System.out.println("Os valores informados NAO formam um triângulo.");
         }

    }

    public static void exerc6(Scanner s) {
        System.out.println("Calcular Peso Ideal ");
        System.out.print("Digite sua altura: ");
        double altura = s.nextDouble();
        
        System.out.print("Digite seu peso atual: ");
        double pesoAtual = s.nextDouble();
        s.nextLine();
        
        System.out.print("Digite seu sexo (M para masculino, F para feminino): ");
        String sexo = s.nextLine().toUpperCase();
        
        double pesoIdeal;
        
        if (sexo.equals("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equals("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido! Use M ou F.");
            return;
        }
        
        double diferenca = pesoAtual - pesoIdeal;
        
        if (pesoAtual < pesoIdeal) {
            System.out.printf("Você está abaixo do peso ideal: "+ Math.abs(diferenca));
        } else if (pesoAtual > pesoIdeal) {
            System.out.printf("Você está acima do peso ideal" + diferenca);
        } else {
            System.out.println("Você está no peso ideal!");
        }
    }

    public static void exerc7(Scanner s){
        int anodenascimento;

        System.out.println("Informe seu ano de nascimento: ");
        anodenascimento = s.nextInt();
        s.nextLine();

        if((2025 - anodenascimento) >= 18){
            System.out.println("Já pode votar e tirar habilitação! ");
        } else if ((2025 - anodenascimento) >=16) {
            System.out.println("Já pode votar! ");
        } else{
            System.out.println("Não pode votar e nem tirar habilitação! ");
        }
    }

    public static void exerc8(Scanner s){
        int idade;

        System.out.println("Informe sua idade: ");
        idade = s.nextInt();
        s.nextLine();

        
        if(idade >= 5 && idade <=7){
            System.out.println("Infantil A ");
        } else if (idade >= 8 && idade <=10) {
            System.out.println("Infantil B ");
        } else if (idade >= 11 && idade <=13){
            System.out.println("Juvenil A ");
        } else if (idade >= 14 && idade <=17){
            System.out.println("Juvenil B ");
        } else if(idade >=18){
            System.out.println("Adulto ");
        } else{
            System.out.println("Não pode participar das categorias!");
        }
    }

    public static void exerc9(Scanner s){
          int soma=0, num_digitado = -1;

        while (num_digitado != 0){
            System.out.println("Informe um número (informe 0 para sair): ");
            num_digitado = s.nextInt();
            
            if(num_digitado >=0 && num_digitado <=100){
                if(num_digitado ==0){

                }else if(num_digitado % 2 == 0){
                    soma += num_digitado;
                    System.out.println("Número somado!");
                }else{
                    System.out.println("Número não somado!");
                }
            }else{
                System.out.println("Número fora do intervalo esperado (0 - 100)! ");
            }
                    }
        System.out.println("Resultado: Soma dos valores pares é: " + soma);
        s.nextLine();
    }
    
    public static void exerc10(Scanner s){
        int numerosorteado = (int) (Math.random() * 10) +1; 
        int chute;
        boolean acertou = false;

        System.out.println("Tente acertar o número que eu estou pensando de 1 à 10: ");

        do { 
            System.out.println("Dê o seu chute: ");
            chute = s.nextInt();

            if(chute < numerosorteado){
                System.out.println("Está baixo");
            } else if (chute > numerosorteado) {
                System.out.println("Está alto");
            } else{
                System.out.println("Você acertou! O número era: " + numerosorteado);
                acertou = true;
            }
        } while (!acertou);
      
        s.nextLine();
    }

    public static void exerc11(Scanner s) {     
        int numero;
        
        do {
            System.out.print("Digite um número entre 10 e 29 (ou 9 para sair): ");
            numero = s.nextInt();
            
            if (numero == 9) {
                System.out.println("Encerrando jogo...");
                break;
            }
            
            if (numero < 10 || numero > 29) {
                System.out.println("Número inválido! Digite apenas entre 10 e 29.");
                continue;
            }
            
            int numeroSorteado = (int) (Math.random() * 20) + 10;
            
            System.out.println("Número sorteado: " + numeroSorteado);
            
            if (numero == numeroSorteado) {
                System.out.println("PARABÉNS! Você acertou!");
            } else {
                System.out.println("QUE PENA. Não foi desta vez. Tente novamente!");
            }
            
        } while (numero != 9);
        
        s.nextLine();
    }

    public static void exerc12(Scanner s) {
        System.out.println("Ordenar 3 Números");
        
        System.out.print("Digite o primeiro número: ");
        int num1 = s.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = s.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int num3 = s.nextInt();
        s.nextLine();
        
        System.out.print("Deseja ordenar em ordem (C)rescente ou (D)ecrescente? ");
        String ordem = s.nextLine().toUpperCase();
        

        int temp;
        int[] numeros = {num1, num2, num3};
        
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (ordem.equals("C")) {
                    if (numeros[j] > numeros[j + 1]) {
                        temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                } else if (ordem.equals("D")) {
                    if (numeros[j] < numeros[j + 1]) {
                        temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }
        }
        
        System.out.println("Números ordenados: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }

    public static void exerc13(Scanner s) {
        System.out.println("Contar Vogais e Consoantes");
        
        System.out.print("Digite uma palavra ou frase: ");
        String texto = s.nextLine().toLowerCase();
        
        int vogais = 0;
        int consoantes = 0;
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            
            if (c == ' ') {
                continue;
            }

            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }
        
        System.out.println("Total de vogais: " + vogais);
        System.out.println("Total de consoantes: " + consoantes);
    }

    public static void exerc14(Scanner s) {
        System.out.println("Validador de Senha");
        
        System.out.print("Digite seu nome: ");
        String nome = s.nextLine().toLowerCase();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = s.nextLine().toLowerCase();
        
        System.out.print("Digite a senha a ser validada: ");
        String senha = s.nextLine();
        
        boolean valida = true;
        String resultado = "";
        
        if (senha.length() < 8) {
            valida = false;
            resultado = "A senha deve ter no mínimo 8 caracteres.";
        }
        
        if (valida && !senha.contains("@") && !senha.contains("!") && !senha.contains("#")) {
            valida = false;
            resultado = "A senha deve conter pelo menos um dos caracteres: @, ! ou #";
        }
        
        if (valida && senha.length() > 0) {
            char primeiroCarSenha = Character.toLowerCase(senha.charAt(0));
            char primeiroCarNome = nome.charAt(0);
            char primeiroCarSobrenome = sobrenome.charAt(0);
            
            if (primeiroCarSenha == primeiroCarNome || primeiroCarSenha == primeiroCarSobrenome) {
                valida = false;
                resultado = "O primeiro caractere da senha não pode ser igual ao primeiro do nome ou sobrenome.";
            }
        }
        
        String senhaLower = senha.toLowerCase();
        if (valida && (senhaLower.contains(nome) || senhaLower.contains(sobrenome))) {
            valida = false;
            resultado = "A senha não pode conter o nome ou sobrenome completo.";
        }
        
        if (valida) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha Inválida: " + resultado);
        }
    }

    public static void exerc15(Scanner s) {
        
        System.out.print("Digite o primeiro número: ");
        double num1 = s.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = s.nextDouble();
        s.nextLine();
        
        double resultado;

        if (num1 > num2) {
            resultado = num1 * num2; 
        } else if (num1 < num2) {
            resultado = num1 / num2; 
        } else {
            resultado = num1 + num2;
        }
        
        if (num1 > num2) {
            System.out.println("Multiplicação " + resultado);
        } else if (num1 < num2) {
            System.out.println("Divisão " + resultado);
        } else {
            System.out.println("Soma " + resultado);
        }
    }
}