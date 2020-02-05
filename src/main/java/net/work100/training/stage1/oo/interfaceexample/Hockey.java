package net.work100.training.stage1.oo.interfaceexample;

/**
 * <p>Title: Hockey</p>
 * <p>Description: 曲棍球运动</p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 17:25
 * @url http://www.work100.net/training/java-interface.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public interface Hockey extends Sports {
    /**
     * 主场进球
     */
    void homeGoalScored();

    /**
     * 客场进球
     */
    void visitingGoalScored();

    void endOfPeriod(int period);

    void overtimePeriod(int ot);
}
