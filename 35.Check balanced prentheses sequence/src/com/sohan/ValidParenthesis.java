package com.sohan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    private final Map CLOSE_TO_OPEN_PARENS = Map.of(')', '(', ']', '[', '}', '{');

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (Character c : s.toCharArray()) {
            if (CLOSE_TO_OPEN_PARENS.containsKey(c)) {
                if (stack.size() == 0 || stack.pop() != CLOSE_TO_OPEN_PARENS.get(c)) {
                    return false;
                }
            } else {
                stack.add(c);
            }
        }

        return stack.size() == 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String parenthesis = in.readLine();
        String result = String.valueOf(new ValidParenthesis().isValid(parenthesis));
        System.out.print(String.valueOf(result));
    }
}