package com.codewithsohan;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public boolean isValid(String s) {

        // Step 1: Base case
        if(s.length() <= 1){
            return false;
        }

        // Step 2: Create a stack
        Stack<Character> stack = new Stack<>();

        // Step 3: Create a map to remove if-else conditions for closing bracket
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        // Step 4: Start iterating the string
        for(int i=0;i<s.length();i++){

            Character current = s.charAt(i);

            // Step 5: Insert opening brackets in stack
            if(current == '(' || current == '{' || current == '['){

                stack.push(current);

            }
            // Step 6: For closing brackets, check the opening tag in stack
            else{

                Character opening = map.get(current);

                if(stack.size() > 0 && stack.pop() == opening){
                    continue;
                }
                else{
                    return false;
                }

            }

        }

        // Step 7: In the end, if stack is empty that means paranthesis are valid
        return (stack.size() == 0 ) ? true : false;

    }
}
