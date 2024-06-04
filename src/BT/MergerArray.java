package BT;

public class MergerArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9,10};
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int newArrLength = arr1Length+ arr2Length;
        System.out.println(newArrLength);
        int [] newArr = new int[newArrLength];
        int i;
        for  (i = 0; i <arr1Length; i++) {
            newArr[i] = arr1[i];
        }
        for(i = 0; i <arr2Length; i++) {
            newArr[arr1Length + i] = arr2[i];
        }
        for(i = 0; i <newArrLength; i++) {
            System.out.printf("%d\t", newArr[i]);
        }
        System.out.println();
    }
}
