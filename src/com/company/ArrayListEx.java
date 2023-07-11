package com.company;

public class ArrayListEx {
    public static void main(String[] args) {
        for(String R̥:args){
            //hello new i am here
            Boolean b=true;
            char[] values=R̥.toCharArray();
            System.out.println(R̥);
            for(char c:values){
                if(Character.isDigit(c)){
                    b= false;
                }else
                    continue;
            }
            System.out.println(b?"YES":"NO");
        }
    }
}
