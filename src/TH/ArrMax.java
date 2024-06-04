package TH;

import java.util.Scanner;

public class ArrMax {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter the size of the array");
            size = scanner.nextInt();
            if (size >20) {
                System.out.println("Size should not exceed 20\"");
            }
        }while (size > 20);

//        nhap gia tri cho cac mang

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("enter element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
//        in ra danh sach tai sna da nhap
        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " \t");
        }
//        tim gia tri lon nhat trong mang
        int max = array[0];
        int index = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);

    }
}
