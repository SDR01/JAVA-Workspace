import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class dutchNFAlgo {

    public static void separatorDNF(int n, int[] arr){
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            switch(arr[mid]){
                case 0 : {
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                }
                case 1 : {
                    mid++;
                    break;
                }
                case 2 : {
                    swap(arr, mid, high);
                    high--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return arr;
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
        separatorDNF(n,arr);
    }
    
}
