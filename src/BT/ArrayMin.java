package BT;

public class ArrayMin {
    public static void main(String[] args) {
        int [] arrNumbers = {2,3,4,6,1,7,8};
        int arrNumberMin = arrNumbers[0];
        for (int i = 0; i < arrNumbers.length; i++)
            if (arrNumbers[i] < arrNumberMin) {
                arrNumberMin = arrNumbers[i];
            }
        System.out.println(arrNumberMin);
    }
}
