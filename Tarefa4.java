import java.util.Scanner;
public class Tarefa4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Nome1,Nome2;
        int Idade1,Idade2;
        System.out.print("Informe o primeiro nome  :");
    Nome1 = input.next();

    System.out.println("Informe a primeira idade :");
    Idade1 = input.nextInt(); 

    System.out.print("Informe o segundo  nome  :");
    Nome2 = input.next();

    System.out.println("Informe a segunda  idade :");
    Idade2 = input.nextInt();

    if (Idade1>Idade2){
        System.out.print( "Ele é o mais velho entre os dois:" + Nome1 );
        System.out.println( "Sua idade é:" + Idade1 );
    }else if (Idade2>Idade1){
        System.out.print( "Ele é o mais velho entre os dois:" + Nome2 );
        System.out.println( "Sua idade é :" + Idade2 );
    }
 }
}
