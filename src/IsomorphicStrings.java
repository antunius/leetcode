import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);
            if (!map.containsKey(key)) {
                if (map.containsValue(value)) return false;
                map.put(key, value);
            } else {
                Character found = map.get(key);
                if (found != value) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(IsomorphicStrings.isIsomorphic("egg", "add"));
    }
}
