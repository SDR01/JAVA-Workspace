import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class countUniqueSSSLn {

    public static void uniqueStr(String s){
        int max = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<s.length();j++){
                sb.append(s.charAt(j));
                int num = checkDistinct(sb.toString());
                if(num>max){
                    max = num;
                    ans = sb.length();
                }
                else if(num==max){
                    ans = Math.min(ans, sb.length());
                }
            }
            
        }
        System.out.println(ans);
    }

    public static int checkDistinct(String s){
        Map<Character,Integer> hm = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))==false){
                hm.put(s.charAt(i), 1);
            }
        }
        return hm.size();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter String");
        String s = bf.readLine();

        uniqueStr(s);

    }
    
}
