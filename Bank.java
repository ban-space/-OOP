public class Bank{
    public static void main(String[] args){
        Account account1=new Account(1000449,"Biniyam",30000);
        System.out.print("\n start\n");
         Account.displayInfo(account1);

         account1.withdraw(300);
         System.out.print("\n\n after withdraw\n");
         Account.displayInfo(account1);

         account1.deposite(800);
         System.out.print("\n\n after deposite\n");
         Account.displayInfo(account1);
    }
}
class Account{
    private double accountNumber;
    private String owner;
    private int balance;
    public  static int  numberOfObjects;

    public  Account(){
        numberOfObjects++;
    }
    public Account(double accountNumber){
      this.accountNumber=accountNumber;
      numberOfObjects++;
    }
    public  Account(double accountNumber,String owner){
        this.accountNumber= accountNumber;
        this.owner=owner;
        numberOfObjects++;
    }
    public  Account(double accountNumber,String owner,int balance){
        if(balance<0) return;
        this.accountNumber= accountNumber;
        this.owner=owner;
        this.balance=balance;
        numberOfObjects++;
    }

    public int deposite(int amount){
  
        if(amount>=0){
            balance=amount ;
            return 1;
        }
        return -1;
    }
    public void setAccountNumber(double accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setOwner(String owner ){
        this.owner=owner;
    }
   public double withdraw(int amount){
      if(balance>=amount){
        int withdrowBalance=balance-amount;
         deposite(withdrowBalance);
         return withdrowBalance;
      }
      return -1;
   }
    
    public double getAccountNumber(){
          return accountNumber;
    }
     public String getOwner(){
          return owner;
    }
     public int getBalance(){
        return balance;
    }

    public static void displayInfo(Account object ){
          System.out.print(" account owner : "+ object.owner);
          System.out.print("\n account number : "+object.accountNumber);
          System.out.print("\n balance : "+ object.balance);
    }

}