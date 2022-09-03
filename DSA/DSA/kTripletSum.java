import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;


public class kTripletSum {

    public static boolean checkTripletSum(int n, int[] arr, int k) {
       
        Arrays.sort(arr);

        for(int i = 0; i < n-1; i++){

            int left = i + 1;
            int right = n - 1;

            while(left < right){

                if(arr[i] + arr[left] + arr[right] == k){
                    return true;
                }
                else if(arr[i] + arr[left] + arr[right] < k){
                    left++;
                }
                else right--;

            }

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

        System.out.println(checkTripletSum(n,arr,k));
    }
}

// TC = O(n²);