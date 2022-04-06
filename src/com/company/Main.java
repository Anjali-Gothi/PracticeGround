package com.company;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello world!");
//        System.out.println("Howdy y'all!");
//        System.out.printf("%d",2345);
//        System.out.println();
//        System.out.println("Hey friends!");
        Vector<String> v = new Vector<>();

        v.add("new");
        v.add("another new");
            Iterator<String> iterator = v.iterator();
        while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        Boolean b=true;
        b=false;
        System.out.println(b);
        Format f=new SimpleDateFormat("HH.mm.ss");
        System.out.println(f.format(new Date(System.currentTimeMillis() - 60*60 * 1000)));
    }
}
