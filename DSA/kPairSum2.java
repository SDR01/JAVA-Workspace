import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class kPairSum2 {

    private static boolean checkSumK(int n, int[] arr, int k) {

        Arrays.sort(arr);  // randomised quick sort 
        int left = 0;
        int right = n-1;

        while(left < right){
            if(arr[left] + arr[right] == k){
                return true;
            }
            else if(arr[left] + arr[right] < k){
                left++;
            }
            else right--;
        }
        return false;
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

        System.out.println("Enter the sum value K: ");
        int k = Integer.parseInt(bf.readLine());

        System.out.println(n);
        System.out.println(Arrays.toString(arr));

        System.out.println(checkSumK(n,arr,k));
    }
}

// TC = O(nlogn);