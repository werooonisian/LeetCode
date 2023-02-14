package com.example.demo.EASY.Add_Binary;

import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger aInBinary = new BigInteger(a, 2);
        BigInteger bInBinary = new BigInteger(b, 2);
        BigInteger binarySum;
        binarySum = aInBinary.add(bInBinary);
        return binarySum.toString(2);
    }
}
