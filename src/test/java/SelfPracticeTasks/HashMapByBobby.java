package SelfPracticeTasks;
import java.util.HashMap;
import java.util.Map;

public class HashMapByBobby {
    public static void main(String[] args ){
        int [] sockArr = { 1,1,10,10,10,12,12,14,15,16,16,17,17,17,17,17,18,18,18,99,100,100,100};
       // String [] sock2 ={"a","a","a","a","a","a","a","b","b","b"};
        Map< Integer,Integer> socks = new HashMap();

        for (int i = 0; i < sockArr.length; i++) {
            if(!socks.containsKey(sockArr[i])){
                socks.put(sockArr[i],1);
            }else{
                socks.put(sockArr[i],socks.get(sockArr[i])+1);
            }
        }
        System.out.println(socks);
        System.out.println(socks.get(9));


        int totalPairs =0;
        for (int i = 1; i <= 100 ; i++) {
            if(socks.get(i) != null ) totalPairs += socks.get(i)/2;
        }
        System.out.println(totalPairs);
    }
    }

