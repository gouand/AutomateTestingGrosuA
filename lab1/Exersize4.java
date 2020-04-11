package org.example;

public class Exersize4 {
    private int number;
    Exersize4(int number){
        this.number = number;
        if(isPalindrome(number) == true)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int number) {
        number = reverse(number);
        int reversedInteger = 0, remainder, originalInteger;

        originalInteger = number;

        // reversed integer is stored in variable
        while (number != 0) {
            remainder = number % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            number /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            return true;
        else
            return false;
    }




}
