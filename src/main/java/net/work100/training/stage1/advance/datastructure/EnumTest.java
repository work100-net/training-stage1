package net.work100.training.stage1.advance.datastructure;

/**
 * <p>Title: EnumTest</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-data-structure.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 19:37
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class EnumTest {

    enum Lang{
        zh_CN,
        en
    }

    enum LanguageEnum {

        /**
         * 英文
         */
        LANGUAGE_EN("en"),
        /**
         * 简体中文
         */
        LANGUAGE_ZH_CN("zh_CN"),
        /**
         * 繁体中文
         */
        LANGUAGE_ZH_TW("zh_TW");

        private String language;

        LanguageEnum(String language) {
            this.language = language;
        }

        /**
         * 获取指定语言类型(如果没有对应的语言类型,则返回中文)
         *
         * @param language 语言类型
         * @return
         */
        public static String getLanguage(String language) {
            if (isEmpty(language)) {
                return LANGUAGE_ZH_CN.language;
            }
            for (LanguageEnum languageEnum : LanguageEnum.values()) {
                if (languageEnum.language.equalsIgnoreCase(language)) {
                    return languageEnum.language;
                }
            }
            return LANGUAGE_ZH_CN.language;
        }

    }

    enum HttpStatus{
        OK(200, "OK"),
        BAD_REQUEST(400, "BAD REQUEST"),
        UNAUTHORIZED(401, "UNAUTHORIZED"),
        PAYMENT_REQUIRED(402, "PAYMENT REQUIRED"),
        FORBIDDEN(403, "FORBIDDEN"),
        NOT_FOUND(404, "NOT FOUND");


        /**
         * 返回码
         */
        private int code;

        /**
         * 返回信息
         */
        private String message;

        HttpStatus(int code, String message){
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }

    public static void main(String[] args) {
        System.out.println("Lang: " + Lang.zh_CN);
        System.out.println("-----------------------");

        System.out.println("HttpStatus Code: " + HttpStatus.OK.getCode() + ", Message: " + HttpStatus.OK.getMessage());
        System.out.println("HttpStatus Code: " + HttpStatus.NOT_FOUND.getCode() + ", Message: " + HttpStatus.NOT_FOUND.getMessage());
        System.out.println("-----------------------");

        System.out.println("默认语言：" + LanguageEnum.getLanguage(""));
        System.out.println("语言：" + LanguageEnum.getLanguage("en"));
        System.out.println("语言：" + LanguageEnum.getLanguage("none"));
        System.out.println("-----------------------");
    }

    public static boolean isEmpty(Object str) {
        return str == null || "".equals(str);
    }
}
