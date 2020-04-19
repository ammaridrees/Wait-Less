import javax.swing.*;
import java.awt.*;

public class TableLayout extends Canvas {

    public static void main(String[] args) {
        TableLayout m = new TableLayout();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public void paint(Graphics g) {

        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("p3.gif");
        g.drawImage(i, 120, 100, this);

    }

}  