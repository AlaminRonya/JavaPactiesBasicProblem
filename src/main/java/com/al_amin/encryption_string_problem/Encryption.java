package com.al_amin.encryption_string_problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            builder.append(br.readLine());
            builder.reverse();
            int length = builder.length()-1;
            int secondLength = (builder.length() / 2);
            while (length > 0){
                int a = builder.charAt(length);
                if ((64 < a && a < 91) ||(96 < a && a < 123)){
                    if (length >= secondLength){
                        a +=2;
                    }else {
                        a +=3;
                    }
                    builder.replace(length,length+1, String.valueOf((char) a));
                }
                length--;
            }

            System.out.println(builder);
        }

    }
}
