import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Collections;

public class frmSXGD extends JFrame implements ActionListener {
    private JTextField txtInput;
    private JButton btnGiam;
    private JLabel lblResult;

    public frmSXGD() {
        setTitle("Sắp xếp giảm dần");
        setSize(400, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblNhap = new JLabel("Nhập dãy số (ngăn cách bởi dấu phẩy):");
        lblNhap.setBounds(20, 20, 350, 25);
        add(lblNhap);

        txtInput = new JTextField();
        txtInput.setBounds(20, 50, 350, 25);
        add(txtInput);

        btnGiam = new JButton("Sắp xếp giảm");
        btnGiam.setBounds(125, 85, 130, 30);
        btnGiam.addActionListener(this);
        add(btnGiam);

        lblResult = new JLabel("");
        lblResult.setBounds(20, 125, 350, 25);
        add(lblResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String input = txtInput.getText();
            String[] parts = input.split(",");
            Integer[] numbers = new Integer[parts.length];

            for (int i = 0; i < parts.length; i++) {
                numbers[i] = Integer.parseInt(parts[i].trim());
            }

            Arrays.sort(numbers, Collections.reverseOrder());
            lblResult.setText("Kết quả: " + Arrays.toString(numbers));
        } catch (NumberFormatException ex) {
            lblResult.setText("Lỗi: Hãy nhập các số hợp lệ, ngăn cách bằng dấu phẩy.");
        }
    }

    public static void main(String[] args) {
        new frmSXGD();
    }
}
