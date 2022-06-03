package at.htlle;

public class FourConnectPresenter {

    public static String checkWinner(String[][] f) {
        int[] howManyVert = new int[7];
        int[] howManyHor = new int[7];
        String[] lastVert = new String[7];
        String[] lastHor = new String[7];
        String lastDiag;

        // Vertical Winner
        for (int RowVert = 0; RowVert < f.length; RowVert++) {
            for (int ColumnVert = 0; ColumnVert < f[RowVert].length; ColumnVert++) {
                if (f[RowVert][ColumnVert].equalsIgnoreCase("R") || f[RowVert][ColumnVert].equalsIgnoreCase("Y")) {
                    lastVert[ColumnVert] = f[RowVert][ColumnVert];
                    if(lastVert[ColumnVert].equalsIgnoreCase(f[RowVert][ColumnVert])) {
                        howManyVert[ColumnVert] += 1;
                    }
                    if (howManyVert[ColumnVert] == 4) {
                        return f[RowVert][ColumnVert];
                    }
                }
            }
        }

        // Horizontal Winner
        for (int ColumnHor = 0; ColumnHor < f[0].length; ColumnHor++) {
            for (int RowHor = 0; RowHor < f.length; RowHor++) {
                if (f[ColumnHor][RowHor].equalsIgnoreCase("R") || f[ColumnHor][RowHor].equalsIgnoreCase("Y")) {
                    lastHor[RowHor] = f[ColumnHor][RowHor];
                    if(lastHor[RowHor].equalsIgnoreCase(f[ColumnHor][RowHor])) {
                        howManyVert[RowHor] += 1;
                    }
                    if (howManyHor[RowHor] == 4) {
                        return f[ColumnHor][RowHor];
                    }
                }
            }
            return "Something went Wrong! Sorry!";
        }

        // Diagonal Winner
        for(int e = 0; e < 5; e++) {
            if(f[e][0].equalsIgnoreCase("R") || f[e][0].equalsIgnoreCase("Y")) {
                lastDiag = f[0][0];
                int count = 1;
                if(f[e+1][0+1].equalsIgnoreCase(lastDiag)) {
                    count++;
                } else if(f[e+1][0+1].equalsIgnoreCase(lastDiag) == false) {
                    lastDiag = f[e+1][0+1];
                } else  if (f[e+2][0+2].equalsIgnoreCase(lastDiag)) {
                    count++;
                    if (f[e+3][0+3].equalsIgnoreCase(lastDiag)) {
                        count++;
                        if (f[e+4][0+4].equalsIgnoreCase(lastDiag)) {
                            count++;
                        }
                    }
                }
              if  (count >= 4) {
                  return lastDiag;
            }
        }
        return "Something went Wrong! Sorry!";
    }

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

    public void setFourConnectModel(FourConnectModel fourConnectModel) {

    }

    }
}