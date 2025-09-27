import java.util.*;

public class MissingNumber{
public static void main(String[] args)
{
   int N = 5;
   int arr[] = {1,2,4,5};

   int ans = missingnumber1(arr,N);

   System.out.println("This is the Missing Number " + ans );
}

// Brute Approch -> Linear Search
public static int missingnumber1(int arr[] , int N)
{
    for(int i=1; i <= N; i++)
    {
        int flag = 0;

        for(int j=0; j<N-1; j++)
        {
            if(arr[j] == i)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 0) return i;


    }
    return -1; // return -1 if no number is missing (edge case)
}
}