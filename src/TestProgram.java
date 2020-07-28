public class TestProgram {

    public static void main(String[] args) {

        BankSystem bs = new BankSystem("D123", "Michael", 500);

        System.out.println(bs.checkBalance());

        bs.deposit(20);
        System.out.println(bs.checkBalance());

        bs.withdraw(70);
        System.out.println(bs.checkBalance());

    }

}
