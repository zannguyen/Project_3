import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmMain extends JFrame implements ActionListener {

    JButton btnTangDan, btnGiamDan, btnMax, btnMin;

    public frmMain() {
        setTitle("Ung dung Sap Xep va Tim Kiem");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        btnTangDan = new JButton("Tang dan");
        btnGiamDan = new JButton("Giam dan");
        btnMax = new JButton("So Lon Nhat");
        btnMin = new JButton("So Nho Nhat");

        btnTangDan.addActionListener(this);
        btnGiamDan.addActionListener(this);
        btnMax.addActionListener(this);
        btnMin.addActionListener(this);

        add(btnTangDan);
        add(btnGiamDan);
        add(btnMax);
        add(btnMin);

        setVisible(true);
        setLocationRelativeTo(null); // Hien thi cua so o giua man hinh
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTangDan) {
            new frmSXTD().setVisible(true);
        } else if (e.getSource() == btnGiamDan) {
            new frmSXGD().setVisible(true);
        } else if (e.getSource() == btnMax) {
            new frmSLN().setVisible(true);
        } else if (e.getSource() == btnMin) {
            new frmSNN().setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new frmMain();
            }
        });
    }
}