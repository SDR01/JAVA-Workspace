
import java.io.*;


public class generateSubString {
    
    public static void generateSubStr(int n, String str){
        
        for(int i = 0; i<n; i++){
            StringBuilder st = new StringBuilder();
            for(int j = i; j<n; j++){
                st.append(str.charAt(j));
                System.out.println(st);
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Size of a string: ");
        int n = Integer.parseInt(bf.readLine());

        System.out.println("Enter the sum value K: ");
        String str = (bf.readLine());

        System.out.println(n);
        System.out.println(str);

        generateSubStr(n, str);
    }

}
