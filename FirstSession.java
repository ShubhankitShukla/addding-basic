import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSession implements ActionListener {
    JFrame frame;
    JTextArea myarea;
    JButton button;

    FirstSession() {
        frame = new JFrame("First Session");
        frame.setBounds(250, 250, 300, 300);
        frame.setBackground(Color.BLACK);
        frame.getContentPane().setBackground(Color.black);
        button = new JButton("PRESS");
        button.setBounds(120, 20, 50, 20);
        button.addActionListener(this);
        myarea = new JTextArea("Welcome to the TextArea");
        myarea.setBounds(50, 50, 200, 200);
        myarea.setBackground(Color.RED);
        frame.add(button);
        frame.add(myarea);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
        public static void main(String arg[])
        {
            FirstSession object=new FirstSession();
        }


    @Override
    public void actionPerformed(ActionEvent e) {
        myarea.setText("you clicked the button");
    }
}
