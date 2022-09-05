package com.al_amin.podits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Frequency {
    public static void isFrequency(String s) {
        if(s==null){
            return;
        }

        int[] arr = new int[26];
        String s1 = s.toLowerCase();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<s1.length(); i++){
            int c = s1.charAt(i);
            if (96 < c && c <123){
                int i1 = s1.charAt(i) - 97;
                arr[i1]++;
                if ( max < arr[i1]){
                    max = arr[i1];
                }
            }

        }
        for(int i=0; i<26; i++){
            if(arr[i] == max){
                System.out.print((char) (i+'a'));
            }
        }


    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0){
            String line = br.readLine();
            isFrequency(line);
        }
    }
}
