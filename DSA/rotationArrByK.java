import java.util.*;
import java.io.*;

public class rotationArrByK {
    
    public static void rotateArr(int n, int k, int[] arr){
        
        int r = k%n;
        System.out.println("rotations: "+r);
        reverseArr(arr,0,n-1);
        reverseArr(arr,0,r-1);
        reverseArr(arr,r,n-1);
        StringBuilder s = new StringBuilder();
        for(int i=0;i<n;i++){
            s.append(arr[i]+" ");
        }
        System.out.println(s);
        
    }
    
    public static int[] reverseArr(int[] arr, int l, int r){
        while(l<r){
            System.out.println("before rev arr: "+ Arrays.toString(arr));
            swap(arr,l,r);
            l++;
            r--;
        }
        System.out.println("rev arr: "+ Arrays.toString(arr));
        return arr;
    }
    
    public static int[] swap(int[] arr, int i, int j){
        System.out.println("before swap arr: "+ Arrays.toString(arr));
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println("swap arr: "+ Arrays.toString(arr));
        return arr;
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

        rotateArr(n,k,arr);
    } 
    
}
