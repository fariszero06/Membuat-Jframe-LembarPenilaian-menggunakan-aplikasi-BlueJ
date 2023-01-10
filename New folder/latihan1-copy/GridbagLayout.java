import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import java.awt.GridBagConstraints;


/**
 * Write a description of class GridbagLayout here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GridbagLayout extends JFrame {
    public JButton One,Two,Three,Four,Five;
    public void createButton ()
    {
        One = new JButton("One");
        Two = new JButton("Two");
        Three = new JButton("Three");
        Four = new JButton("Four");
        Five = new JButton("Five");
    }
    
    public GridbagLayout() {
        createButton();
        setLayout(new GridBagLayout());
        GridBagConstraints g=new GridBagConstraints();
        add(One);
        add(Two);
        add(Three);
        add(Four);
        add(Five);
        setTitle("Gridbag Layout");
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    public static void  main (String [] args){
      
        GridbagLayout  t=new GridbagLayout();
    }
    
    
    
}
