import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("admin", "Aa123456");
        System.out.println(users.get("admin"));
    }
}
