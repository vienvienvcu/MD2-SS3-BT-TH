package BT;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] numbers = {2,3,4,9,8,10};
        Scanner scanner = new Scanner(System.in);
        int indexDelete ;
        do {
            System.out.println("input index delete of array numbers: ");
            indexDelete = Integer.parseInt(scanner.nextLine());
            if (indexDelete < 0 ||indexDelete > numbers.length) {
                System.out.println("chi so phan tu can xoa phai > 0, vui long nhap lai: ");
            }else {
                break;
            }
        }while (true);
        int [] newNumbers = new int[numbers.length-1];
        for (int i = 0; i < newNumbers.length; i++) {
            if (i<indexDelete){
                newNumbers[i] = numbers[i];
            }else {
                newNumbers[i] = numbers[i+1];
            }
        }
        System.out.println("mang sau khi xao phan tu la: ");
        for (int i = 0; i < newNumbers.length; i++) {
            System.out.print(newNumbers[i]+" ");
        }
        System.out.println();
    }
}
