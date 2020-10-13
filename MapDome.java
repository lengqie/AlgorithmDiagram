package cn.devd.algorithmdiagram;

import java.util.HashMap;

public class MapDome {
    public static void main(String[] args) {
        HashMap<String, Integer> map =new HashMap<>();
        map.put("张三", 33);
        map.put("李四", 19);
        map.put("王心怡", 24);
        System.out.println(map.get("张三"));
    }
}
