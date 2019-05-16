package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> map = new HashMap<String,Integer>();
        for (String str : collection1){
            if (map.containsKey(str)){
                map.put(str, map.get(str).intValue()+1);
            }else {
                map.put(str, 1);
            }
        }
        return map;
    }
}
