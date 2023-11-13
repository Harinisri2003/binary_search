import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter target: ");
        int target=sc.nextInt();
        int a[]=new int[10];
        System.out.println("enter values: ");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int start=0;
        int end=9;
        
        while(start<=end)
        {
           int mid=(start+end)/2; //6
           if(target>a[mid])  //13>12
           {
            start=mid+1;  //3
           } 
           else if(target<a[mid]) //13<15
           {
            end=mid-1; //end=8
           }
           else
           {
            System.out.println("Index is "+mid);
            System.exit(0);
           }
        }
        System.out.print("not found");
    }
}
