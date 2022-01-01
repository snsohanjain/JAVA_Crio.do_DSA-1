package com.sohan;

import java.util.Scanner;
import java.util.Stack;

public class PostfixExpression {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        int val = postfixExpression(exp);
        System.out.println(val);
    }

    // TODO: Implement this method
    static int postfixExpression(String exp) {
        // creating a stack
        Stack<Integer> stack = new Stack<>();

        // scan all characters one by one
        for(int i = 0; i < exp.length(); i++)
        {
            char c = exp.charAt(i);

            if(c == ' ')
            continue;

            // If the scanned character is an operand
            // (number here),extract the number
            // Push it to the stack.
        else if(Character.isDigit(c))
        {
            int n = 0;

            //extract the characters and store it in num
            while(Character.isDigit(c)&& i < exp.length())
            {
                n = n*10 + (int)(c-'0');
                i++;
                if (i < exp.length()) {
                    c = exp.charAt(i);
                }
            }
            i--;

            //push the number in stack
            stack.push(n);
        }
            //  If the scanned character is an operator, pop two
            // elements from stack apply the operator
            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch(c)
                {
                    case '+':
                        stack.push(val2+val1);
                        break;

                    case '-':
                        stack.push(val2- val1);
                        break;

                    case '/':
                        stack.push(val2/val1);
                        break;

                    case '*':
                        stack.push(val2*val1);
                        break;
                }
            }
        }return stack.pop();
    }
}

//    Problem Description
//    Postfix expressions are an ordering of mathematical operations, where the operator(+,-,* etc) comes after the operands.
//
//        For instance, an operation 2 + 3 (infix notation, which humans use) will be represented as 2 3 + in postfix notation. The computers can understand postfix notation.
//
//        Your job is to evaluate the given postfix expression. The expression is given as a string where each token is separated by a space.
//
//        The possible operators can be +, - and *
//
//        Note that all operands(numbers) are assumed to be non-negative.
//
//        Input format
//        One line of input, containing the string S.
//
//        Output format
//        Print the result of the given expression
//
//        Sample Input 1
//        2 3 +
//
//        Sample Output 1
//        5
//
//        Constraints
//        1 <= |S| <= 100
//
//        S[i] >= 0, where S[i] is an operand in the expression
