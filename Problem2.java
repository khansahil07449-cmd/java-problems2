import java.io.*;
class BankAccount {
    int accNumber  ; 
    String  accName ; 
    double   balance ; 
        public BankAccount () { 
            accNumber = 0  ;
            accName = " Not given ";
            balance = 0 ;
            System.out.println( " Default  Bank account created :" ); 
                }
            
                public BankAccount ( int accNo, String accN, double bal ) { 
                    accNumber = accNo ;
                    accName = accN ;
                    balance = bal ; 
                    System.out.println(" Bank Account created for " + accN + ".");
                }
                
                public void  deposit (double amount ) {
                    if ( amount > 0 ) {
                        balance += amount ; 
                        System.out.println( "Deposited "  + amount +  " New balance is " + balance );
                    } else {
                        System.out.println( " The amount is invalid " ) ; 
                    } 
                }
                public  void withdraw (double amount ) {
                  if ( amount > balance) { 
                    System.out.println("Withdrawal Failed: Insufficient balance. You only have " + balance);
                  } else if (amount > 0 ){
                        balance -= amount ; 
                        System.out.println( " Withdrawn " + amount + " New balance is " + balance ) ; 
                    }
                }

                    
                
                public void displayAccount() { 
                    System.out.println(" ---------ACCOUNT DETAILS--------- " ) ; 
                    System.out.println( "Account number : " + accNumber ) ; 
                    System.out.println( " Holders Name : " + accName ) ; 
                    System.out.println( " Balance : " +balance) ; 

                }
    }
  public class Problem2 { 
       public static void main(String[] args) throws IOException{
         BankAccount  account1 = new BankAccount() ; 
         account1.displayAccount();
         System.out.println();
         
         BankAccount account2 = new BankAccount(101, " Rahul " , 25000)  ; 
         account2.displayAccount();
         System.out.println(" Transaction for rahul " );
           account2.deposit(5000);
           account2.withdraw(3000);

           account2.withdraw(50000) ;
           System.out.println("\nFinal Account Status:");
           account2.displayAccount();
           
        }
  }
    
