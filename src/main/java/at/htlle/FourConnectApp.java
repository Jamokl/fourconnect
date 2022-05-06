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

        String[][] f = fcv.createDiskPattern();
        boolean loop = true;
        int count = 0;
        fcv.printPattern(fcv.combineField(f));
        Scanner sc = new Scanner(System.in);
        int ui;
        while(loop)
        {
            System.out.println("Where do you want to place your Disk?");
            ui = sc.nextInt();
            if (count % 2 == 0) fcp.dropRedPattern(f , ui);
            else fcp.dropYellowPattern(f, ui);
            count++;
            fcv.printPattern(fcv.combineField(f));;
            if (fcm.checkWinner(f) != null)
            {
                if (fcm.checkWinner(fcv.combineField(f)) == "R")
                    System.out.println("The red player won.");
                else if (fcm.checkWinner(fcv.combineField(f))== "Y")
                    System.out.println("The yello player won.");
                loop = false;
            }
        }
    }
}