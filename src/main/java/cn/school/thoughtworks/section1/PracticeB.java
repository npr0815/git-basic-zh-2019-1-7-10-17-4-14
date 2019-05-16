package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> list1 = new ArrayList<String>(collection1);
        List<List<String>> list2 = new ArrayList<List<String>>(collection2);
        list1.retainAll(list2.get(0));

        return list1;
    }
}
