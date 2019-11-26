package org.fundacionjala.coding.ramalaso;

public final class MostFrequent {

    private MostFrequent() {
    }

    public static int mostFrequentItemCount(final int[] collection) {

        int qtyOcurrency = 0;
        int maxOcurrency = 0;
        int value;

        for (int i = 0; i < collection.length; i++) {
            value = collection[i];
            qtyOcurrency = 0;
            for (int j = i; j < collection.length; j++) {
                if (value == collection[j]) {
                    qtyOcurrency++;
                }
            }
            if (qtyOcurrency > maxOcurrency) {
                maxOcurrency = qtyOcurrency;
            }
        }
        return maxOcurrency;
    }
}
