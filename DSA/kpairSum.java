import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class kpairSum{

    public static void checkSumK(int n, int[] arr, int k){

        for(int i = 0; i < n-1; i++){

            for(int j = i+1; j < n; j++){

                if(arr[i] + arr[j] == k){
                    System.out.println("Yes the sum of "+ arr[i] + " & " + arr[j] + " is K");
                }

            }
        }

    }

    public static void main(String[] args) throws IOException{

        
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

        checkSumK(n,arr,k);
    }
}

// TC = O(n²);