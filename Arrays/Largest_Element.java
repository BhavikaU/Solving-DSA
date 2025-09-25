import java.util.*;

public class Largest_Element {
    static int sort(int arr[]) {  // ✅ Change return type to int
        Arrays.sort(arr);
        return arr[arr.length - 1];  // ✅ Returns largest element
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 85, 96, 102};
        System.out.println("Largest element is: " + sort(arr1));
    }
}
