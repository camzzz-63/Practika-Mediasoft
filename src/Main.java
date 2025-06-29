//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Иван");
        BankAccount acc2 = new BankAccount("Ольга");
        acc1.deposit(1000);
        System.out.println(acc1.getBalance());
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());
        boolean success = acc1.transfer(acc2, 300);
        System.out.println("Успешный перевод? " + success);
        System.out.println("Баланс Александр: " + acc1.getBalance());
        System.out.println("Баланс Камилла: " + acc2.getBalance());
    }
}
