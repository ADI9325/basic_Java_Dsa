import java.util.Scanner;

public class quickSort {

                    static void quickSort1(int arr[], int low, int high) {
                                        if (low < high) {
                                                            int partIndx = partionSort(arr, low, high);
                                                            quickSort1(arr, low, partIndx - 1);
                                                            quickSort1(arr, partIndx + 1, high);
                                        }
                    }

                    static int partionSort(int arr[], int low, int high) {
                                        int piv = arr[high];
                                        int i = low - 1;
                                        for (int j = low; j < high; j++) {
                                                            if (arr[j] <= piv) {
                                                                                i++;
                                                                                // swap
                                                                                int temp = arr[j];
                                                                                arr[j] = arr[i];
                                                                                arr[i] = temp;
                                                            }
                                        }
                                        int temp = arr[i + 1];
                                        arr[i + 1] = arr[high];
                                        arr[high] = temp;
                                        return i + 1;
                    }

                    static void printArray(int arr[]) {
                                        for (int value : arr) {
                                                            System.out.print(value + " ");
                                        }
                                        System.out.println();
                    }

                    public static void main(String[] args) {
                                        Scanner sc = new Scanner(System.in);
                                        System.out.println("Enter the Array Size : ");
                                        int n = sc.nextInt();
                                        int arr[] = new int[n];
                                        for (int i = 0; i < n; i++) {
                                                            arr[i] = sc.nextInt();

                                        }
                                        // sort(arr);
                                        quickSort1(arr, 0, arr.length - 1);

                                        printArray(arr);

                    }

}
