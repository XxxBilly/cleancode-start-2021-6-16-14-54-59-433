package com.tw.academy.basic.$4_naming.practiceOne;

public class MorseCodeDecoder {

  private static final String MATCHED_SPACE_REG = "\\s{2,}";
  private static final String WORD_SEPARATION = " ";
  private static final String NULL_STRING = "null";
  private static final String EMPTY_STRING = "";

  public static String decode(String input) {
    String[] words = input.split(MATCHED_SPACE_REG);
    StringBuilder result = new StringBuilder();
    for (String word : words) {
      String[] characters = word.split(WORD_SEPARATION);
      for (String character : characters) {
        result.append(MorseCode.get(character));
      }
      result.append(WORD_SEPARATION);
    }
    return result.toString().replaceAll(NULL_STRING, EMPTY_STRING).trim();
  }
}
