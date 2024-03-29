import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    Test(){
        Container c = this.getContentPane();
        c.setLayout(null);

        JLabel titleLable = new JLabel("This is the Title");
        titleLable.setBounds(10,10,300,100);
        c.add(titleLable);
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t1.setBounds(100,100,600,500);
        t1.setVisible(true);
    }
}
