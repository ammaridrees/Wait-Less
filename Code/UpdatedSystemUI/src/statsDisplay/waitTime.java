package statsDisplay;

import tableLayout.Tabledisplay;

public class waitTime {
    public static int waiting()
    {
        int wt = (8 - Tabledisplay.getAvailable()) * 10;

        return wt;
    }
}