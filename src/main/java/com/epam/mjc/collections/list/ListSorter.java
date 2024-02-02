package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int result = (int) ((5 * Math.pow(Integer.parseInt(a), 2) + 3) - (5 * Math.pow(Integer.parseInt(b), 2) + 3));
        if(result == 0){
            return a.compareTo(b);
        }
        return result;
    }
}