import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class kPairSum3 {

    private static int[] checkSumK(int n, int[] arr, int k) {
        int[] obj = {0,0};
        Map<Integer, Integer> hm  = new HashMap<>();
        for(int i=0; i<n ;i++){
            if(hm.containsKey(k-arr[i])){
                obj[0] = hm.get(k-arr[i]);
                obj[1] = i;
                break;
            }
            else hm.put(arr[i], i);
        }
        return obj;
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

        int[] res = checkSumK(n,arr,k);
        System.out.println(Math.min(res[0],res[1]) + " " + Math.max(res[0], res[1]));
    }
}

// TC = O(N);
// SC = O(N);
// Note SC will be o(1) if quick sort is used, o(N) if merge sort is used.