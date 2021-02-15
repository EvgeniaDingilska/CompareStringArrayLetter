package com.company.task.haker;

import java.util.Scanner;

public class CompareStringArrayWiththereLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input for a arrays

        String[] a = {"hello", "hi"};
        String[] b = {"world", "bye"};
        int lenga = a.length;
        boolean isCont = false;

        for (int i = 0; i < lenga; i++) {
            //System.out.println(a[i]);
            String ofA = a[i];

            for (int j = 0; j < b[i].length(); j++) {
                char ofb = b[i].charAt(j);
                for (int k = 0; k < a[i].length(); k++) {
                    char ofa = a[i].charAt(k);
                    if (ofb == ofa) {
                        isCont = true;

                    }
                }

            }

            if (isCont == true) {
                System.out.println("yes");
                isCont = false;
            } else {
                System.out.println("no");
            }
        }
    }
}


