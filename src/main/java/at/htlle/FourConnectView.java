package at.htlle;

public class FourConnectView {
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
