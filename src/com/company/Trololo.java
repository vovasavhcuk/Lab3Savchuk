package com.company;

import java.util.Locale;

import static java.lang.Integer.parseInt;

public class Trololo {

    public Trololo() {
    }
    public boolean isDigit(int c){
        String digits = "1234567890";
        for(int i = 0; i<digits.length(); i++){
            if(c==digits.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public boolean endsWithEd(String input){
        input = input.toLowerCase(Locale.ROOT).trim();
        return input.endsWith("ed");
    }
    public int getSumOfNum(String input){
        int sum = 0;
        for (int i = 0; i<input.length(); i++) {
            if(isDigit(input.charAt(i))) {

                sum += parseInt(String.valueOf(input.charAt(i)));
            }
        }
        return sum;
    }
    public int getMaxBlockLength(String input) {
        input = input.trim();
        int count = 0, max = 0;
        char temp = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (temp == input.charAt(i)) {
                count++;
            } else {
                temp = input.charAt(i);
                count = 1;
            }
            if(count>max){
                max = count;
            }
        }
        return max;
    }
    public void strSplit(String input){
        input = input.trim();
        String words[] = input.split(" ");
        System.out.println("Исходная строка: " + input + "\nРезультат: \n");
        for(String word:words){
            System.out.println(word);
        }
    }
    public String getStrFromTwo(String str1, String str2){
        int max = Math.max(str1.length(), str2.length());
        String str = "";
        for (int i = 0; i<max; i++) {
            str +=str1.charAt(i);
            str +=str2.charAt(i);
        }
        return str;
    }

    }
