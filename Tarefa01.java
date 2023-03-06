import java.util.Scanner;
public class Salario {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double SalA, SalN;
       
        System.out.println("Informe o Salario :");
        SalA = input.nextDouble();
        
        if ( SalA >= 1000 && SalA <= 2000)
        {
            SalN = SalA * 1.15;
System.out.print( "Seu novo salário é"+SalN);
        }else if ( SalA >= 2000 && SalA <= 3000)
        {
            SalN = SalA * 1.10;
System.out.print( "Seu novo salário é"+ SalN);
        }else {SalN = SalA * 1.05;
            System.out.print( "Seu novo salário é"+ SalN);
        }
        
}
}