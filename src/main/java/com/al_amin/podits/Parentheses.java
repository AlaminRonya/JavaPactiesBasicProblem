package com.al_amin.podits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parentheses {

    public static boolean isParentheses(String s){
        if (s == null){
            return true;
        }

        Stack<Character> startPar = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c =='(' || c =='['){
                    startPar.push(c);
            }else if (c ==')'){
                if (startPar.isEmpty()){
                     return true;
                }
                if (startPar.pop() != '('){
                    return true;
                }
            }else if (c ==']'){
                if (startPar.isEmpty()){
                    return true;
                }
                if (startPar.pop() != '['){
                    return true;
                }
            }else {
                return true;
            }
        }
        return !startPar.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0){
            String line = br.readLine();
            boolean flag = isParentheses(line);
            if (!flag){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
