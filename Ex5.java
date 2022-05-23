import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        int opcao, opcaosoma, cont1, cont2, numerosoma, numero1, numero2, numeromult, opcaomult, conts, contm;
        cont1 = 0;
        cont2 = 0;
        conts = 0;
        contm = 0;
        numerosoma = 0;
        numeromult = 1;
        Scanner leitor = new Scanner(System.in);
        do{
            System.out.println("Selecione uma opcao\n1-Somar varios numero\n2-Multiplicar varios numero\n3-Sair");
        opcao = leitor.nextInt();
        if (opcao == 1){
            conts = conts + 1;
            System.out.println("Quantos numero voce deseja somar?");
            opcaosoma = leitor.nextInt();
            do{
                cont1 = cont1 + 1;
                System.out.println("Digite um numero para somar");
                numero1 = leitor.nextInt();
                numerosoma = numerosoma + numero1;
            }while(cont1 != opcaosoma);
            System.out.println("A soma e " + numerosoma);
            cont1 = cont1 * 0;
            numerosoma = numerosoma * 0;
            }else if (opcao == 2){
                contm = contm + 1;
            System.out.println("Quantos numero voce deseja multiplicar?");
            opcaomult = leitor.nextInt();
            do{
                cont2 = cont2 + 1;
                System.out.println("Digite um numero para multiplicar");
                numero2 = leitor.nextInt();
                numeromult = numeromult * numero2;
            }while(cont2 != opcaomult);
            System.out.println("A multiplicacao e " + numeromult);
            cont2 = cont2 * 0;
            numeromult = (numeromult * 0) + 1;
            }
        }while (opcao != 3);
        System.out.println("Voce utilizou a ferramenta de soma " + conts + " vezes e a de multiplicacao " + contm + " vezes.");
    }   
}