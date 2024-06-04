package BT;

public class ArraySum {
    public static void main(String[] args) {
        System.out.println("gia tri sum can tim la");
        int [][] arrNumbers = {{1,2,3},{6,7,8}};
        int sum = 0;
        for (int i = 0; i < arrNumbers.length; i++) {
            for (int j = 0; j < arrNumbers[i].length; j++) {
                if (i==j){
                    sum+=arrNumbers[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}
