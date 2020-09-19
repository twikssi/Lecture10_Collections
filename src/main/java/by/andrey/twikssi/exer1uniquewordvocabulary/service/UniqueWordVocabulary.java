package by.andrey.twikssi.exer1uniquewordvocabulary.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    public static final Logger log = LoggerFactory.getLogger(UniqueWordVocabulary.class);
    private Set<String> set;

    public Set<String> getSet() {
        return set;
    }

    public void addWord(String word) {
        if (word != null) {
            if(!(word.equals(""))){
                set = new HashSet<>();
                set.addAll(Arrays.asList(word.split(" ")));
            }
        }
    }

    public int getWorsCount() {
        return set.size();
    }

    @Override
    public String toString() {
        return "UniqueWordVocabulary{" +
                "set=" + set +
                '}';
    }

    public void printVocabulary(){
        log.info("{}",toString());
    }
}
