import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class removeDuplicates {

    public static void removeDuplicatesSArr(int n, int[] arr){
        int j = 0;

        for(int i=0;i<n-2;i++){
            if(arr[i] != arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }

        arr[j] = arr[n-1];

        for(int i=0;i<=j;i++){
            System.out.println(arr[i]);
        }
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

        System.out.println(n);
        System.out.println(Arrays.toString(arr));
        removeDuplicatesSArr(n,arr);
    }

}
