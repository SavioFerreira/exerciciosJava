import account.CheckingAccount;

public class App {
    public static void main(String[] args) {
        System.out.println("Exceptions");
        var account = new CheckingAccount("1012");
        account.deposit(500);
        System.out.println("Account balance " + account.getBalance());
    }
}