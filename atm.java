
import java.util.*;
class user{
    double balance=10000;
    int pin=0000;

}

public class atm extends user{
    static Scanner sc = new Scanner(System.in);
    static int c=0;
    public void checkbalance()
    {
        System.out.println();
            System.out.print("Enter 4-Digit Pin: ");
            int pin1=sc.nextInt();
            if(pin1==pin)
            {
                c++;
                System.out.println();
                System.out.println("Name: Akhilesh Kodam");
                System.out.println("Bank Account: SBI");
                System.out.println("Balace Amount is: "+balance);
            }
            else{
                System.out.println("You have entered Incorrect ATM Pin");
            }
    }

    public void withdraw(double amount)
    {
        System.out.println();
        System.out.print("Enter 4-Digit Pin: ");
            int pin1=sc.nextInt();
            if(pin1==pin)
            {
                c++;
                if(balance>=amount){
                    balance=balance-amount;
                    System.out.println();
                    System.out.println("Withdraw Successfull");
                    System.out.println("The "+amount+" is Debited From Your Account");
                    System.out.println("The Remaining Balance in Your Account is "+balance);
                }
                else{
                    System.out.println("No Sufficient Balance in your Account to Withdraw");
                }
            }
            else{
                System.out.println("You have entered Incorrect ATM Pin");
            }
        

    }

    public void deposit(double amount){
        System.out.println();
            System.out.print("Enter 4-Digit Pin: ");
            int pin1=sc.nextInt();
            if(pin1==pin)
            {
                    c++;
                    balance=balance+amount;
                    System.out.println();
                    System.out.println("Deposit Successfull");
                    System.out.println("The "+amount+" is Credited to Your Account");
                    System.out.println("The Balance in Your Account is "+balance);
            }
            else{
                System.out.println("You have entered Incorrect ATM Pin");
            }

    }

    public void pinchange(){
        System.out.println();
        System.out.print("Enter 4-Digit Pin: ");
            int pin1=sc.nextInt();
            if(pin1==pin)
            {
                    
                    System.out.print("Enter New Pin: ");
                    int pin2=sc.nextInt();
                    System.out.print("Re-Enter New Pin: ");
                    int pin3=sc.nextInt();
                    if(pin2==pin3)
                    {
                        c++;
                        System.out.println();
                        System.out.println("Pin Update Successfull");
                    }
                    else{
                        System.out.println();
                        System.out.println("Pins Not Matched");
                    }
            }
            else{
                System.out.println("You have entered Incorrect ATM Pin");
            }
    }
    

    public static void main(String []args){
        atm obj=new atm();
        System.out.println("                                 -----======>ATM MACHINE<=====------       ");

        System.out.println(" Enter 1---> Withdraw \n Enter 2---> Deposit \n Enter 3---> Check balance \n Enter 4---> Change ATM Pin");
        int select=sc.nextInt();
        switch(select)
        {
            case 1:
                System.out.println("                          <----Withdraw Page---->     ");
                System.out.print("Enter Amount: ");
                double amount=sc.nextInt();
                obj.withdraw(amount);
                break;
            case 2:
                System.out.println("                             <----Deposit Page---->     ");
                System.out.print("Enter Amount: ");
                double amount1=sc.nextInt();
                obj.deposit(amount1);
                break;
            case 3:
                System.out.println("                               <----Balance Page---->     ");
                obj.checkbalance();
                break;
            case 4:
                System.out.println("                                <----ATM Pin Page---->     ");
                obj.pinchange();
                break;
            default:
                    break;
        }

        System.out.println();
        if(c==0){
                 System.out.println("                                       <---Transaction Failed--->");
        }
        else{
                System.out.println("                                       <---Transaction SuccessFull--->");
        }
        sc.close();
    }
    
}
