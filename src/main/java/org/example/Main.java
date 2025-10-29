package org.example;

public class Main {
    public static void main(String[] args) {
    }
    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        String original = Integer.toString(number);
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        return original.equals(reversed);
    }

    public static boolean isPerfectNumber(int number) {
      if(number<1)return  false;
      int sum = 0;
        for(int i = 1; i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        return sum==number;
    }

    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";
        if (number == 0) return "Zero";

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String numberText = Integer.toString(number);
        String result = "";

        for (char c : numberText.toCharArray()) {
            int digit = Character.getNumericValue(c);
            result += words[digit] + " ";
        }

        return result.trim();
    }
}
