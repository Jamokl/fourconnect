package at.htlle;

public class FourConnectView {
    public static String[][] createDiskPattern() {
        String[][] f = new String[7][5];
        return f;
    }

    public String[][] combineField(String[][] diskArr) {
        String[][] combinedField = new String[7][11];
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

    public static void printPattern(String[][] combField)
    {
        for (int i =0;i<combField.length;i++)
        {
            for (int j=0;j<combField[i].length;j++)
            {
                System.out.print(combField[i][j]);
            }
            System.out.println();
        }
    }
}
