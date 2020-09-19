package by.andrey.twikssi.exer2uniquewordcounter.service;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    Map<String, Integer> map;

    public UniqueWordCounter() {
        this.map = new HashMap<String, Integer>();
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void addWord(String word){
        if (map.containsKey(word)){
            int counter = map.get(word);
            counter++;
            map.put(word,counter);
        } else{
            map.put(word,1);
        }
    }
}
