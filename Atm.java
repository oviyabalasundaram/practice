import java.util.*;
public class Atm{
    public static void main (String args[]){
        int pin;
        int pin_confirmation;
        int balance=20000;
        int AddAmount=0;
        int TakenAmount=0;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pin number:");
        pin=sc.nextInt();
        System.out.println("enter the pin_confirmation");
        pin_confirmation=sc.nextInt();
        if(pin_confirmation==pin){
            System.out.println("Enter the name:");
            name=sc.next();
            System.out.println(" Welcome " + name);
            while(true){
                System.out.println("press 1 to check your balance");
                System.out.println("press 2 to add amount");
                System.out.println("press 3 to take amount");
                System.out.println("press 4 to take recepit");
                System.out.println("press 5 to exit");
                int opt=sc.nextInt();
                switch(opt){
                    case 1:
                        System.out.println("your current balance is:"+balance);
                        break;
                    case 2:
                        System.out.println("how much amount do you want to add:");
                        AddAmount=sc.nextInt();
                        System.out.println("Successfully credited!");
                        balance=AddAmount+balance;
                        break;
                    case 3:
                        System.out.println("how much amount do you want to taken:");
                        TakenAmount=sc.nextInt();
                        if(TakenAmount>balance){
                            System.out.println("insufficient balance!");
                            System.out.println("try less than your available balance");
                        }   
                        else{
                            System.out.println("successfully withdraw!");
                            balance=balance-TakenAmount;
                        } 
                        break;
                     case 4:
                        System.out.println("welcome to mini Atm");
                        System.out.println("available balance:"+balance);
                        System.out.println("Amount deposited:"+AddAmount);
                        System.out.println("Amount withdraw:"+TakenAmount);
                        System.out.println("Thank you!!!");
                        break;

                }
                if(opt==5){
                    System.out.println("Thank you!!");
                    break;
                }

            }
         }
         else{
            System.out.println("invalid pin");
         }


    }

}
