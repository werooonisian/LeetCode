package com.example.demo.EASY.Add_to_Array_Form_of_Integer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        int[] array = {1,2,0,0};
        addToArrayForm(array, 34);
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        BigInteger numInInt = BigInteger.ZERO;
        for (int j : num) {
            numInInt = numInInt.multiply(BigInteger.valueOf(10));
            numInInt = numInInt.add(BigInteger.valueOf(j));
        }
        BigInteger sum = numInInt.add(BigInteger.valueOf(k));
        char[] sumInString = sum.toString().toCharArray();
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i< sumInString.length; i++){
            result.add(Integer.parseInt(String.valueOf(sumInString[i])));
        }
        return result;
    }
}
