import java.util.*;

public class Sortiong {

                    // public static void bubbleSort(int arr[]) {
                    // for (int i = 0; i <= arr.length; i++) {
                    // for (int j = 1; j <= arr.length - 1; j++) {
                    // if (arr[j - 1] > arr[j]) {
                    // // swap
                    // int temp = arr[j];
                    // arr[j] = arr[j - 1];
                    // arr[j - 1] = temp;
                    // }
                    // }
                    // }
                    // for (int i = 0; i < arr.length; i++) {
                    // System.out.println(arr[i]);
                    // }
                    // }

                    public static void main(String[] args) {
                                        Scanner sc = new Scanner(System.in);
                                        System.out.println("Enter the Array Size : ");
                                        int n = sc.nextInt();
                                        int arr[] = new int[n];
                                        for (int i = 0; i < n; i++) {
                                                            arr[i] = sc.nextInt();

                                        }
                                        // sort(arr);
                                        quickSort(arr, 0, arr.length - 1);

                                        printArray(arr);

                    }

                    // Java program for implementation of Insertion Sort
                    /* Function to sort array using insertion sort */
                    public static void sort(int arr[]) {
                                        int n = arr.length;
                                        for (int i = 1; i < n; i++) {
                                                            int key = arr[i];
                                                            int j = i - 1;

                                                            /*
                                                             * Move elements of arr[0..i-1], that are
                                                             * greater than key, to one position ahead
                                                             * of their current position
                                                             */
                                                            while (j >= 0 && arr[j] > key) {
                                                                                arr[j + 1] = arr[j];
                                                                                j = j - 1;
                                                            }
                                                            arr[j + 1] = key;
                                        }
                    }

                    /* A utility function to print array of size n */
                    static void printArray(int arr[]) {
                                        for (int value : arr) {
                                                            System.out.print(value + " ");
                                        }
                                        System.out.println();
                    }

                    // Driver method
                    // public static void main(String args[]) {
                    // int arr[] = { 12, 11, 13, 5, 6 };

                    // sort(arr);

                    // printArray(arr);
                    // }
                    static void quickSort(int arr[], int low, int high) {
                                        if (low < high) {
                                                            int parIndex = partion(arr, low, high);
                                                            quickSort(arr, low, parIndex - 1);
                                                            quickSort(arr, parIndex + 1, high);
                                        }
                    }

                    public static int partion(int[] arr, int low, int high) {
                                        int pivot = arr[high];
                                        int i = low - 1;

                                        for (int j = low; j < high; j++) {
                                                            if (arr[j] <= pivot) {
                                                                                i++;
                                                                                // swap arr[i] and arr[j]\
                                                                                int temp = arr[i];
                                                                                arr[i] = arr[j];
                                                                                arr[j] = temp;
                                                            }
                                        }

                                        int temp = arr[i + 1];
                                        arr[i + 1] = arr[high];
                                        arr[high] = temp;
                                        return i + 1;

                    }

}
