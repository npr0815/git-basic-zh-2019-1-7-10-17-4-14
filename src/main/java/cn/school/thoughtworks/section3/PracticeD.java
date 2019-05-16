package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String str : collectionA){
            if (map.containsKey(str)){
                map.put(str, map.get(str).intValue()+1);
            }else {
                map.put(str, 1);
            }
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getKey().length() > 1){
                map.remove(entry.getKey());
                map.put(Character.toString(entry.getKey().charAt(0)), entry.getKey().charAt(2)-'0');
            }
        }

        for (String str : object.get("value")){
            map.put(str, map.get(str)-(map.get(str)/3));
        }
        return map;
    }
}
