import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 2005;

    public void checkPin(){
        System.out.println("Enter your PIN: ");
        Scanner sc = new Scanner(System.in);
        int inpin = sc.nextInt();
        if (inpin == PIN){
            menu();
        }else{
            System.out.println("Enter valid Pin!");
            menu();
        }
    }


    public void menu(){
        System.out.println("Enter your Choice: ");
        System.out.println(" 1-> Check your Balance ");
        System.out.println(" 2-> Withdraw Money");
        System.out.println(" 3-> Deposit Money");
        System.out.println(" 4-> Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if (opt == 2){
            withDraw();
        }
        else if (opt == 3){
            deposit();
        }
        else if (opt == 4) {
            return;
        }
        else {
            System.out.println("Enter valid choice!");
        }
    }

    public void checkBalance(){
        System.out.println("Balance : " + Balance);
        menu();
    }

    public void withDraw(){
        System.out.println("Enter amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount>Balance){
            System.out.println("Insufficient Amount");
        }else {
            Balance = Balance - amount;
            System.out.println("Withdrawl successful");
            menu();
        }
    }

    public void deposit(){
        System.out.println("Enter the amount ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        Balance += amount;
        System.out.println("Deposit successful");
        menu();
    }
}


public class ATMMachine {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkPin();
    }
}
