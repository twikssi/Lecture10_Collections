package by.andrey.twikssi.exer1uniquewordvocabulary.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
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
}
