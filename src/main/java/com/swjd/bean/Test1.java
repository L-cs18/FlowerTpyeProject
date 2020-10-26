package com.swjd.bean;

public class Test1 {
    public static void main(String[] args) {
        String a = "abcdefj";
        StringBuilder b = new StringBuilder(a);
        System.out.println(b.reverse().toString());
    }
}
