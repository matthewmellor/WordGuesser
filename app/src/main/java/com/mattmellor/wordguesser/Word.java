package com.mattmellor.wordguesser;

import java.util.ArrayList;

/**
 * Created by Matthew on 1/26/2016.
 * Class representing a Vocab Word as an ArrayList
 */
public class Word {

    private String word = "";
    private ArrayList<String> wordList;

    public Word(String word){
        this.word = word;
        this.wordList = new ArrayList<String>();
        for(String letter: word.split("")){
            if(letter.equals("")) continue;
            wordList.add(letter);
        }
    }

    /**
     *
     * @param index starts at 0
     * @return String representing a letter at a particular index
     */
    public String getLetterAt(int index){
        return this.wordList.get(index);
    }

    public ArrayList<String> showComparison(Word other){
        throw new RuntimeException("Unimplemented");
    }


}
