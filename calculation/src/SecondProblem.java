import java.util.HashMap;
import java.util.Map;

class SecondProblem implements Calculate {
    @Override
    public void calculate1() {
        int money = 500;
        Map<String, Integer> map = new HashMap<>();
        map.put("drive", 500);
        map.put("car", 300);
        map.put("plane", 1000);
        map.put("train", 400);

        for (String key : map.keySet()) {
            if (map.get(key) <= money) {
                System.out.println("可以乘坐："+ key + "，价格是：" + map.get(key));
            }
        }
    }
}