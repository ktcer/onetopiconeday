package onetopic.wordreverse;

/**
 * 说明：每个单词是以26个大写或小写英文字母构成，’-‘做为单词连接符使用时，视为单词的一部分，
 * 但在一个单词中只能连续一次，连续出现2个’-’以上时视为分隔符,如“aa--bb”中的“—”视为分隔符，
 * 2个单词为“aa”和“bb”，非构成单词的字符均视为单词间隔符。要求倒排后的单词间隔符以空格表示，
 * 原字符串中相邻单词间有多个间隔符时，倒排转换后只允许出现一个空格间隔符。每个单词最长20个字母。 
 * 示例： 给定原始单词语句：I am a - student 倒排后的单词语句：student a am I
 * @author yinlg
 * @date 20150712
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class WordReverseTest
{
    
    /**
     * @param pInput
     * @param pOutput
     * @return
     */
    @Test
    public void converseOne()
    {
        String srcStr = "-i am --student";
        String expectStr = "student am i";
        
        StringBuffer destSB = new StringBuffer();
        new WordReverse().converse(srcStr, destSB);
        assertEquals("equal message", expectStr, destSB.toString());
        
    }
    
}
