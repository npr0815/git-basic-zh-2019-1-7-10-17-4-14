package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> map = new HashMap<String,Integer>();
        for (String str : collection1){
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

        return map;
    }
}
