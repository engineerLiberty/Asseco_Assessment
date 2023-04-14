package org.example;

import java.util.HashMap;

public class Solution1 {

    public int solution(int[] A) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            while ( A[i] % 2!=0) {

                if (hashMap.containsKey(A[i])) {
                    hashMap.remove(A[i]);
                } else {
                    hashMap.put(A[i], 1);
                }
            }
        }
        //                return hashMap.keySet().iterator().next();

        return hashMap.values().iterator().next();
    }
}

