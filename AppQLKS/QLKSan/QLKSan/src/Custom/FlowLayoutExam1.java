
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FlowLayoutExam1 {

    JFrame frame;

    FlowLayoutExam1() {
        frame = new JFrame();

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");       
        JButton b8 = new JButton("7");
        JButton b9 = new JButton("8");
        JButton b10 = new JButton("9");
        JButton b11 = new JButton("10");
        JButton b7 = new JButton("11");


        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);        frame.add(b9);
        frame.add(b8);
        frame.add(b10);
        frame.add(b11);
        frame.add(b7);
        // thiet lap flow layout la can chinh trai
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        frame.setSize(400, 250);
        frame.setVisible(true);
        frame.setTitle("Ví dụ FlowLayout trong Java Swing");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutExam1();
    }
}
