package apiTutorial;

import javax.swing.*;
import java.util.List;

public class JlistView {

    private static JFrame frame;
    private static JPanel panel;
    private static JLabel label;


    JlistView() {
        frame = new JFrame("USERS");
        panel = new JPanel();
        label = new JLabel("Zerome");
    }

    public void display(List data) {
        for (Object objects : data) {
            User user = (User) objects;
            Object[] obj = {user.getId(), user.getEmail(), user.getFirst_name(), user.getLast_name(), user.getAvatar()};
            JList list = new JList(obj);
            panel.add(list);
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 250);
        }
        frame.show();
    }
}
