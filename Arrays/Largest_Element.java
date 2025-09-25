// package Arrays;
import java.util.*;
//with sorting
public class Largest_Element {
    static int largestelement1(int arr[]) {  // ✅ Change return type to int
        Arrays.sort(arr);
        return arr[arr.length - 1];  // ✅ Returns largest element

    }
    //With out sorting
    static int largestelement2(int arr[])
    {
        int max = arr[0];
        for(int i=1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];

            }
        }
        return max;
    }
    
    

    public static void main(String[] args) {
        int[] arr1 = {5, 85, 96, 102};
        System.out.println("Largest element is: " + largestelement1(arr1));
        System.out.println("Largest element is:(without sorting) " + largestelement2(arr1));
    }
}
