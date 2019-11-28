package org.fundacionjala.coding.andy;

/**
 * @author lazaro on 11/27/2019.
 *  coding.
 */
public final class KataFrecuenceItem {
    private KataFrecuenceItem() {
    }

    public static int mostFrequentItemCount(final int[] collection) {
        int majorFrecunece = 0;

        for (int i = 0; i < collection.length; i++) {
            int j = 0;
            int aux = 1;
            while (j < collection.length) {
                if (collection[i] == collection[j] && j != i) {
                    aux++;
                }
                if (aux > majorFrecunece) {
                    majorFrecunece = aux;
                }
                j++;
            }


        }
        return majorFrecunece;
    }
}
