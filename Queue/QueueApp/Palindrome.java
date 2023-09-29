package Queue.QueueApp;

import java.util.Scanner;

import Ch2Exceptions.StackOverflowException;
import Ch2Exceptions.StackUnderflowException;
import Ch2Stack.ArrayBoundedStack;
import Queue.Exceptions.QueueOverFlowException;
import Queue.Exceptions.QueueUnderFlowException;
import Queue.LinkedQueue.LinkedQueue;

public class Palindrome {
    public static void main(String[] args) throws QueueOverFlowException, StackOverflowException, QueueUnderFlowException, StackUnderflowException {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input.toLowerCase();

        LinkedQueue<Character> queue = new LinkedQueue<Character>();
        ArrayBoundedStack<Character> stack = new ArrayBoundedStack<Character>();
        
        for(int i = 0; i < input.length(); i++) {
            if(Character.isLetter(input.charAt(i))) {
                queue.enqueue(input.charAt(i));
                stack.push(input.charAt(i));
            }
        }

        boolean isPalindrome = true;
        while(!queue.isEmpty() && isPalindrome) {
            if(queue.dequeue() != stack.top()) {
                isPalindrome = false;
            }
            stack.pop();
        }
        System.out.println(isPalindrome);
    }
}
