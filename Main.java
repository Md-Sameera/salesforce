import java.util.*;
public class Main {

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    public int pop() {
        if (q1.peek() == null) {
            System.out.println("The stack is empty, nothing to return");
            int i = 0;
            return i;
        } else {
            int pop = q1.remove();
            return pop;
        }
    }

    public void push(int data) {

        if (q1.peek() == null) {
            q1.add(data);
        } else {
            for (int i = q1.size(); i > 0; i--) {
                q2.add(q1.remove());
            }
            q1.add(data);
            for (int j = q2.size(); j > 0; j--) {
                q1.add(q2.remove());
            }

        }
    }

    public static void main(String[] args) {
        Main s1 = new Main();
        System.out.println("Pushing the elemets into the stack ");
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        
        System.out.println("Removing the elemets from stack ");
        System.out.println("Removing the top element of the stack " + s1.pop());
        System.out.println("Removing the 2nd  top element of the stack = " + s1.pop());
        System.out.println("Removing the 3rd top element of the stack =  " + s1.pop());
        System.out.println("Removing the 4th top element of the stack =  " + s1.pop());
    }
}
