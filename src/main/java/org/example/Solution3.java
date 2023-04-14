package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

        public List<Integer> getPrimes(int[] A) {

            List<Integer> primes = new ArrayList<>();
            for (int num : A) {
                if (isPrime(num)) {
                    primes.add(num);
                }
            }
            return primes;
        }


        private boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
