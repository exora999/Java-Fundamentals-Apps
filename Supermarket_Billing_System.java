import java.util.Scanner;
public class supeer {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double price ;
       String another;
       int cont;
       double solde;
       double total_sol;
       double tva;
       double total_tva;
        double total = 0;
       do {
        System.out.print("Enter price :  ");
        price = input.nextDouble();
        System.out.print("Enter Quantity :  ");
        cont = input.nextInt();
        System.out.print("is there another product? (yes OR no) : ");
       another = input.next();
        total = total +(price * cont);
       }while(another.equals("yes"));
       
       System.out.printf("Total = %f DH %n",total);
       if (total >500){solde = total * 0.10;
                       total_sol = total - solde;}
        else {solde = 0 ;
              total_sol = total;}
        tva = total_sol * 0.2;
        total_tva = total_sol + tva;
        System.out.println("-".repeat(50));
        System.out.printf("Total Raw: %f DH %n",total);
        System.out.printf("Discount (10%%): %f DH %n",-solde);
        System.out.printf("TVA: +%f DH %n",tva);
        System.out.println("-".repeat(50));
        System.out.printf("FINAL TO PAY: %f DH %n", total_tva);

    }  
    
}

