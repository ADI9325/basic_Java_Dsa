import java.util.Stack;
import java.util.Scanner;

class copyStack {
                    public static void main(String[] args) {
                                        // --------------------------------------------------><---------------------------------------------------
                                        // Q) reverse Stack using another Stack
                                        // Stack<Integer> st1 = new Stack<>();
                                        // Scanner sc = new Scanner(System.in);
                                        // System.out.print("Enter the stack size : ");
                                        // int n = sc.nextInt();
                                        // for (int i = 0; i < n; i++) {
                                        // st1.push(sc.nextInt());
                                        // }
                                        // System.out.println("This is the new Stack st1 : " + st1);
                                        // Stack<Integer> st2 = new Stack<>();
                                        // // st2.push(15);
                                        // // st2.push(16);
                                        // // st2.push(17);
                                        // // st2.push(18);
                                        // while (!st1.isEmpty()) {
                                        // st2.push(st1.peek());
                                        // st1.pop();
                                        // }
                                        // System.out.println("This is the new Stack st2 : " + st2);
                                        // System.out.println("This is the st1 : " + st1);

                                        // ---------------------------><-------------------------------------------------------------------------

                                        // Stack<Integer> st1 = new Stack<>();
                                        // Scanner sc = new Scanner(System.in);
                                        // System.out.print("Enter the stack size : ");
                                        // int n = sc.nextInt();
                                        // System.out.print("Enter the index : ");
                                        // int index = sc.nextInt();
                                        // System.out.print("Enter the Index ");
                                        // int input = sc.nextInt();
                                        // for (int i = 0; i < n; i++) {
                                        // st1.push(sc.nextInt());
                                        // }
                                        // Stack<Integer> st2 = new Stack<>();
                                        // while (index-- > 0) {
                                        // st2.push(st1.peek());
                                        // st1.pop();

                                        // }
                                        // System.out.println("This us the st1 :" + st1);
                                        // System.out.println("This us the st2 :" + st2);
                                        // st1.push(input);
                                        // while (!st2.isEmpty()) {
                                        // st1.push(st2.peek());
                                        // st2.pop();

                                        // }
                                        // System.out.println("This us the st1 :" + st1);

                                        Stack<Integer> st1 = new Stack<>();
                                        Scanner sc = new Scanner(System.in);
                                        System.out.print("Enter the stack size : ");
                                        int n = sc.nextInt();
                                        for (int i = 0; i < n; i++) {
                                                            st1.push(sc.nextInt());
                                        }
                                        displayStack(st1);

                    }

                    public static void displayStack(Stack<Integer> st) {
                                        if (st.isEmpty()) {
                                                            return;
                                        }
                                        System.out.println(st.peek());
                                        st.pop();
                                        displayStack(st);

                    }
}