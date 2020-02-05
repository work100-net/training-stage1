package net.work100.training.stage1.basic.exception;

/**
 * <p>Title: BankDemo</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 16:00
 * @url http://www.work100.net/training/java-exception.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class BankDemo {

    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(1010);
        System.out.println("您的卡号：" + c.getNumber());
        System.out.println("存入 $500...");
        c.deposit(500.00);
        try {
            System.out.println("提现 $100...");
            c.withdraw(100.00);
            System.out.println("提现 $600...");
            c.withdraw(600.00);
        } catch (InsufficientFundsException e) {
            System.out.println("对不起，您的余额不足，缺少： $" + e.getAmount());
            e.printStackTrace();
        }
    }
}
