import java.util.Scanner;
public class MediaDeNotas {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, n2, media;
    
        System.out.println( "informe o valor da primeira nota:");
        n1 = input.nextInt();
    
        System.out.println ("Informe o valor da segunda nota:");
        n2 = input.nextInt();
    
        media = (n1 + n2)  /2;
    
        System.out.printf("Sua primeira nota foi =" + n1);
        System.out.printf(" \n Sua segunda nota foi =" + n2);
        System.out.printf(" \n Sua média é foi = " + media + "\n");
    
    
    
    
    }
    
    
    }