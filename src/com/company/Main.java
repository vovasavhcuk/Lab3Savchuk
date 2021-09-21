package com.company;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String input = "      TroLo092LooooED lolo lola loly     ";
        Trololo lolo = new Trololo();
        System.out.println(lolo.endsWithEd(input));
        System.out.println("=================");
        System.out.println(lolo.getSumOfNum(input));
        System.out.println("=================");
        System.out.println(lolo.getMaxBlockLength(input));
        System.out.println("=================");
        lolo.strSplit(input);
        System.out.println("================");
        System.out.println(lolo.getStrFromTwo("lololo", "xaxaxa"));
        }
    }

