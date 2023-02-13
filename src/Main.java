import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(200000.0);

        while (true) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException a) {
                try {
                    bankAccount.withDraw((int) a.getRemainingAmount());
                }catch (LimitException limitException){
                    limitException.printStackTrace();
                }
            }break;
        }
    }
}