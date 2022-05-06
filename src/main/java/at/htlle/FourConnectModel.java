package at.htlle;

public class FourConnectModel {
    static String[][] field;
    String[][]  combinedField = new String[7][11];

    public static String[][] createDiskPattern() {
        field = new String[7][5];
        return field;
    }

    public String[][] combineField(String[][] diskArr) {
        int internalCount;
        for (int count1 = 0; count1 < combinedField.length; count1++) {
            for (int count2 = 0; count2 < combinedField[count1].length; count2++) {
                internalCount = 0;
                if (count2 % 2 == 0) {
                    combinedField[count1][count2] = diskArr[count1][internalCount];
                    internalCount++;
                } else {
                    combinedField[count1][count2] = "|";
                }
            }
        }
        return combinedField;
    }


    public void resetModel() {
        for (int count1 = 0; count1 < combinedField.length; count1++) {
            for (int count2 = 0; count2 < combinedField[count1].length; count2++) {
                if (count2 % 2 == 0) {
                    combinedField[count1][count2] = "";
                } else {
                    combinedField[count1][count2] = "|";
                }
            }
        }
    }

    public void playersTurn(int columnInModel) {
    }

    public void incrementCount() {
    }
}
