import java.util.*;
class Account{
    int amount,balance;
    String name,type;
    Scanner sc=new Scanner (System.in);
    Account(){
    System.out.println("enter name of account holder and type of account");
    name=sc.next();
    type=sc.next();
    
    System.out.println("enter your balance ");
    balance=sc.nextInt();
    }
    void deposit(int amount){
        balance=balance+amount;
        System.out.println("depoait amount "+amount+"balance after amount deposited "+balance);
    }
    
    void check_balance(){
        System.out.println("balance in your account : "+balance);
    }
    
    void withdraw(int amount){
        if(amount>balance){
            System.out.println("insufficient balance in your aaccount");
        }
        if(amount>50000){
            System.out.println("not possible to withdraw so much amount at a time");
        }
        if(amount<balance){
            balance=balance-amount;
            System.out.println("you withdraw "+amount+" and balance is :"+balance);
        }
    }
}
class ATM{
    public static void main (String args[]){
    Account ac=new Account();
    while(true){
    System.out.println("enter your choise \n 1-check balance \n 2-withdraw amount \n 3-deposit amount ");
    int ch;
    Scanner sc=new Scanner (System.in);
    ch=sc.nextInt();
    
        switch(ch){
            case 1:ac.check_balance();
                   break;
            case 2:System.out.println("enter amount to be withdraw");
                   int  amount;
                   amount=sc.nextInt();
                   ac.withdraw(amount);
                   break;
            case 3:System.out.println("enter amount to be deposited");
                   int  am;
                   am=sc.nextInt();
                   ac.deposit(am);
                   break;
            default:System.out.println("enter valid choise");
                   break;
            }
    }
    
}
}
