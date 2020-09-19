package by.andrey.twikssi.exer1uniquewordvocabulary.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueWordVocabularyTest {

    @Test
    public void addWord(){
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        String word = "Peter";
        uniqueWordVocabulary.addWord(word);
    }

}