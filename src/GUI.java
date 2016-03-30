
import javax.swing.*;

public class GUI extends JFrame {

    private JTextField field;
    private JButton button;
    private int[] array;

    public int[] getArray() {
        return array;
    }

    private void initializeButton() {
        button = new JButton("Ввести масив");
        button.setBounds(70, 90, 140, 40);
        button.addActionListener(ae -> {
            try {
                String[] text = field.getText().split(" ");
                array = new int[text.length];
                for (int i = 0; i < text.length; i++) {
                    array[i] = Integer.parseInt(text[i]);
                }
                Sorter sorter = new Sorter();
                sorter.quickSort(array, 0, array.length - 1);
                field.setText("");
                for (int i = 0; i < array.length; i++) {
                    String text1 = field.getText();
                    text1 +=  text1.equals("") ? "" + array[i] : " " + array[i];
                    field.setText(text1);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Введено некоректні дані");
            }
        });
    }

    private void initializeField() {
        field = new JTextField();
        field.setBounds(40, 40, 200, 40);
    }

    public GUI() {
        initializeField();
        initializeButton();
        setLayout(null);
        setBounds(300, 300, 300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(field);
        add(button);
        setVisible(true);
    }

}
