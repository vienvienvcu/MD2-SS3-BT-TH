package BT;

import java.util.Scanner;

public class ArraySumCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arrNumbers = {{1,2,3},{4,5,6}};
        System.out.println("nhap so col can tinh tong");
        int indexCol = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < arrNumbers.length; i++) {
            sum += arrNumbers[i][indexCol];
        }
        System.out.println("tong cua cac cot can tinh la: "+ sum);
    }
}
