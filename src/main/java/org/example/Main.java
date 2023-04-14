package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sample Array");

        int[] numbers = {3,3,5,5,7,7,9,6,6};

        System.out.println("Numbers: " + Arrays.toString(numbers));


        Solution1 s = new Solution1();

        int unPairedElement = s.solution(numbers);

        System.out.println(unPairedElement);

        System.out.println("Question2 Test!");

        Solution2 s2 = new Solution2();

        System.out.println(s2.solution(529));


        Solution3 s3 = new Solution3();

        System.out.println(s3.getPrimes(numbers));

    }
}