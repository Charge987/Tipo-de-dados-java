import java.util.Scanner;
public class Tarefa3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double M,CM; 

        System.out.println("Informe o numero   :");
    M = input.nextDouble();

    CM = M * 100;

    System.out.print("  Seu numero é   :" + CM );
    }

}