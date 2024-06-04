package BT;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "hello world";
        System.out.println("nhap vao ban phim tu ki muon nhap");
        char c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        if (count == 0){
            System.out.println("ki tu ko ton tai");
        }else {
            System.out.println("ki tu nhap va so lan xuat hien la: " + c + ","+ count);
        }
    }
}
