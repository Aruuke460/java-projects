package SelfPracticeTasks;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        int [] socksArr = {11,22,33,44,3,77,40,90};
        Map <Integer,Integer> socks2 = new HashMap<>();

        for(int i = 0; i < socksArr.length; i++){
            if(!socks2.containsKey(socksArr[i])){
                socks2.put(socksArr[i],1);
            }
        }
    }
}
