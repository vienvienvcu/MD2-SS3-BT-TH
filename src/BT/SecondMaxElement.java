package BT;

public class SecondMaxElement {
    public static void main(String[] args) {
        int[] arrNumbers = {9, 20, 10, 23, 8, 6};
        int firstMax = arrNumbers[0];
        System.out.println("so lon nhat trong mang la : ");
        int maxIndex = 0;
        for (int i = 0; i < arrNumbers.length; i++) {
            if (firstMax < arrNumbers[i]) {
                firstMax = arrNumbers[i];
                maxIndex = i;
            }
        }
        System.out.printf("%d\n", firstMax);
        System.out.println(maxIndex);
        int[] newArrNumbers = new int[arrNumbers.length - 1];
        for (int i = 0; i < newArrNumbers.length; i++) {
            if (i < maxIndex) {
                newArrNumbers[i] = arrNumbers[i];
            } else {
             newArrNumbers[i] = arrNumbers[i+1];
            }
        }
        System.out.println("New array numbers: ");
        for (int i = 0; i < newArrNumbers.length; i++) {
            System.out.printf("%d\n",newArrNumbers[i]);
        }
        System.out.println("so thu hai lon nhat trong mang la: ");
        int secondMax = newArrNumbers[0];
        for (int i = 1; i < newArrNumbers.length; i++) {
            if (newArrNumbers[i] > secondMax) {
                secondMax = newArrNumbers[i];
            }
        }
        System.out.printf("%d\n",secondMax);
    }
}
