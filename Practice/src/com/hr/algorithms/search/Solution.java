package com.hr.algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    
    private static class HousingData implements Comparable<HousingData>{
        int year;
        long price;
        
        public HousingData(int year, long price){
            this.year = year;
            this.price = price;
        }
        
        public int compareTo(HousingData data){
            return Long.compare(data.price, this.price);
        }
        
        public String toString(){
            return this.year+","+this.price;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int years = in.nextInt();
        HousingData data[] = new HousingData[years];
            
        for(int i=0; i<years; i++){
            data[i] = new HousingData(i+1, in.nextLong());
        }
        
        Arrays.sort(data);
        
        System.out.println(minimumLoss(data));
    }
    
    public static long minimumLoss(HousingData[] data){
        long minimumLoss = Long.MAX_VALUE;
        
        for(int i=0 ; i<data.length-1 ; i++){
            if(data[i+1].year>data[i].year){
                if(data[i].price-data[i+1].price<minimumLoss)
                    minimumLoss = data[i].price-data[i+1].price;
            }
        }
        
        return minimumLoss;
        
    }
}
