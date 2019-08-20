package javaSolutions;

import java.util.Arrays;

import java.util.Scanner;

public class pascalTriangle {

    public static int[][] pascalTriangles (int row){
        // construct pascal array as 2D
        int [][] pascal = new int[row][];

        for(int i = 0; i< row; i++) {
            // init the length of the 2D array for each corresponding row in pascal triangle
            pascal[i] = new int[i + 1];
            // input the first value in the 2D array  as 1 
            pascal[i][0] = 1;
            // if row is greater than 1, we need to loop through again and add values of current row by subtracting the values
            // of the previous row (i -1)
            for(int j= 1;j<i; j++) {
                pascal[i][j] = pascal[i -1][j] - pascal[i -1][j];
            }
            // last value in pascal triangle row is 1
            pascal[i][i] = 1;
            System.out.println(Arrays.deepToString(pascal));
        }

        return pascal;
    }

        public static void print(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(pascal(i, j) + " ");
                }
                System.out.println();
            }
        }
     
        public static int pascal(int i, int j) {
            if (j == 0) {
                return 1;
            } else if (j == i) {
                return 1;
            } else {
                return pascal(i - 1, j - 1) + pascal(i - 1, j);
            }
     
        }
     
    public static void main(String[] args) {
        pascalTriangles(5);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row number upto which Pascal's triangle has to be printed: ");
        int row = scanner.nextInt();
        print(row);

    }
}