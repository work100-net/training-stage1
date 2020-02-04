package net.work100.training.stage1.oo.interfaceexample;

/**
 * <p>Title: Football</p>
 * <p>Description: 足球运动</p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 17:23
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public interface Football extends Sports {
    /**
     * 主队得分
     *
     * @param points
     */
    void homeTeamScored(int points);

    /**
     * 客队得分
     *
     * @param points
     */
    void visitingTeamScored(int points);

    /**
     * @param quarter
     */
    void endOfQuarter(int quarter);
}
