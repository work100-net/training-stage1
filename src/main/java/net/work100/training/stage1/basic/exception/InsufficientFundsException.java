package net.work100.training.stage1.basic.exception;

/**
 * <p>Title: InsufficientFundsException</p>
 * <p>Description: 资金不足异常</p>
 * <p>Url: http://www.work100.net/training/java-exception.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 15:54
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class InsufficientFundsException extends Exception {
    //此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
    private double amount;

    public InsufficientFundsException(double amount)
    {
        this.amount = amount;
    }
    public double getAmount()
    {
        return amount;
    }
}
