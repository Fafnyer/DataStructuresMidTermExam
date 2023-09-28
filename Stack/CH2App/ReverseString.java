package CH2App;

import java.util.Scanner;

import Ch2Exceptions.StackOverflowException;
import Ch2Exceptions.StackUnderflowException;
import Ch2Stack.*;

public class ReverseString {
    public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
        Scanner in = new Scanner(System.in);
        StackInterface<String> stringStack;
        stringStack = new ArrayBoundedStack<String>(5);

        StackInterface<Integer> intStack;
        intStack = new ArrayBoundedStack<Integer>(5);

        String line;
        for(int i = 0; i < 6; i++) {
            try {
                System.out.println("Enter a string: ");
                line = in.nextLine();
                stringStack.push(line);
            } catch (StackOverflowException e) {
                e.printStackTrace();
            }
        }
 
        System.out.println();

        while(!stringStack.isEmpty()) {
            try {
                line = stringStack.top();
                stringStack.pop();
                System.out.println(line);
            } catch (StackUnderflowException e) {
                e.printStackTrace();
            }
        }

        in.close();
    }
}
