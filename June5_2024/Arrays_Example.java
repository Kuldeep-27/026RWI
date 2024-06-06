package June5_2024;

import java.util.Scanner;



public class Arrays_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter "+size+" elements");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        int maxi = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > maxi)
                maxi = arr[i];
        }
        System.out.println("Max Element is "+ maxi);
    }
}
