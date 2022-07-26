
package bai1;

import java.util.Scanner;

public class Bai1 {
    public static double tbc(int[] a){
    int dem=0;
        int tong=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0 && a[i]%2!=0){
                tong=tong+a[i];
                dem=dem+1;
            }
        }
        return (double)tong/dem;
}
    public static int snn(int[] a){
        int snn=a[0];
        int b=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<= snn){
                a[i]=snn;
                b=i;
            }
        }
        return b;
        }
    public static void scp(int[] a){
        System.out.print("so chinh phuong la:");
        for(int i=0;i<a.length;i++){
            if(Math.sqrt(a[i])*Math.sqrt(a[i])==a[i]){
                System.out.print(a[i]+ " ");
            }
                
        }
    }
    public static void snt(int[] a){
        for(int i=0;i<a.length;i++){
            if(checksnt(a[i])==true){
                System.out.print(a[i]+" ");
            }
        }
    }
    public static boolean checksnt(int b){
        if(b<0)
            return false;
        for(int i=2;i<=Math.sqrt(b);i++){
            if(b%i==0)
                return false;
        }
        return true;
    }
    public static void sapxep(int[] a){
        for(int i= 0 ; i< a.length -1 ; i++){
            for(int j = i+1; j<a.length ; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap vao n:");
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.print("a["+i+"]=");
            a[i]= sc.nextInt();
        }
        
        System.out.println("trung binh cong cac so le o vi tri chan la:"+tbc(a));
        
        System.out.println("vi tri so nho nhat la:"+snn(a));
        scp(a);
        System.out.print("\nso nguyen to la:");
        snt(a);
        System.out.print("\nmang sau khi sap xep la:");
        sapxep(a);
    }
        
}
