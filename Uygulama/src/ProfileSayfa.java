import javax.swing.*;
import java.awt.*;

public class ProfileSayfa {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    public ProfileSayfa()
    {
        label.setText("İsim: Ahmet Selman Dur");
        label.setFont(new Font(null,Font.PLAIN,25));

        frame.add(label);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Profile Sayfa");
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
    }
}
