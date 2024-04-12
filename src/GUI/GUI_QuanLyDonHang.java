package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_QuanLyDonHang extends JPanel {
    private JButton[] tableButtons = new JButton[15];
    private String[] tableStatus = new String[15];
    private JButton moveTableButton, mergeTableButton, splitTableButton, printBillButton, addDishButton;
    private JMenu floorMenu;
    private JMenuItem floor1, floor2, floor3;

    public GUI_QuanLyDonHang() {
        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        floorMenu = new JMenu("Tầng");
        floor1 = new JMenuItem("Tầng 1");
        floor2 = new JMenuItem("Tầng 2");
        floor3 = new JMenuItem("Tầng 3");

        floorMenu.add(floor1);
        floorMenu.add(floor2);
        floorMenu.add(floor3);

        menuBar.add(floorMenu);
        add(menuBar, BorderLayout.NORTH);

        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new CardLayout());

        JPanel floor1Panel = createFloorPanel();
        JPanel floor2Panel = createFloorPanel();
        JPanel floor3Panel = createFloorPanel();

        tablePanel.add(floor1Panel, "Tầng 1");
        tablePanel.add(floor2Panel, "Tầng 2");
        tablePanel.add(floor3Panel, "Tầng 3");

        add(tablePanel, BorderLayout.CENTER);

        floor1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)tablePanel.getLayout()).show(tablePanel, "Tầng 1");
            }
        });

        floor2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)tablePanel.getLayout()).show(tablePanel, "Tầng 2");
            }
        });

        floor3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)tablePanel.getLayout()).show(tablePanel, "Tầng 3");
            }
        });

        JPanel legendPanel = new JPanel();
        legendPanel.setLayout(new GridLayout(3, 1));

        JButton occupiedButton = new JButton("Có Người");
        occupiedButton.setBackground(Color.RED);
        occupiedButton.setEnabled(false);

        JButton reservedButton = new JButton("Đã Đặt Trước");
        reservedButton.setBackground(Color.GREEN);
        reservedButton.setEnabled(false);

        JButton emptyButton = new JButton("Trống");
        emptyButton.setBackground(Color.GRAY);
        emptyButton.setEnabled(false);

        legendPanel.add(occupiedButton);
        legendPanel.add(reservedButton);
        legendPanel.add(emptyButton);

        add(legendPanel, BorderLayout.EAST);

        JPanel functionPanel = new JPanel();
        functionPanel.setLayout(new GridLayout(1, 3));

        mergeTableButton = new JButton("Gộp Bàn");
        mergeTableButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Thêm mã xử lý sự kiện cho nút "Gộp Bàn" tại đây
                System.out.println("Gộp Bàn");
            }
        });

        moveTableButton = new JButton("Chuyển Bàn");
        moveTableButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Thêm mã xử lý sự kiện cho nút "Chuyển Bàn" tại đây
                System.out.println("Chuyển Bàn");
            }
        });

        splitTableButton = new JButton("Tách Bàn");
        splitTableButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Thêm mã xử lý sự kiện cho nút "Tách Bàn" tại đây
                System.out.println("Tách Bàn");
            }
        });

        functionPanel.add(mergeTableButton);
        functionPanel.add(moveTableButton);
        functionPanel.add(splitTableButton);

        add(functionPanel, BorderLayout.SOUTH);
    }

    private JPanel createFloorPanel() {
        JPanel floorPanel = new JPanel();
        floorPanel.setLayout(null);
        for (int i = 0; i < 15; i++) {
            JButton tableButton = createButton("BÀN " + (i + 1), 25 + (i % 5) * 124, 26 + (i / 5) * 117);
            floorPanel.add(tableButton);
        }
        return floorPanel;
    }

    private JButton createButton(String text, int x, int y) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 114, 98);
        button.setBackground(Color.GRAY); // Set the initial color to gray
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showDialogAndChangeColor(button);
            }
        });
        return button;
    }

    private void showDialogAndChangeColor(JButton button) {
        button.setBackground(Color.GRAY);
        String[] options = {"Bàn Đặt trước", "Bàn Có Người", "Bàn Trống"};
        int response = JOptionPane.showOptionDialog(null, "Chọn trạng thái bàn", "Tình Trạng",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);

        if (response == 0) {
            button.setBackground(Color.GREEN);
        } else if (response == 1) {
            button.setBackground(Color.RED);
        } else if (response == 2) {
            button.setBackground(Color.GRAY);
        }
    }
}
