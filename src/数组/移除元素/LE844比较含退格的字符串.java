package 数组.移除元素;

/**
 * @Author: Gokou
 * @Date: 2023/04/04/22:16
 * @Description:
 *      给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
 *
 * 注意：如果对空文本输入退格字符，文本继续为空。
 *
 */
public class LE844比较含退格的字符串 {

    public boolean backspaceCompare(String s, String t) {
        return mapping(s).equals(mapping(t));
    }

    private String mapping(String before){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<before.length();i++){
            char ch=before.charAt(i);
            if(ch!='#') sb.append(ch);
            else if(sb.length()>0) sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }

}
