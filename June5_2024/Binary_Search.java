package June5_2024;

import java.util.Scanner;

public class Binary_Search {
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
        System.out.println("Enter search element");
        int element = sc.nextInt();

        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] == element){
                System.out.println("Index is " + mid);
                return;
            }

            if(element > arr[mid]){
                low = mid+1;
            }

            else{
                high = mid-1;
            }
        }
        System.out.println("Element not Found");


    }
}
