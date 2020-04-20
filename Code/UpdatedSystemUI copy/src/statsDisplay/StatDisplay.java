package statsDisplay;

import tableLayout.Tabledisplay;
import tasksList.Queue;
import menuDisplay.Loader;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StatDisplay extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public JPanel contentPane;
    private JTable table;
    public JFrame frame;
    private static int rev = Loader.T1.getTotalCost() + Loader.T2.getTotalCost() + Loader.T3.getTotalCost() +
            Loader.T4.getTotalCost() + Loader.T5.getTotalCost() + Loader.T6.getTotalCost();

    /**
     * Create the frame.
     */
    public StatDisplay() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 558, 525);
        setBackground(Color.LIGHT_GRAY);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        contentPane.setOpaque(false);
        contentPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "STATISTICS", TitledBorder.CENTER, TitledBorder.TOP));
        setContentPane(contentPane);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime now = LocalDateTime.now();

        Object[][] rowData = {
                {"Date and Time", dtf.format(now)},
                {"Tables Occupied", 6 - Tabledisplay.getAvailable()},
                {"Tables Open", Tabledisplay.getAvailable()},
                {"Customers Waiting", "0"},
                {"Wait time (sec)", new DecimalFormat("#.##").format(waitTime.waiting())},
                {"Tasks Open", Queue.getLength()},
                {"Tasks Completed", Queue.getDone()},
                {"Revenue ($)", rev},
                {"Fun Fact of the Day", "Please give an A :)"}};

        Object[] columnNames = {"Column One", "Column Two"};

        table = new JTable(rowData, columnNames);

        table.setColumnSelectionAllowed(true);
        table.setCellSelectionEnabled(true);
        table.setRowHeight(50);
        table.getAutoResizeMode();
        table.setBackground(Color.WHITE);
        table.setFont(new Font("Serif", Font.BOLD, 20));


        contentPane.add(table, BorderLayout.CENTER);
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StatDisplay frame = new StatDisplay();
                    frame.setVisible(true);
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}