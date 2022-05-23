import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade, idade50, peso40, quantidade, peso;
        double altura, mediaa, altura1, altura2, mediap;
        idade50 = 0;
        peso40 = 0;
        quantidade = 0;
        altura1 = 0;
        altura2 = 0;
        do{
            System.out.println("Digite sua idade");
            idade = leitor.nextInt();
            if (idade == 0){
                System.out.println("Programa encerrado");
            }else{
                quantidade = quantidade + 1;
                System.out.println("Digite seu peso");
                peso = leitor.nextInt();
                System.out.println("Digite sua altura");
                altura = leitor.nextDouble();
            if (idade >= 50){
                idade50 = idade50 + 1;
            }else if (idade >= 10 && idade <= 20){
                altura1 = altura1 + 1;
                altura2 = altura2 + altura;
            }else if(peso < 40){
                peso40 = (peso40 + 1);
            }
            }
        }while(idade != 0);
        mediap = (peso40 * 1.0 / quantidade * 100);
        mediaa = altura2 / altura1;
        System.out.println("A quantidade de pessoas com mais de 50 anos e de " + idade50);
        System.out.println("O percentual de pessoas que possue o peso abaixo de 40 e de " + mediap + "%");
        System.out.println("A media das alturas das pessoas entre 10 e 20 anos e de " + mediaa);
    }
}    