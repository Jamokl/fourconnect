package at.htlle;

public class FourConnectPresenter {
    public static void dropRedPattern(String[][] f, int UserInput)
    {
        int c = 2*UserInput+1;

        for (int i =5;i>=0;i--)
        {
            if (f[i][c] == " ")
            {
                f[i][c] = "R";
                break;
            }

        }
    }

    //Same as the above step, just yellow
    public static void dropYellowPattern(String[][] f, int UserInput)
    {
        int c = 2*UserInput + 1;
        for (int i =5;i>=0;i--)
        {
            if (f[i][c] == " ")
            {
                f[i][c] = "Y";
                break;
            }

        }
    }

}
