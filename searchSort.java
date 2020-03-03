/*****************************************************

Jose Ramirez
CSC 131 - TTH 1:30 pm
Search and Sorting Algorithms
February 25, 2020

*****************************************************/

import java.io.IOException;
import java.util.Scanner;

class searchSort {

    final static int MAX_ROWS = 5;
    final static int MAX_COLM = 4;
    final static int arr[][] = {{ 5, 3,  2, 16 }, 
                                { 9, 8, 10, 17 }, 
                                { 4, 7, 11, 18 }, 
                                { 2, 5,  9, 12 },
                                { 7, 9,  4, 10 }};

    public static void main(String[] args) throws IOException {
        int temp_arr[][];
        int user_input = 0;
        Scanner in = new Scanner(System.in);
         
        
        System.out.println("Original Array: \n");
        displayArray(arr);

        temp_arr = copyArray(arr);
        bubbleSort(temp_arr, MAX_ROWS - 1);
        System.out.println("\nFirst Column Ascending Bubble Sorted Array: \n");
        displayArray(temp_arr);

        temp_arr = copyArray(arr);
        selectionSort(temp_arr, MAX_ROWS - 1);
        System.out.println("\nSecond Column Descending Selection Sorted Array: \n");
        displayArray(temp_arr);

        temp_arr = copyArray(arr);
        shellSort(temp_arr, MAX_ROWS);
        System.out.println("\nThird Column Ascending Shell Sorted Array: \n");
        displayArray(temp_arr);

        temp_arr = copyArray(arr);
        insertionSort(temp_arr);
        System.out.println("\nFifth Row Ascending Insertion Sort Array: \n");
        displayArray(temp_arr);

        System.out.print("\nWhat number are you searching for in the 5th row? ");
        user_input = in.nextInt();

        System.out.println("\nColumn containing the number " + user_input);
        binarySearch(temp_arr, user_input);

        in.close();
    }

    public static void bubbleSort(int arr[][], int limit) {
        int temp = 0, columnToSort = 0;

        for (; limit > 0; limit--) {
            for (int index = 0; index < limit; index++) {
                if ( arr[index][columnToSort] > arr[index + 1][columnToSort] ) {
                    for (int j = 0; j < MAX_COLM; j++) {
                        temp = arr[index][j];
                        arr[index][j] = arr[index+1][j];
                        arr[index+1][j] = temp;
                    }
                }
            }
        }
    }
    public static void selectionSort(int arr[][], int limit)
    {
        int temp = 0, indexOfLargest = 0, columnToSort = 1;

        for(; limit > 0; limit--){
            indexOfLargest = 0;
            for(int index = 1; index <= limit; index++){
                if( arr[index][columnToSort] < arr[indexOfLargest][columnToSort] ){
                    indexOfLargest = index;
                }
            }
            if(limit != indexOfLargest){
                for(int j = 0; j < MAX_COLM; j++){
                    temp = arr[limit][j];
                    arr[limit][j] = arr[indexOfLargest][j];
                    arr[indexOfLargest][j] = temp;
                }
            }
        }
    }

    public static void shellSort(int arr[][], int n)
    {
        int temp = 0, columnToSort = 2;

        for(int gap = n/2; gap >= 1; gap = gap/2){
            for(int i = gap; i < n; i++){
                for(int j = i; j >= gap && arr[j-gap][columnToSort] > arr[j][columnToSort]; j = j - gap){
                    for(int column = 0; column < MAX_COLM; column++){
                        temp = arr[j-gap][column];
                        arr[j-gap][column] = arr[j][column];
                        arr[j][column] = temp;
                    }
                }
            }
        }
    }

    public static void insertionSort(int arr[][])
    {
        int temp = 0, rowToSort = MAX_ROWS - 1;

        for(int i = 1; i < MAX_COLM; i++){
            for(int j = i; j > 0 && arr[rowToSort][j - 1] > arr[rowToSort][j]; j--){
                for(int row = 0; row < MAX_ROWS; row++){
                    temp = arr[row][j];
                    arr[row][j] = arr[row][j-1];
                    arr[row][j-1] = temp;
                }
            }
        }
    }

    public static void binarySearch(int arr[][], int numToSearch)
    {
        int high = MAX_COLM - 1, low = 0, mid = 0;
        boolean found = false;

        while( high >= low && found != true){
            mid = (high + low) / 2;

            if(  numToSearch > arr[MAX_ROWS -1][mid] ){
                low = mid + 1;
            }
            else if( numToSearch < arr[MAX_ROWS - 1][mid] ){
                high = mid - 1;
            }
            else{
                found = true;
            }
        }

        if(found == true){
            for(int i = 0; i < MAX_ROWS; i++){
                System.out.println(arr[i][mid]);
            }
        }
        else {
            System.out.println(numToSearch + " was not found!");
        }

    }

    public static int[][] copyArray(int arr[][])
    {
        int temp_arr[][] = new int[MAX_ROWS][MAX_COLM];
        
        for(int i = 0; i < MAX_ROWS; i++){
            for(int j = 0; j < MAX_COLM; j++){
                temp_arr[i][j] = arr[i][j];
            }
        }

        return temp_arr;
    }

    public static void displayArray(int a[][])
    {
        for(int i = 0; i < MAX_ROWS; i++){
            for(int j = 0; j < MAX_COLM; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}