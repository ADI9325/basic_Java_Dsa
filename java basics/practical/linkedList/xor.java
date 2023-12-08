import java.util.Arrays;

public class xor {
                    static void single(int[] arr) {
                                        int ans = 0;
                                        // Arrays.sort(arr);
                                        for (int i = 0; i < arr.length; i++) {
                                                            ans = ans ^ arr[i];

                                        }
                                        System.out.println(ans);

                    }

                    static int printXOR(int n) {
                                        if (n % 4 == 0)
                                                            return n;
                                        if (n % 4 == 1)
                                                            return 1;
                                        if (n % 4 == 2)
                                                            return n + 1;
                                        if (n % 4 == 3)
                                                            return 0;

                                        return 0;
                    }

                    static int printLtoRxor(int l, int r) {
                                        int n = 0;
                                        if (l % 4 == 0)
                                                            n = l;
                                        if (l % 4 == 1)
                                                            n = 1;
                                        if (l % 4 == 2)
                                                            n = l + 1;
                                        if (l % 4 == 3)
                                                            n = 0;

                                        int p = 0;
                                        if (r % 4 == 0)
                                                            p = r;
                                        if (r % 4 == 1)
                                                            p = 1;
                                        if (r % 4 == 2)
                                                            p = r + 1;
                                        if (r % 4 == 3)
                                                            p = 0;

                                        int ans = n ^ (p - 1);
                                        return ans;
                    }

                    public static boolean checkOddOrEven(int n) {
                                        if ((n & 1) == 0)
                                                            return true;
                                        else
                                                            return false;
                    }

                    public static void bitSet(int n, int i) {
                                        int mask = 1 >> i;
                                        if ((mask & 1) == 1)
                                                            System.out.println("set");
                                        else {
                                                            System.out.println("NotSet");
                                        }

                    }

                    public static void main(String[] args) {
                                        int arr[] = { 1, 2, 3, 4, 5, 5, 6, 4, 3, 2, 1 };
                                        single(arr);
                                        System.out.println(printXOR(5));
                                        System.out.println(printLtoRxor(3, 8));
                                        if (checkOddOrEven(6) == true)
                                                            System.out.println("This is a even Number");
                                        else
                                                            System.out.println("This is a odd Number");

                                        bitSet(17, 3);

                    }

}
