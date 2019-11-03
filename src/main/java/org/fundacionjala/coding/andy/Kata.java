package org.fundacionjala.coding.andy;

/**
 * @author lazaro on 10/31/2019.
 * coding
 */
public final class Kata {
    private Kata() { }
    public static String sortTheInnerContent(final String words) {
        String[] word = words.split(" ");
        for (int i = 0; i < word.length; i++) {
            for (int j = 1; j < (word[i].length() - 1); j++) {
               for (int ind = j; ind < (word[i].length() - 1); ind++) {
                    if (word[i].charAt(j) < word[i].charAt(ind)) {
                        char aux = word[i].charAt(j);
                        StringBuilder myName = new StringBuilder(word[i]);
                        myName.setCharAt(j, word[i].charAt(ind));
                        myName.setCharAt(ind, aux);
                        word[i] = myName.toString();
                    }
                }
            }
        }
        return String.join(" ", word);
    }
}
