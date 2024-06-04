package BT;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arrNumbers = {1,2,3,4,5,6,7,8,9};
        System.out.println("nhap gia tri can chen vao mang: ");
        int valueNumbers = Integer.parseInt(scanner.nextLine());
        int indexAdd;
        do {
            System.out.println("nhap vi tri can chen vao mang: ");
            indexAdd = Integer.parseInt(scanner.nextLine());
            if (indexAdd >= 0){
               break;
            }else {
                System.err.println("chi so can chen lon hon 0");
            }

        }while (true);
        int [] newArrNumbers ;

        if (indexAdd < arrNumbers.length){
            newArrNumbers = new int[arrNumbers.length + 1];
            for (int i = 0; i < newArrNumbers.length; i++){
                  if(i < indexAdd){
                      newArrNumbers[i] = arrNumbers[i];
                  }else if(i == indexAdd){
                      newArrNumbers[i] = valueNumbers;
                  }else {
                      newArrNumbers[i] = arrNumbers[i - 1];
                  }
            }
        }else {
            newArrNumbers = new int[indexAdd + 1];
            for (int i = 0; i < arrNumbers.length; i++){
                newArrNumbers[i] = arrNumbers[i];
            }
            newArrNumbers[indexAdd]= valueNumbers;
        }
        System.out.println("mang sau khi them phan tu la : ");
        for (int i = 0; i < newArrNumbers.length; i++){
            System.out.printf("%d\t", newArrNumbers[i]);
        }
        System.out.println();
    }

}