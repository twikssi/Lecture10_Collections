package by.andrey.twikssi.exer1uniquewordvocabulary.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueWordVocabularyTest {

    @Test
    public void addWord(){
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        String word = "Peter hi what`s up";
        uniqueWordVocabulary.addWord(word);

        assertTrue(uniqueWordVocabulary.getSet().contains("Peter"));
        assertTrue(uniqueWordVocabulary.getSet().contains("hi"));
        assertTrue(uniqueWordVocabulary.getSet().contains("what`s"));
        assertTrue(uniqueWordVocabulary.getSet().contains("up"));
    }

    @Test
    public void addWordNoRepeat(){
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        String word = "Peter Peter Peter Peter";
        uniqueWordVocabulary.addWord(word);

        assertEquals(1,uniqueWordVocabulary.getSet().size());
    }

    @Test
    public void addWordNoNull(){
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        String word = null;
        uniqueWordVocabulary.addWord(word);

        assertEquals(true, uniqueWordVocabulary.getSet() == null);
    }

    @Test
    public void addWordNoEmptyPlace(){
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        uniqueWordVocabulary.addWord("");

        assertEquals(true, uniqueWordVocabulary.getSet() == null);
    }

}