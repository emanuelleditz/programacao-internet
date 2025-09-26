import java.util.Scanner;   //importar a biblioteca java

public class exerc18 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //pedir um número e exibir a tabuada desse número do 1 ao 10
        //divisão de um problema em partes: 
        //passo 1: definir as variáveis e seus tipos
        //passo 2: obter os valores para as variáveis(pedir ao usuário ou informar)
        //passo 3: calculos necessários
        //passo 4: mostrar os resultados
        int num;

        System.out.print("Informe um número para calcular a tabuada: ");
        num = s.nextInt();

        System.out.println("Tabuada do  " + num + ": ");        
        for(int i = 1; i <= 10; i++){ //++ pega o valor de i e adiciona +1      //laço de repetição: repetir, condição: verdadeiro para ingressar no laço
            System.out.println(num + " X " + i + " = " + (num*i));  //num*i : tabuada
        }

        //exemplo usando pintf: 
        System.out.println("Tabuada do  " + num + ": ");        
        for(int i = 1; i <= 10; i++){ 
            System.out.printf("%d X %d = %d\n",num, i, (num*i));  //print f: usa virgula ao inves de +, ele é função q aceita varios parametros, passa um unico texto
                                                                      //e marca onde quer que exiba os valores 
        }

    }
}
