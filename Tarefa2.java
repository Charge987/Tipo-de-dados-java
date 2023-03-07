import java.util.Scanner;
public class Tarefa2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double P,A, IMC;


    System.out.println("Informe sua Altura  :");
    A = input.nextDouble();

    System.out.println("Informe seu Peso :");
    P = input.nextDouble();

    IMC = P / ( A * A);

    if( IMC <= 18.5 )
        {
        System.out.print( "Abaixo do Peso");
        }
        else if( IMC >=18.5  && IMC <=24.9){
            System.out.print(  "Peso Normal");
        }
        else if( IMC >=25.0 && IMC <= 29.9){
            System.out.print(  "Sobrepeso");
        }
        else if( IMC >=30.0 && IMC <= 34.9){
            System.out.print(  "Obesidade grau 1");
        }
        else if( IMC >=35.0 && IMC <= 39.9){
            System.out.print(  "Obesidade grau 2");
        } else{
        System.out.print(  "Obesidade grau 3");
        }


    }         
}
