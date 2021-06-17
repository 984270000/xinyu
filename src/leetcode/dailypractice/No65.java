package leetcode.dailypractice;

/**
 * @author ZhangXinYu
 * @date 2021/6/17
 */
public class No65 {
    /**
     * 65. 有效数字
     * <p>
     * 有效数字（按顺序）可以分成以下几个部分：
     * <p>
     * 一个 小数 或者 整数
     * （可选）一个 'e' 或 'E' ，后面跟着一个 整数
     * 小数（按顺序）可以分成以下几个部分：
     * <p>
     * （可选）一个符号字符（'+' 或 '-'）
     * 下述格式之一：
     * 至少一位数字，后面跟着一个点 '.'
     * 至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
     * 一个点 '.' ，后面跟着至少一位数字
     * 整数（按顺序）可以分成以下几个部分：
     * <p>
     * （可选）一个符号字符（'+' 或 '-'）
     * 至少一位数字
     * 部分有效数字列举如下：
     * <p>
     * ["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"]
     * 部分无效数字列举如下：
     * <p>
     * ["abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"]
     * 给你一个字符串 s ，如果 s 是一个 有效数字 ，请返回 true 。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：s = "0"
     * 输出：true
     * 示例 2：
     * <p>
     * 输入：s = "e"
     * 输出：false
     * 示例 3：
     * <p>
     * 输入：s = "."
     * 输出：false
     * 示例 4：
     * <p>
     * 输入：s = ".1"
     * 输出：true
     *  
     * <p>
     * 提示：
     * <p>
     * 1 <= s.length <= 20
     * s 仅含英文字母（大写和小写），数字（0-9），加号 '+' ，减号 '-' ，或者点 '.' 。
     *
     * @param s
     * @return
     */
    public boolean isNumber(String s) {

        return true;
    }

    public boolean isNumber2(String s) {
        try {
            Float.parseFloat(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
