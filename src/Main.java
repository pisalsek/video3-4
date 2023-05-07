import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float p1f, p2f, p3f;
        Scanner cin = new Scanner(System.in);
        System.out.print("Input Value Of p1 is : ");
        p1f = cin.nextFloat();
        System.out.print("Input Value Of p2 is : ");
        p2f = cin.nextFloat();
        System.out.print("Input Value Of p3 is : ");
        p3f = cin.nextFloat();
        if (p1f >= 0 && p2f >= 0 && p3f >= 0) {
            double total, disPrice, payment;
            int ticket, dis;
            total = p1f + p2f + p3f;
                if (total < 1)
                    dis = 0;
                else if (total <= 50)
                    dis = 5;
                else if (total <= 150)
                    dis = 10;
                else
                    dis = 15;
                        disPrice=total*dis/100;
                        payment=total-disPrice;
                        ticket=(int)total/10;
                        System.out.println("=====================");
                        System.out.println("Total Is : "+total);
                        System.out.println("Your Discount Is : "+dis+("%"));
                        System.out.println("DisPrice Is : "+disPrice+("$"));
                        System.out.println("Payment Is : "+payment+("$"));
                        System.out.println("Your Ticket Is : "+ticket+("t"));
        }else
            System.out.println("Invalited Input");
    }
}