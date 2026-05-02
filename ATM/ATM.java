import java.util.Scanner;

public class ATM{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("         ATM  INTERFACE      ");
        System.out.println("---------------------------------");
        
        int number = 0 ;
        int deposit = 0 ;
        int balance = 0 ;
        int withdraw = 0 ;

        while(number!=4)
        {
            System.out.print("\n1. Deposit\n" +  "2. Withdraw\n"+ "3. Check Balance\n" +  "4. Exit\n");
            System.out.print("\nEnter your choice : ");
            number = sc.nextInt();

             if(number==4)
             {
                 break;
             }
             else if(number==1)
             {
               System.out.print("\nEnter amount to deposit : ");
               deposit = sc.nextInt();
               if(deposit<=0)
               {
                System.out.println("\nEnter a Valid deposit amount !..");
               }
               else
               {
                 balance = balance + deposit;
                 System.out.println("The amount was Successfully deposited ... ");
               }
               
             }
             else if(number == 2 )
             {
              System.out.print("\nEnter amount to Withdraw : ");
              withdraw = sc.nextInt();
              if( withdraw<0)
              {
                System.out.println("\nEnter a Valid amount !..");
              }
              else if(withdraw>balance )
              {
                 System.out.println("\nInsufficient Balance ! ");
              }
              else
              {
                balance = balance - withdraw;
                System.out.println("\nWithdraw Successful ... ");
              }
              
             }
            else if(number == 3)
             {
                System.out.println("\nCurrent Balance : "+balance);
             }
             else
             {
                System.out.println("\n---------------------------------");
                System.out.println("         Invalid choice !");
                System.out.println("----------------------------------");
                continue;
             }

          System.out.println("\n==================================");

        }

        System.out.println("\nThank you for using ATM!");
        System.out.println("---------------------------------");

    }
}