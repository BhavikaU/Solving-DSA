import java.util.*;

public class MissingNumber{
public static void main(String[] args)
{
   int N = 5;
   int arr[] = {1,2,4,5};

   int ans = missingnumber1(arr,N);
    int ans1 = missingnumber2(arr,N);

   System.out.println("This is the Missing Number " + ans );
   System.out.println("This is the Missing Number " + ans1 );
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

//Optimal Approch

public static int missingnumber2(int arr[], int N)
{
    int sum1 = (N * (N + 1)) / 2;
    int sum2 = 0;
    for(int i=0;i<N-1; i++)
    {
        sum2 = sum2 + arr[i];
    }

    int missing = sum1 - sum2;
    return missing;
}

}