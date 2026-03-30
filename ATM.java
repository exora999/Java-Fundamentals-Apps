
// import java.util.Scanner;
// public class ATM {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("enter new password : ");
//         int pass = input.nextInt();
//         System.out.println("-".repeat(50));
//         System.out.print("enter your password : ");
//         int pass_n = input.nextInt();
//         int balance = 2000;
//         int oper;
//         if (pass == pass_n){
//         do {System.out.println("------Menu-----");
//         System.out.println("1.heck Balance");
//         System.out.println("2.Deposit");
//         System.out.println("3.Withdraw");
//         System.out.println("4.Exit");
//     System.out.print("enter number of operation : ");
//      oper = input.nextInt();
//     if (oper == 1){System.out.printf("your balance = %d DH",balance);}
//     else if (oper == 2){
//                         int amoun ;
//                         do{System.out.print("the amount you want to add : ");
//                          amoun = input.nextInt();
//                          }while(amoun <0);
//                          balance = balance + amoun;
//                         System.out.printf("Donne your Balance = %d DH",balance);
//                        }
//     else if(oper == 3){int drop ;
//                        do{System.out.print("the amount you want drop : ");
//                           drop = input.nextInt();}while((drop > balance) || (drop < 0)); 
//                          balance = balance - drop;
//                          System.out.println("Done");
//                         System.out.printf("your balance = %d DH" ,balance);}
//     else if (oper == 4 ){System.out.println("Finiched");}


// }while(oper != 4);

// }else{System.out.println("Wrong password!");}   
// input.close();
// }}
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter new password : ");
        int pass = input.nextInt();

        System.out.println("-".repeat(50));

        System.out.print("enter your password : ");
        int pass_n = input.nextInt();

        int balance = 2000;

        if (pass == pass_n) {
            
           
            int oper; 
            
            do {
                System.out.println("\n------ Menu -----"); 
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                
                System.out.print("enter number of operation : ");
                oper = input.nextInt();

                if (oper == 1) {
                    System.out.printf("your balance = %d DH", balance);
                } 
                else if (oper == 2) {
                    int amoun;
                    do {
                        System.out.print("the amount you want to add : ");
                        amoun = input.nextInt();
                    } while (amoun < 0);
                    
                    balance = balance + amoun;
                    System.out.printf("Done your Balance = %d DH", balance);
                } 
                else if (oper == 3) {
                    int drop;
                    do {
                        System.out.print("the amount you want drop : ");
                        drop = input.nextInt();
                    } while ((drop > balance) || (drop < 0));
                    
                    balance = balance - drop;
                    System.out.println("Done");
                    System.out.printf("your balance = %d DH", balance);
                } 
                else if (oper == 4) {
                    System.out.println("Finished");
                }

            } while (oper != 4); 

        } else {
            System.out.println("Wrong password!");
        }
        
        input.close();
    }
}
