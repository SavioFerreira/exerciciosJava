import account.CheckingAccount;

public class App2 {
    public static void main(String[] args) {
        System.out.println("Exceptions");
        var account = new CheckingAccount("1012");
        var account2 = new CheckingAccount("1210");

        account.activate();
        account.deposit(500);
        account.transfer(account2, 250);

        System.out.println("Account " + account.getNumber() + " balance " + account.getBalance());
        System.out.println("Account " + account2.getNumber() + " balance " + account2.getBalance());
    }
}