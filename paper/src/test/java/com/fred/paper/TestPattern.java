package com.fred.paper;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {
    @Test
    public void test1(){
        String content="<a id=\"aging-total-page\" role=\"pagedescription\" aria-label=\"欢迎进入 百度一下，你就知道，盲人用户进入读屏幕模式请按" +
                "快捷键Ctrl加Alt加R；45655445445阅读详细操作说明请按快捷键Ctrl加Alt加问564545号键。\" tabindex=\"0\" href=\"javascript:void(0)\"></a>";
        Pattern compile = Pattern.compile("(\\d\\d\\d)(\\d\\d\\d)");
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println("找到了"+matcher.group(1));
        }
    }

    @Test
    public void test2(){
        String str1="nihao";
        String str2="nihao1ssss";
        Pattern compile = Pattern.compile(str1);
        Matcher matcher = compile.matcher(str2);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
