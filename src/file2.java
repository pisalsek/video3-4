import java.text.DecimalFormat;
import java.util.Scanner;

public class file2 {
    public static void main(String[] args){

        int new_Index , old_Index;

        Scanner cin=new Scanner(System.in);
        System.out.print("Enter new_Index Is : ");
            new_Index = cin.nextInt();
        System.out.print("Enter old_Index Is : ");
            old_Index = cin.nextInt();

            if (new_Index >= old_Index){
                double payment;
                int consumption;
                consumption=new_Index-old_Index;

                 if (consumption<=50)
                    payment=consumption*350;

                else if (consumption<=150)
                    payment=consumption*650;

                else
                    payment = consumption*950;
                System.out.println("==============");
                DecimalFormat df=new DecimalFormat("0.0");
                System.out.println("Consumption Is : "+df.format(consumption)+"Kw");
                System.out.println("Payment : "+df.format(payment)+"R");

            }else
                System.out.println("Invalited Input");





























    }
}
