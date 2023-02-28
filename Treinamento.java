import java.util.Scanner;
public class Treinamento {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1;
        System.out.println("Informe o numero :");
        n1 = input.nextInt();
        
        if (n1 > 0){
            System.out.print( "Seu numero é positivo");
        } else if( n1 < 0)
            {
                System.out.print( "Seu numero é negativo");
            } else
            {
                    System.out.print( "Seu numero é zero ");
            } 

        }   
    }
 
