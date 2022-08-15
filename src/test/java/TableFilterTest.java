
import com.towel.el.annotation.AnnotationResolver;
import com.towel.swing.table.ObjectTableModel;
import com.towel.swing.table.TableFilter;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.Person;
import model.PreData;

public class TableFilterTest {

    public static void main(String[] args) {
        ObjectTableModel<Person> model = new ObjectTableModel<>(
                new AnnotationResolver(Person.class), "name,age,live");

        model.setEditableDefault(true);

        JTable table = new JTable(model);

        TableFilter tableFilter = new TableFilter(table);

        model.addAll(PreData.getSampleList());

        // JTableView view = new JTableView(model);
        // view.getFooterModel().setFunction(0, new FuncConcat("-"));
        // view.getFooterModel().setFunction(1, new FuncSum());
        JScrollPane pane = new JScrollPane();
        pane.setViewportView(table);

        JFrame frame = new JFrame();
        frame.getContentPane().add(pane);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
