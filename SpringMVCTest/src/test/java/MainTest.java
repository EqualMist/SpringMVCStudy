import com.alibaba.fastjson.JSONObject;
import com.zzy.entity.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MainTest {

    @Test
    public void test() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("names", Arrays.asList("Tom", "Jerry", "Mike"));
        jsonObject.put("user", new User(1, "爱丽希雅", "123456"));
        jsonObject.put("age", 18);
        System.out.println(jsonObject.toString());
    }
}
