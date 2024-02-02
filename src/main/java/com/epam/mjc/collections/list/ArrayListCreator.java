package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> result = new ArrayList<>();
        int counter = 2;
        for(int i = 0; i < sourceList.size(); i++){
            if (counter == i){
                result.add(sourceList.get(i));
                result.add(sourceList.get(i));
                counter+=3;
            }
        }
        return result;
    }
}