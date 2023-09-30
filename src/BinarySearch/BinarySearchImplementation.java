package BinarySearch;

import java.util.Scanner;

public class BinarySearchImplementation {

    public static void main(String[] args) {
        int n, item, i, c=0,mid=0,end,beg;
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements to be entered");
        n = sc.nextInt();
        a = new int[n]; // n size array

        System.out.println("Enter elements");

        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();


        System.out.println("Enter item to find");
        item = sc.nextInt();

        beg=0;end=n-1;
        while (beg<=end)
        {
            mid=(beg+end)/2;
            if(item==a[mid])
            {
                c++;
                break;
            }
            else if (item>a[mid])
            {
                beg=mid+1;

            }
            else if (item<a[mid])
            {
                end=mid-1;
            }
        }
        if(c>0)
        {
            System.out.println("item found at "+mid);
        }
        else
        {
            System.out.println("item not found");
        }
    }
}
