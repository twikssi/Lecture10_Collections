package by.andrey.twikssi.exer1uniquewordvocabulary.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueWordVocabularyTest {

    @Test
    public void addWord(){
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        String word = "Peter";
        uniqueWordVocabulary.addWord(word);
        uniqueWordVocabulary.addWord("hi");
        uniqueWordVocabulary.addWord("what`s up?");

        assertTrue(uniqueWordVocabulary.getSet().contains("Peter"));
        assertTrue(uniqueWordVocabulary.getSet().contains("hi"));
        assertTrue(uniqueWordVocabulary.getSet().contains("what`s up?"));
    }

    @Test
    public void addWordNoRepeat(){
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        String word = "Peter";
        uniqueWordVocabulary.addWord(word);
        uniqueWordVocabulary.addWord(word);
        uniqueWordVocabulary.addWord(word);
        uniqueWordVocabulary.addWord(word);

        assertEquals(1,uniqueWordVocabulary.getSet().size());
    }

    @Test
    public void addWordNoNull(){
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        String word = null;
        uniqueWordVocabulary.addWord(word);
        uniqueWordVocabulary.addWord("");

        assertEquals(0, uniqueWordVocabulary.getSet().size());
    }

    @Test
    public void addWordNoEmptyPlace(){
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        uniqueWordVocabulary.addWord("");

        assertEquals(0, uniqueWordVocabulary.getSet().size());
    }
}