package com.example.demo.EASY.Count_Odd_Numbers_in_an_Interval_Range;

public class Solution {
    public int countOdds(int low, int high) {
        int counter = 0;
        if(low%2 == 1 && high%2 == 0){
            high-=1;
        }else if(low%2 == 0 && high%2 == 1){
            low+=1;
        }else if(low%2 == 0 && high%2 == 0){
            low+=1;
            high-=1;
        }
        counter = (high - low)/2 +1;
        return counter;
    }
}
