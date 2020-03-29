package EsensEx;

import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {

        Map<String, String> passwords = new java.util.HashMap<>();

        //key is eniyzov, value is - Cybertek
        //put
        passwords.put("eniyazov", "Cybertek");
        passwords.put("erica", "Cyber2");
        System.out.println(passwords.get("eniyazov"));

        //get
        System.out.println(passwords.get("eniyazov"));

        //remove
        System.out.println(passwords.remove("eniyazov"));
        //checking after remove
        System.out.println(passwords.get("eniyazov"));

        //keySet
        Set<String> keys = passwords.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}