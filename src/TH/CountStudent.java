package TH;

import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter the size of the array");
            size= sc.nextInt();
            if (size>30){
                System.out.println("enter less than 30");
            }
            array = new int[size];
//            nhap gia tri cho cac phan tu mang
            int i = 0;
            while (i < array.length){
                System.out.println("enter a mark for student "+(i+1)+":");
                array[i]= sc.nextInt();
                i++;
            }
            int count=0;
            System.out.println("List of mark");
            for (int j = 0; j< array.length; j++){
                System.out.print(array[j] + "\t");
                if (array[j] >=5 && array[j] <=10){
                    count++;
                }
            }
            System.out.print("\n The number of students passing the exam is: " + count);
        }while (size >30);
    }

}
