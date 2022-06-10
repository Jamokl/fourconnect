package at.htlle;

public class FourConnectPresenter {

    public static String checkWinner(String[][] f) {
        int[] howManyVert = new int[7];
        int[] howManyHor = new int[7];
        String[] lastVert = new String[7];
        String[] lastHor = new String[7];
        String lastDiag;
        String lastDiag2;
        String lastDiag3;
        String lastDiag4;
        String lastDiag5;
        String lastDiag6;

        // Vertical Winner
        for (int RowVert = 0; RowVert < f.length; RowVert++) {
            for (int ColumnVert = 0; ColumnVert < f[RowVert].length; ColumnVert++) {
                if (f[RowVert][ColumnVert].equalsIgnoreCase("R") || f[RowVert][ColumnVert].equalsIgnoreCase("Y")) {
                    lastVert[ColumnVert] = f[RowVert][ColumnVert];
                    if (lastVert[ColumnVert].equalsIgnoreCase(f[RowVert][ColumnVert])) {
                        howManyVert[ColumnVert] += 1;
                    } else if(!lastVert[ColumnVert].equalsIgnoreCase(f[RowVert][ColumnVert])) {
                        lastVert[ColumnVert] = f[RowVert][ColumnVert-1];
                        howManyVert[ColumnVert] = 0;
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
                if (f[RowHor][ColumnHor].equalsIgnoreCase("R") || f[RowHor][ColumnHor].equalsIgnoreCase("Y")) {
                    lastHor[RowHor] = f[RowHor][ColumnHor];
                    if (lastHor[RowHor].equalsIgnoreCase(f[RowHor][ColumnHor])) {
                        howManyVert[RowHor] += 1;
                    } else if(!lastHor[RowHor].equalsIgnoreCase(f[RowHor][ColumnHor-1])) {
                        howManyVert[RowHor] = 0;
                    }
                    if (howManyHor[RowHor] == 4) {
                        return f[RowHor][ColumnHor];
                    }
                }
            }
        }

        // Diagonal Winner
        for (int diagHor = 0; diagHor <= 2; diagHor++) {
            if (f[diagHor][0].equalsIgnoreCase("R") || f[diagHor][0].equalsIgnoreCase("Y")) {
                lastDiag = f[0][0];
                int count = 1;
                if (f[diagHor + 1][0 + 1].equalsIgnoreCase(lastDiag)) {
                    count++;
                } else if (f[diagHor + 1][0 + 1].equalsIgnoreCase(lastDiag) == false) {
                    lastDiag = f[diagHor + 1][0 + 1];
                }
                if (f[diagHor + 2][0 + 2].equalsIgnoreCase(lastDiag)) {
                    count++;
                }
                if (f[diagHor + 3][0 + 3].equalsIgnoreCase(lastDiag)) {
                    count++;
                }
                if (f[diagHor + 4][0 + 4].equalsIgnoreCase(lastDiag)) {
                    count++;
                }
                if (count >= 4) {
                    return lastDiag;
                }
            }
        }

        // Diagonal Winner 2
        for (int diagHor2 = 4; diagHor2 <= 6; diagHor2++) {
            if (f[diagHor2][0].equalsIgnoreCase("R") || f[diagHor2][0].equalsIgnoreCase("Y")) {
                lastDiag2 = f[0][0];
                int count2 = 1;
                if (f[diagHor2 - 1][0 + 1].equalsIgnoreCase(lastDiag2)) {
                    count2++;
                } else if (f[diagHor2 - 1][0 + 1].equalsIgnoreCase(lastDiag2) == false) {
                    lastDiag2 = f[diagHor2 - 1][0 + 1];
                }
                if (f[diagHor2 - 2][0 + 2].equalsIgnoreCase(lastDiag2)) {
                    count2++;
                }
                if (f[diagHor2 - 3][0 + 3].equalsIgnoreCase(lastDiag2)) {
                    count2++;
                }
                if (f[diagHor2 - 4][0 + 4].equalsIgnoreCase(lastDiag2)) {
                    count2++;
                }
                if (count2 >= 4) {
                    return lastDiag2;
                }
            }
        }

        //Diagonal Winner Exception
        int diagExcHor = 0;
        if (diagExcHor == 0) {
            if (f[diagExcHor][1].equalsIgnoreCase("R") || f[diagExcHor][1].equalsIgnoreCase("Y")) {
                lastDiag3 = f[diagExcHor][1];
                int count3 = 1;
                if (lastDiag3.equalsIgnoreCase(f[diagExcHor + 1][1 + 1])) {
                    count3++;
                } else if (!lastDiag3.equalsIgnoreCase(f[diagExcHor + 1][1 + 1])) {
                    lastDiag3 = f[diagExcHor + 1][1 + 1];
                }
                if (lastDiag3.equalsIgnoreCase(f[diagExcHor + 2][1 + 2])) {
                    count3++;
                } else if (!lastDiag3.equalsIgnoreCase(f[diagExcHor + 2][1 + 2])) {
                    lastDiag3 = f[diagExcHor + 2][1 + 2];
                    count3 = 1;
                }
                if (lastDiag3.equalsIgnoreCase(f[diagExcHor + 3][1 + 3])) {
                    count3++;
                }
                if (count3 == 4) {
                    return lastDiag3;
                }
            }
        }

        //Diagonal Winner Exception 2
        int diagExcHor2 = 3;
        if (diagExcHor2 == 3) {
            if (f[diagExcHor2][0].equalsIgnoreCase("R") || f[diagExcHor2][0].equalsIgnoreCase("Y")) {
                lastDiag4 = f[diagExcHor2][0];
                int count4 = 1;
                if (lastDiag4.equalsIgnoreCase(f[diagExcHor2 + 1][0 + 1])) {
                    count4++;
                } else if (!lastDiag4.equalsIgnoreCase(f[diagExcHor2 + 1][0 + 1])) {
                    lastDiag4 = f[diagExcHor2 + 1][0 + 1];
                }
                if (lastDiag4.equalsIgnoreCase(f[diagExcHor2 + 2][0 + 2])) {
                    count4++;
                } else if (!lastDiag4.equalsIgnoreCase(f[diagExcHor2 + 2][0 + 2])) {
                    lastDiag4 = f[diagExcHor2 + 2][0 + 2];
                    count4 = 1;
                }
                if (lastDiag4.equalsIgnoreCase(f[diagExcHor2 + 3][0 + 3])) {
                    count4++;
                }
                if (count4 == 4) {
                    return lastDiag4;
                }
            }
        }

        //Diagonal Winner Exception 3
        int diagExcHor3 = 3;
        if (diagExcHor3 == 3) {
            if (f[diagExcHor3][0].equalsIgnoreCase("R") || f[diagExcHor3][0].equalsIgnoreCase("Y")) {
                lastDiag5 = f[diagExcHor3][0];
                int count5 = 1;
                if (lastDiag5.equalsIgnoreCase(f[diagExcHor3 - 1][0 + 1])) {
                    count5++;
                } else if (!lastDiag5.equalsIgnoreCase(f[diagExcHor3 - 1][0 + 1])) {
                    lastDiag5 = f[diagExcHor3 - 1][0 + 1];
                }
                if (lastDiag5.equalsIgnoreCase(f[diagExcHor3 - 2][0 + 2])) {
                    count5++;
                } else if (!lastDiag5.equalsIgnoreCase(f[diagExcHor3 - 2][0 + 2])) {
                    lastDiag5 = f[diagExcHor3 - 2][0 + 2];
                    count5 = 1;
                }
                if (lastDiag5.equalsIgnoreCase(f[diagExcHor3 - 3][0 + 3])) {
                    count5++;
                }
                if (count5 == 4) {
                    return lastDiag5;
                }
            }
        }

        //Diagonal Winner Exception 4
        int diagExcHor4 = 6;
        if (diagExcHor4 == 6) {
            if (f[diagExcHor4][1].equalsIgnoreCase("R") || f[diagExcHor4][1].equalsIgnoreCase("Y")) {
                lastDiag6 = f[diagExcHor4][1];
                int count6 = 1;
                if (lastDiag6.equalsIgnoreCase(f[diagExcHor4 - 1][1 + 1])) {
                    count6++;
                } else if (!lastDiag6.equalsIgnoreCase(f[diagExcHor4 - 1][1 + 1])) {
                    lastDiag6 = f[diagExcHor4 - 1][0 + 1];
                }
                if (lastDiag6.equalsIgnoreCase(f[diagExcHor4 - 2][1 + 2])) {
                    count6++;
                } else if (!lastDiag6.equalsIgnoreCase(f[diagExcHor4 - 2][1 + 2])) {
                    lastDiag6 = f[diagExcHor4 - 2][1 + 2];
                    count6 = 1;
                }
                if (lastDiag6.equalsIgnoreCase(f[diagExcHor4 - 3][1 + 3])) {
                    count6++;
                }
                if (count6 == 4) {
                    return lastDiag6;
                }
            }
        }

        return "Something went Wrong! Sorry!";
    }

    public static void dropRedPattern(String[][] f, int UserInput)
    {
        for(int i = 0; i < 5; i++) {
            if(f[UserInput-1][i] == "_") {
                f[UserInput-1][i] = "R";
                break;
            }
        }
    }

    //Same as the above step, just yellow
    public static void dropYellowPattern(String[][] f, int UserInput)
    {
        for(int i = 0; i < 5; i++) {
            if(f[UserInput-1][i] == "_") {
                f[UserInput-1][i] = "Y";
                break;
            }
        }
    }

    public void setFourConnectModel(FourConnectModel fourConnectModel) {

    }

}
