import java.util.Stack;
import java.util.Scanner;

class copyStack {
                    public static void main(String[] args) {

                                        Stack<Integer> st1 = new Stack<>();
                                        Scanner sc = new Scanner(System.in);
                                        System.out.print("Enter the stack size : ");
                                        int n = sc.nextInt();
                                        for (int i = 0; i < n; i++) {
                                                            st1.push(sc.nextInt());
                                        }
                                        // System.out.println("This is origianal stack : ");
                                        // displayStack(st1);

                                        // System.out.println("This is reversal stack : ");
                                        // displayRevStack(st1);

                                        // System.out.println("Remove bottom element : ");
                                        // pushAtBottom(st1);

                                        // pushAtBottomRec(st1, 12);
                                        // System.out.println(st1);

                                        reverseStackRec(st1, 0);

                                        // ----->Q) reverse Stack using another Stack<--------------
                                        /*
                                         * Stack<Integer> st1 = new Stack<>();
                                         * Scanner sc = new Scanner(System.in);
                                         * System.out.print("Enter the stack size : ");
                                         * int n = sc.nextInt();
                                         * for (int i = 0; i < n; i++) {
                                         * st1.push(sc.nextInt());
                                         * }
                                         * System.out.println("This is the new Stack st1 : " + st1);
                                         * Stack<Integer> st2 = new Stack<>();
                                         * // st2.push(15);
                                         * // st2.push(16);
                                         * // st2.push(17);
                                         * // st2.push(18);
                                         * while (!st1.isEmpty()) {
                                         * st2.push(st1.peek());
                                         * st1.pop();
                                         * }
                                         * System.out.println("This is the new Stack st2 : " + st2);
                                         * System.out.println("This is the st1 : " + st1);
                                         */

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

                    }
                    // ----------->origianl order print a stack element<---------

                    /*
                     * public static void displayStack(Stack<Integer> st) {
                     * if (st.size() == 0) {
                     * return;
                     * }
                     * int top = st.pop();
                     * displayStack(st);
                     * System.out.println(top);
                     * 
                     * }
                     */

                    // ----------------->This is an reversal print <------
                    /*
                     * public static void displayRevStack(Stack<Integer> st) {
                     * if (st.size() == 0) {
                     * return;
                     * }
                     * int top = st.pop();
                     * 
                     * System.out.println(top);
                     * displayRevStack(st);
                     * 
                     * }
                     */

                    // ----->Push at Bottom<----------
                    /*
                     * public static void pushAtBottom(Stack<Integer> st) {
                     * if (st.isEmpty()) {
                     * return;
                     * }
                     * Stack<Integer> st1 = new Stack<Integer>();
                     * while (st.size() != 1) {
                     * st1.push(st.pop());
                     * }
                     * if (st.size() == 1)
                     * st.pop();
                     * while (!st1.isEmpty()) {
                     * st.push(st1.pop());
                     * }
                     * System.out.println(st);
                     * 
                     * }
                     */

                    // ----->Push at Bottom recurcively<----------
                    /*
                     * public static void pushAtBottomRec(Stack<Integer> st, int item) {
                     * if (st.isEmpty()) {
                     * st.push(item);
                     * 
                     * } else {
                     * int temp = st.pop();
                     * pushAtBottomRec(st, item);
                     * st.push(temp);
                     * }
                     * 
                     * }
                     */

                    public static void reverseStackRec(Stack<Integer> st, int item) {
                                        if (st.) {
                                                            return;

                                        } else {
                                                            int temp = st.pop();
                                                            reverseStackRec(st, item);
                                                            st.push(temp);
                                        }

                    }

}