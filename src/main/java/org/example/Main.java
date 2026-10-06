package org.example;
import java.util.Random;
import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        JFrame frame1 = new JFrame("случайное число");
        JButton button1 = new JButton("Сгенерировать");
        JLabel resultLabel = new JLabel();
        JTextField from = new JTextField(3);
        JTextField to = new JTextField(3);
    JLabel fromLabel = new JLabel("Ot");
    JLabel toLabel = new JLabel("Do");
    button1.addActionListener(e-> {
        String fromText = from.getText();
        String toText = to.getText();
        int f, t;
        try {
        f = Integer.parseInt(fromText);
        } catch (NumberFormatException ex) {
            resultLabel.setText("From не число!");
            return;
        }
        try {
            t = Integer.parseInt(toText);
        }
        catch (NumberFormatException ex) {
                resultLabel.setText("To не число!");
                return;
            }
        if (f > t) {
            resultLabel.setText("Ошибка: «От» больше «До»!");
            return;
        }

        int randomNumber = new Random().nextInt(t - f + 1) + f;
        resultLabel.setText("Случайное число: " + randomNumber);
            }
            );
        frame1.setLayout(new FlowLayout());
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.getContentPane().add(button1);
        frame1.getContentPane().add(fromLabel);
        frame1.getContentPane().add(from);
        frame1.getContentPane().add(toLabel);
        frame1.getContentPane().add(to);
        frame1.getContentPane().add(resultLabel);
        frame1.setSize(300,200);
        frame1.setVisible(true);
        //17.2
        JButton button = new JButton("Click");
        JButton resetButton = new JButton("Сброс");
        JFrame frame = new JFrame("Счётчик");

        JLabel label = new JLabel("Нажатий:0");
        final int [] count = {0};
        button.addActionListener(e->{
            count[0]++;
            if(count[0] >= 10)
            {
                label.setText("Хватит кликать!");
            }
            else {
                label.setText("Нажатий: " + count[0]);
            }
        });
        resetButton.addActionListener(e -> {
            count[0] = 0;
            label.setText("Нажатий:0");
        });
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.getContentPane().add(resetButton);
        frame.getContentPane().add(label);
        frame.setSize(300,100);
        frame.setVisible(true);
    }
}
