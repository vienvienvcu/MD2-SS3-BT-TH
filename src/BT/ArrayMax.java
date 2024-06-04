package BT;

public class ArrayMax {
    public static void main(String[] args) {
        int [] [] array = {{1,2,3,4,5},{6,7,8,9,10}};
        int maxArray = array[0][0];
        System.out.println("gia tri lon nhat cua mang hai chieu la : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxArray<array[i][j]) {
                    maxArray = array[i][j];
                }
            }
        }
        System.out.println(maxArray);
    }
}
