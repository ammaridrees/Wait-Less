package statsDisplay;

import tableLayout.Tabledisplay;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatDisplay extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public JPanel contentPane;
    private JTable table;
    public JFrame frame;

    /**
     * Create the frame.
     */
    public StatDisplay() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 558, 537);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        Object[][] rowData = {{"Tasks to Complete", "4"},
                {"Tables Occupied", 8 - Tabledisplay.getAvailable()},
                {"Tables Open", Tabledisplay.getAvailable()},
                {"Customers Waiting", "0"},
                {"Average Wait time", "0 minutes"}};

        Object[] columnNames = {"Column One", "Column Two"};

        table = new JTable(rowData, columnNames);

        table.setColumnSelectionAllowed(true);
        table.setCellSelectionEnabled(true);
        table.setRowHeight(30);

        contentPane.add(table, BorderLayout.CENTER);

        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame = new JFrame("Exit");
                if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Stats Screen",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                    frame.dispose();
                    frame.setVisible(false);
                    //Tabledisplay display = new Tabledisplay();
                    //Tabledisplay.main(null);
                }
            }
        });
        contentPane.add(btnExit, BorderLayout.SOUTH);
        btnExit.setPreferredSize(new Dimension(20, 40));
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
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
