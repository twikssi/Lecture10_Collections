package by.andrey.twikssi.exer1uniquewordvocabulary.service;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    private Set<String> set;

    public Set getSet() {
        return set;
    }

    public UniqueWordVocabulary() {
        this.set = new HashSet<>();
    }

    public void addWord(String word) {
        if (word != null) {
            if(!(word.equals(""))){
                set.add(word);
            }
        }
    }
}
