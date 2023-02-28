import java.util.Scanner;
public class Treinamento2 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String nome;
    int idade;

    System.out.println("Informe o nome  :");
    nome = input.next();

    System.out.println("Informe a idade :");
    idade = input.nextInt();

        if(idade >=0 && idade <=12){
            System.out.print( "Criança");
        }else if (idade >= 13 && idade <=17){
            System.out.print( "Adolescente");
        }else if ( idade >=18 &&  idade <=59){
            System.out.print( "Adulto");
        }else
        System.out.print( "Idoso");
    }

}    