package by.andrey.twikssi.exer2uniquewordcounter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    Map<String, Integer> map;
    public static final Logger log = LoggerFactory.getLogger(UniqueWordCounter.class);

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

    public String getMostFrequentWord(){
        int counter = 0;
        String frequentWord = "";
        for (Map.Entry<String, Integer> map : map.entrySet()) {
            if(map.getValue() > counter){
                counter = map.getValue();
                frequentWord = map.getKey();
            }
        }
        return frequentWord;
    }

    @Override
    public String toString() {
        return "UniqueWordCounter{" +
                "map=" + map +
                '}';
    }

    public void printWordsFrequency(){
        log.info(toString());
    }
}
