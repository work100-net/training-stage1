package net.work100.training.stage1.oo.interfaceexample;

/**
 * <p>Title: Sports</p>
 * <p>Description: 体育运动</p>
 * <p>Url: http://www.work100.net/training/java-interface.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 17:21
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public interface Sports {
    /**
     * 主队
     * @param name
     */
    void setHomeTeam(String name);

    /**
     * 客队
     * @param name
     */
    void setVisitingTeam(String name);
}
