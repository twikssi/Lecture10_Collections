package by.andrey.twikssi.exer2uniquewordcounter.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueWordCounterTest {
    UniqueWordCounter word;

    @Before
    public void setup(){
        this.word = new UniqueWordCounter();
    }

    @Test
    public void addWord(){
        word.addWord("Hi, how are you?");
        word.addWord("Hi, how are you?");
        word.addWord("Hi, how are you?");

        int expected = word.getMap().get("Hi, how are you?");

       assertEquals(3, expected);
    }

    @Test
    public void addWordReturnNull(){
        word.addWord(null);
        word.addWord(null);

        int expected = word.getMap().get(null);

        assertEquals(2, expected);
    }

    @Test
    public void addWordReturnOneValue(){
        word.addWord("One value");

        int expected = word.getMap().get("One value");

        assertEquals(1, expected);
    }
}