package com.hr.tutorials.crack.data.structures;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BalancedBrackets {

	public static boolean isBalanced(String expression) {
		Deque<Character> stack = new LinkedList<Character>();
		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);

			switch (c) {
			case '{':
				stack.addFirst(c);
				System.out.println("Pushing { into stack");
				break;

			case '(':
				stack.addFirst(c);
				System.out.println("Pushing ( into stack");
				break;

			case '[':
				stack.addFirst(c);
				System.out.println("Pushing [ into stack");
				break;

			case '}':
				if (!stack.isEmpty() && stack.peekFirst().charValue() == '{') {
					stack.removeFirst();
					System.out.println("Popping { from stack");
				} else {
					stack.addFirst(c);
					System.out.println("Pushing { into stack");
				}
				break;

			case ')':
				if (!stack.isEmpty() && stack.peekFirst().charValue() == '(') {
					stack.removeFirst();
					System.out.println("Popping ( from stack");
				} else {
					stack.addFirst(c);
					System.out.println("Pushing ) into stack");
				}
				break;

			case ']':
				if (!stack.isEmpty() && stack.peekFirst().charValue() == '[') {
					stack.removeFirst();
					System.out.println("Popping [ from stack");
				} else {
					stack.addFirst(c);
					System.out.println("Pushing ] into stack");
				}
				break;

			default:
				continue;
			}
		}

		return stack.isEmpty() ? true : false;
    }
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
        in.close();
    }

}
