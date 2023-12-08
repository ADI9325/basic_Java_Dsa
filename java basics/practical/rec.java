public class rec {

                    public static void fun(int n) {
                                        if (n == 0)
                                                            return;
                                        System.out.println(n);
                                        fun(n - 1);
                    }

                    public static int sum(int n) {
                                        int t_sum = 0;
                                        for (int i = 1; i <= n; i++) {
                                                            t_sum += i;
                                        }
                                        return t_sum;

                    }

                    public static int fact(int n) {
                                        if (n == 1)
                                                            return 1;
                                        return n * fact(n - 1);
                    }

                    public static int[] reverseArray(int arr[]) {
                                        int high = arr.length - 1;
                                        int low = 0;
                                        while (low <= high) {
                                                            // swap
                                                            int temp = arr[low];
                                                            arr[low] = arr[high];
                                                            arr[high] = temp;
                                                            low++;
                                                            high--;
                                        }

                                        return arr;
                    }

                    public static boolean paldandrome(String s) {
                                        int low = 0;
                                        int high = s.length() - 1;
                                        while (low <= high) {
                                                            if (s.charAt(high) == s.charAt(low)) {
                                                                                low++;
                                                                                high--;
                                                            } else {

                                                                                return false;

                                                            }
                                        }
                                        return true;
                    }

                    public static int fib(int n) {
                                        if (n <= 1)
                                                            return n;
                                        else {
                                                            return fib(n - 1) + fib(n - 2);
                                        }
                    }

                    public static void main(String[] args) {
                                        int n = 5;
                                        // fun(n);
                                        // System.out.println(sum(n));
                                        // int arr[] = { 1, 2, 3, 4, 5 };
                                        // System.out.println(fact(n));
                                        // reverseArray(arr);
                                        // for (int i = 0; i < arr.length; i++) {
                                        // System.out.println(arr[i]);
                                        // }

                                        // String s = "adbbda";
                                        // System.out.println(paldandrome(s));
                                        System.out.println(fib(10));

                    }

}
