package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1){
        //实现练习要求，并改写该行代码。
        Map<String,Integer> map = new HashMap<String,Integer>();
        for (String str : collection1){
            if (str.length() == 1){
                if (map.containsKey(str)){
                    map.put(str, map.get(str).intValue()+1);
                }else {
                    map.put(str, 1);
                }
            }else {
                if (str.length()==5 && str.charAt(4)==']'){
                    map.put(Character.toString(str.charAt(0)),map.containsKey(Character.toString(str.charAt(0))) ? Integer.parseInt(str.substring(2,4))+map.get(Character.toString(str.charAt(0))).intValue() : Integer.parseInt(str.substring(2,4)));
                }else{
                    map.put(Character.toString(str.charAt(0)),map.containsKey(Character.toString(str.charAt(0))) ? map.get(Character.toString(str.charAt(0))).intValue()+(str.charAt(2)-'0') : str.charAt(2)-'0');
                }
            }
        }

        return map;
    }
}
