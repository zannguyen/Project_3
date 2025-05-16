import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmMaxArray extends JFrame implements ActionListener {
    private JTextField txtSo1, txtSo2;
    private JButton btnTinh;
    private JLabel lblKetQua;

    public frmMaxArray() {
        setTitle("Form Max Trong Mảng");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Nhập mảng (cách nhau bằng dấu cách):"));
        txtSo1 = new JTextField();
        add(txtSo1);

        // txtSo2 không dùng, vẫn giữ để giống form trước
        add(new JLabel("Không sử dụng ô này:"));
        txtSo2 = new JTextField();
        txtSo2.setEnabled(false);
        add(txtSo2);

        btnTinh = new JButton("Tính");
        btnTinh.addActionListener(this);
        add(btnTinh);

        lblKetQua = new JLabel("Kết quả: ");
        add(lblKetQua);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String[] parts = txtSo1.getText().trim().split("\\s+"); // chia theo dấu cách
            int[] numbers = new int[parts.length];

            for (int i = 0; i < parts.length; i++) {
                numbers[i] = Integer.parseInt(parts[i]);
            }

            int max = timMax(numbers);
            lblKetQua.setText("Kết quả: " + max);
        } catch (NumberFormatException ex) {
            lblKetQua.setText("Vui lòng nhập các số nguyên, cách nhau bằng dấu cách!");
        }
    }

    private int timMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        new frmMaxArray();
    }
}
