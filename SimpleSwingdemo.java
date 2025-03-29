import javax.swing.*;
import java.awt.*;

public class SimpleSwingdemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Application");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("Submit");
        JCheckBox pizzaCheckBox = new JCheckBox("Pizza");
        JCheckBox burgerCheckBox = new JCheckBox("Burger");

        panel.add(button);
        panel.add(pizzaCheckBox);
        panel.add(burgerCheckBox);

        frame.add(panel);
        frame.setVisible(true);
    }
}
