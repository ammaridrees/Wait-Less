package statsDisplay;

import tableLayout.Tabledisplay;


public class waitTime {
    public static double waiting()
    {
        if (Tabledisplay.getAvailable() > 0) {
            return 0;
        }

        double wt = 0;
        wt = Tabledisplay.totTime / Tabledisplay.divider;
        return wt;
    }
}