import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class maxSubArrSum {

    public static void maxSubArr(int n, int[] arr, int k){
        int max_sum = 0;

        for(int i=0;i<k;i++){
            max_sum += arr[i];
        }

        int curr_sum = max_sum;

        for(int i=k;i<n;i++){
            curr_sum = curr_sum - arr[i-k] + arr[i];
            max_sum = Math.max(curr_sum, max_sum); 
        }
        System.out.println("Maximum sum of "+ k + " size sub array is "+max_sum);
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Size of an array to: ");
        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter "+ i +" Number to Array: ");
            arr[i] = Integer.parseInt(bf.readLine());
        }

        System.out.println("Enter sub array size k: ");
        int k = Integer.parseInt(bf.readLine());

        System.out.println(n);
        System.out.println(Arrays.toString(arr));
        maxSubArr(n,arr,k);
    }

}
