package com.regular.impl;

import com.regular.RegularCase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zmm on 17-5-3.
 */
public class PointerRegular implements RegularCase{


    public void match2Model1() {
        String content = "I am noob from runoob.com";
        String pattern = ".*runoob.*";
        boolean isMatcher = Pattern.matches(pattern, content);
        System.out.println("包含结果:"+isMatcher);

    }

    public void match2Model2() {
        String content = "I am noob from runoob.com";
        String patternStr = "^\\D+runoob.*$";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            int count = matcher.groupCount();
            for (int i=0;i<=count;i++) {
                System.out.println(matcher.group(i));
            }
        }
    }

    public void match2Model3() {
        String content = "";
        String patterStr = "^\\d+$";
        Pattern pattern = Pattern.compile(patterStr);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            int count = matcher.groupCount();
            for (int i=0;i<=count;i++) {
                System.out.println("find... "+matcher.group(i));
            }
        }
    }
}
