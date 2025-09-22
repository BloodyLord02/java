package com.education.ztu;

public class task1
{
    public static void main(String[] args) {
    String str = "I learn Java!!!";
    char c = str.charAt(str.length()-1);
    System.out.println(c);
    if (str.endsWith("!!!")) {
        System.out.println("True");
    }else{
        System.out.println("False");
    }
    if(str.startsWith("I learn")){
        System.out.println("True");
    }else{
        System.out.println("False");
    }
    if(str.contains("Java")){
        System.out.println("True");
    }else{
        System.out.println("False");
    }
    int index = str.indexOf("Java");
    System.out.println("Pos:"+index);
    String aostr = "";
    aostr=str.replace("a","o");
    System.out.println(aostr);
    String Upstr="";
    Upstr=str.toUpperCase();
    System.out.println(Upstr);
    String Downstr="";
    Downstr=str.toLowerCase();
    System.out.println(Downstr);
    String nojavastr="";
    nojavastr=str.substring(7,12);
    System.out.println(nojavastr);
    }
}
