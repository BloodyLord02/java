package com.education.ztu;

public class task2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 36;
        StringBuilder sb=new StringBuilder();
        sb.append(a).append(" + ").append(b).append(" = ").append(a + b);
        System.out.println(sb.toString());
        int rivno = sb.indexOf("=");
        sb.insert(rivno, "рівно").deleteCharAt(rivno + "рівно".length());
        System.out.println(sb.toString());
        sb.setLength(0);
        sb.append(a).append(" - ").append(b).append(" = ").append(a - b);
        System.out.println(sb.toString());
        sb.replace(rivno, rivno + 1, "рівно");
        System.out.println(sb.toString());
        sb.setLength(0);
        sb.append(a).append(" * ").append(b).append(" = ").append(a * b);
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
        System.out.println("length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}
