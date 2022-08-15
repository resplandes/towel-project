package swing.calendar;

import com.towel.swing.calendar.CalendarView;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalendarViewTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalendarView");
        JPanel content = new JPanel();
        final CalendarView view = new CalendarView();
        JButton button = new JButton("X");
        content.add(view);
        content.add(button);
        button.addActionListener((ActionEvent e) -> {
            System.out.println(view.getSelectedDate());
        });

        frame.setContentPane(content);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
