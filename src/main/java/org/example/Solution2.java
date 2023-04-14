package org.example;

public class Solution2 {

        public int solution(int N) {

            String binary = Integer.toBinaryString(N);
            int maxGap = 0;

            int currentGap = 0;
            boolean counting = false;

            // Loop through each character in the binary string

            for (char c : binary.toCharArray()) {
                if (c == '1') {
                    if (counting) {

                        maxGap = Math.max(maxGap, currentGap);
                        currentGap = 0;

                    } else {
                        counting = true;
                    }
                } else if (counting) {

                    currentGap++;
                }
            }

            return maxGap;
        }
    }

