package com.jh.test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author JH
 * @create 2020-06-08 11:47
 */
public class TemplatesTest {



    public static void main(String[] args) {
        System.out.println();
        System.out.println("TemplatesTest.main");

        int[] arr = new int[]{1,2,3,4,5};

        for (int inta : arr) {
            System.out.println("inta = " + inta);
            System.out.println("args = " + Arrays.deepToString(args));
        }

        ArrayList list = new ArrayList();

        list.add("list");
        list.add(0, 123);

        if (list == null) {

        }

    }

}
