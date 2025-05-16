import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frmSNN extends JFrame {
    private JTextField txtMang, txtKetQua;
    private JButton btnTim;

    public frmSNN() {
        setTitle("Tìm số nhỏ nhất trong mảng");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 5, 5));

        // Giao diện
        add(new JLabel("Nhập mảng (cách nhau bằng dấu cách):"));
        txtMang = new JTextField();
        add(txtMang);

        add(new JLabel("Số nhỏ nhất:"));
        txtKetQua = new JTextField();
        txtKetQua.setEditable(false);
        add(txtKetQua);

        btnTim = new JButton("Tìm số nhỏ nhất");
        add(btnTim);

        // Xử lý sự kiện nút
        btnTim.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String[] arrStr = txtMang.getText().trim().split("\\s+");
                    int min = Integer.parseInt(arrStr[0]);
                    for (String s : arrStr) {
                        int num = Integer.parseInt(s);
                        if (num < min) {
                            min = num;
                        }
                    }
                    txtKetQua.setText(String.valueOf(min));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frmSNN.this,
                        "Vui lòng nhập đúng định dạng các số nguyên cách nhau bằng dấu cách!",
                        "Lỗi nhập liệu",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmSNN().setVisible(true);
        });
    }
}

