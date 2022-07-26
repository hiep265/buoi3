
package bai2;

import java.util.Scanner;
public class Bai2 {

   
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("nhap vao chuoi s:");
    String s=sc.nextLine();
    for(char i='0'; i<='9';i++){
        s=s.replace(i+"", "");
    }
    
s=s.trim().toLowerCase();
        s=s.replaceAll("\\s+", " ");
        System.out.print("mang sau khi sua la:nguy");
    System.out.print(s);
}
}
