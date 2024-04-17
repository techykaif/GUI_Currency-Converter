import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class graph{
    public static void program(){
       
        JFrame My=new JFrame("Test Page");
        My.setSize(500,400);
        My.setVisible(true);
        JLabel l1,l2;
        l1=new JLabel("Gaurav Bhai is Bhadwa.");
        l1.setBounds(150,150,200,20);
        l2=new JLabel("This is also a test page");
        l2.setBounds(150,180,200,20);
        My.add(l1);
        My.add(l2);
        My.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0); 
            }
        });
      
    }
    
    public static void main(String[] args) {
        program();

    }
}