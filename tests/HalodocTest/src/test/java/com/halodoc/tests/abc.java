package com.halodoc.tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class abc {
    public static List<String> foo(String inputStr, int num) {
        // Write your code here
        List<String> strlist = new ArrayList<String>();
        List<String> strlist1 = new ArrayList<String>();
        int len = inputStr.length() - num;
        for (int i = 0; i <= len; i++) {
            String substr =inputStr.substring(i, num + i);
            strlist.add(substr);
        }

        for(int i=0;i<strlist.size();i++){
            HashSet<Character> strchar = new HashSet<>();
            String str = strlist.get(i);
            for(int j=0;j<str.length();j++){
                strchar.add(str.charAt(j));
            }
            if(strchar.size()==num-1){
                strlist1.add(strlist.get(i));
            }

        }
        System.out.println();
        return strlist1;
    }

    public static void main(String[] args) {
        String s = "democracy"; int num =5;
        System.out.println(foo(s, num));
    }
}
