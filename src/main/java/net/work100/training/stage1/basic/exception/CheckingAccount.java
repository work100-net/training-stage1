package net.work100.training.stage1.basic.exception;

/**
 * <p>Title: CheckingAccount</p>
 * <p>Description: 模拟银行账户</p>
 * <p>Url: http://www.work100.net/training/java-exception.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 15:57
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class CheckingAccount {

    /**
     * 余额
     */
    private double balance;

    /**
     * 卡号
     */
    private int number;

    public CheckingAccount(int number) {
        this.number = number;
    }

    /**
     * 存钱
     *
     * @param amount
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * 取钱
     *
     * @param amount
     * @throws InsufficientFundsException
     */
    public void withdraw(double amount) throws
            InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    /**
     * 返回余额
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 返回卡号
     *
     * @return
     */
    public int getNumber() {
        return number;
    }
}
