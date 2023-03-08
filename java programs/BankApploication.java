import java.util.Scanner;

class Application{
    
    long actbal,actnum; int pin;
    Scanner sc = new Scanner(System.in);

    public void acceptInitialDetails()
    {
        System.out.print("Enter the acount number: ");
        actnum = sc.nextLong();

         System.out.println();

         System.out.print("Enter the acount balance: ");
         actbal = sc.nextLong();

         System.out.println();

         System.out.print("Enter the pin: ");
         pin = sc.nextInt();  
    }

    public void deposite()
    {
        long amt;
        System.out.print("Enter the to Deposite: ");
        amt = sc.nextLong();
        actbal = actbal + amt;
        System.out.println();
        System.out.print("Deposite successful New Balance is: "+ actbal);
    }

    public void widrawal()
    {
       long amt; int tpin;
       System.out.print("Enter the pin: ");
       tpin = sc.nextInt();
System.out.println();
       if(pin == tpin)
       {
            System.out.print("Enter amount to widrawal: ");
            amt = sc.nextLong();
            if(amt < actbal)
            {
                 actbal = actbal - amt;
                 System.out.print("Your current balance is: "+ actbal);
            }
            else
            {
                 System.out.print("**** Sorry insufficent fund ****");
            }
       }
       else
       {
           System.out.print("Invalid pin");
       }
    }

    public void pinChange()
    {
        int npin,cpin,tpin;
        System.out.print("Enter your pin: ");
        tpin = sc.nextInt();

        if(pin == tpin)
        {
            System.out.print("Enter new pin: ");
            npin = sc.nextInt();
            System.out.println();
            System.out.print("Enter confirm pin: ");
            cpin = sc.nextInt();

            if(npin == cpin)
            {
                pin = npin;
                System.out.print("Your new pin generated: "+ pin);
            }
            else
            {
                System.out.print("Plz check your confirm pin onec again");
            }
        }
        else
        {
            System.out.print("** Invalid pin Enter **");
        }
        
    }

    public void showBalance()
    {
        int tpin;
        System.out.print("Enter the pin: ");
        tpin = sc.nextInt();

        if(pin == tpin)
        {
            System.out.print("Current balance is: "+ actbal);
        }
        else
        {
            System.out.print("**** Pin did not match ****");
        }
    }

    public void checkMinimumBalance()
    {
        int tpin;
        System.out.print("Enter the pin: ");
        tpin = sc.nextInt();

        if(pin == tpin)
        {
            if(actbal < 5000)
            {
                System.out.print("Account balance is less than MINIMUM required balance \n");
                System.out.print("FINE 20Rs \n");
                 actbal = actbal - 20;
                 System.out.print("Account balance is: "+ actbal);

            }
            else
            {
                System.out.print("Account balanec is maintained.. \n");
            }
        }
        else
        {
            System.out.print("** Pin did not match **");
        }
    }

    public void addInterest()
    {
        long intr;

        intr = (actbal/100)*4;
        actbal = actbal + intr;

        System.out.print(" Rs "+ intr + " Credited as interest \n");
        System.out.print("Newbalanec is: "+ actbal);
    }

    public void showDetails()
    {
        System.out.print("Account Number: "+ (actnum % 1000));
        System.out.println();
        System.out.print("Account balance: "+ actbal);
        System.out.println();
        System.out.print("Account PIN: "+ pin);
    }



}

public class BankApploication {
    
     public static void main(String[] args) {
        
        Application ap = new Application();
        int n;
        Scanner sc = new Scanner(System.in);
        ap.acceptInitialDetails();

        do{
           System.out.print(" \n $$$ Select an operation $$$ \n");

           System.out.print("1st - Deposite \n");
           System.out.print("2nd - Withdrawal \n");
           System.out.print("3rd - PIN change \n");
           System.out.print("4th - Show balance \n");
           System.out.print("5th - Check for MINIMUM balance \n");
           System.out.print("6th - ADD Interest \n");
           System.out.print("7th - Show Account Information \n");
           System.out.print("8th - EXIT \n");

           System.out.print("Select the option: ");
           n = sc.nextInt();

           switch (n) {
               case 1:
                   ap.deposite();
                   break;
            
                case 2:
                    ap.widrawal();
                    break;
                case 3:
                    ap.pinChange();
                    break;
                case 4:
                    ap.showBalance();
                    break;
                case 5:
                    ap.checkMinimumBalance();
                    break;
                case 6:
                    ap.addInterest();
                    break;
                case 7:
                    ap.showDetails();
                    break;
                case 8:
                    System.exit(0);
                    break;                
                    
               default:
                   break;
           }
        }while(true);
        

     }

}
