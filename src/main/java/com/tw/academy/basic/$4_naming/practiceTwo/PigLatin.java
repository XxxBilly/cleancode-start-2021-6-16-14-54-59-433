package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {

  //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
  private static final String WORD_SEPARATION = " ";
  private static final String SUFFIX = "ay";
  public static final int FIRST_INDEX = 0;
  public static final int SECOND_INDEX = 1;
  public static final String[] PUNCTUATIONS = {".", ",", "-", ":", ";", "!", "?"};

  public static String pigIt(String statement) {
    String[] wordArr = statement.split(WORD_SEPARATION);
    char firstLetter;
    boolean isContainPunctuation = true;

    for (int wordArrIndex = 0; wordArrIndex < wordArr.length; wordArrIndex++) {
      for (int punctuationIndex = 0; punctuationIndex < PUNCTUATIONS.length; punctuationIndex++) {
        if (wordArr[wordArrIndex].contains(PUNCTUATIONS[punctuationIndex])) {
          isContainPunctuation = false;
        }
      }

      if (isContainPunctuation) {
        firstLetter = wordArr[wordArrIndex].charAt(FIRST_INDEX);
        wordArr[wordArrIndex] = wordArr[wordArrIndex].substring(SECOND_INDEX, wordArr[wordArrIndex].length());
        wordArr[wordArrIndex] = wordArr[wordArrIndex].replace(wordArr[wordArrIndex], wordArr[wordArrIndex] + firstLetter + SUFFIX);
      }
      isContainPunctuation = true;
    }

    return String.join(WORD_SEPARATION, wordArr);
  }
}
