import at.htlle.FourConnectModel;
import at.htlle.FourConnectPresenter;
import at.htlle.FourConnectView;

import java.util.Scanner;
public class FourConnectApp
{
    public static void main (String[] args)
    {
        FourConnectView fcv = new FourConnectView();
        FourConnectModel fcm = new FourConnectModel();
        FourConnectPresenter fcp = new FourConnectPresenter();

        String[][] f = fcm.createDiskPattern();
        boolean loop = true;
        int count = 0;
        fcv.printPattern(fcm.combineField(f));
        Scanner sc = new Scanner(System.in);
        int ui;
        while(loop)
        {
            System.out.println("Where do you want to place your Disk?");
            ui = sc.nextInt();
            if (count % 2 == 0) fcp.dropRedPattern(f , ui);
            else fcp.dropYellowPattern(f, ui);
            count++;
            fcv.printPattern(fcm.combineField(f));;
            if (fcp.checkWinner(f) != null)
            {
                if (fcp.checkWinner(fcm.combineField(f)) == "R")
                    System.out.println("The red player won.");
                else if (fcp.checkWinner(fcm.combineField(f))== "Y")
                    System.out.println("The yello player won.");
                loop = false;
            }
        }
    }
}