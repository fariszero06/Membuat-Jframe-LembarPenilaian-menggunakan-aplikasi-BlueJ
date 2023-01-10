import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 * Write a description of class Lembar_Penilaian here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lembar_Penilaian
{
    // instance variables - replace the example below with your own
    private JFrame frame;
    
        
    JLabel lblnim=new JLabel("NIM : ");
    JTextField txnim=new JTextField(20);
    JLabel lblnama=new JLabel("Nama : ");
    JTextField txnama=new JTextField(20);
    JButton tblcari=new JButton("Cari");
    JLabel lblkelas=new JLabel("Kelas : ");
    JRadioButton kelasA=new JRadioButton("A");
    JRadioButton kelasB=new JRadioButton("B");
    JRadioButton kelasC=new JRadioButton("C");
    ButtonGroup grupkelas=new ButtonGroup();
    JLabel lblkelompok=new JLabel("Kelompok : ");
    String[] jeniskelompok={"1","2","3","4","5","6","7"};
    JComboBox cbkelompok=new JComboBox(jeniskelompok);
    JLabel lblnilai=new JLabel("Nilai");
    JTextField txnilai=new JTextField(20);
    JLabel lbltugas1=new JLabel("Tugas 1 : ");
    JTextField txtugas1=new JTextField(20);
    JLabel lbltugas2=new JLabel("Tugas 2 : ");
    JTextField txtugas2=new JTextField(20);
    JLabel lbltugas3=new JLabel("Tugas 3 : ");
    JTextField txtugas3=new JTextField(20);
    JLabel lbltugas4=new JLabel("Tugas 4 : ");
    JTextField txtugas4=new JTextField(20);
    JLabel lbltugas5=new JLabel("Tugas 5 : ");
    JTextField txtugas5=new JTextField(20);
    JLabel lbluts=new JLabel("UTS : ");
    JTextField txtuts=new JTextField(20);
    JLabel lbluas=new JLabel("UAS : ");
    JTextField txuas=new JTextField(20);
    JButton tblsave=new JButton("Save");
    JButton tblupdate=new JButton("Update");
    JButton tblexit=new JButton("Exit");


    /**
     * Constructor for objects of class Lembar_Penilaian
     */
    public Lembar_Penilaian()
    {
        makeFrame();
        frame.setVisible(true);
    }

    /**
     * Method untuk menampilkan dan menutup frame
     * 
     * @param  visible
     */
    public void setVisible(boolean visible)
    {
        // put your code here
        frame.setVisible(visible);
    }
    
    /**
     * Method untuk membuat frame
     */
    private void makeFrame()
    {
        frame = new JFrame("Lembar Penilaian");
        frame.setSize(300, 200);
        komponenVisual();
                
        //method pack pada frame berguna utk menampilkan frame dan menset ukuran sesuai preferredSize komponen
        //frame.pack();
    }
    
    /**
     * Method khusus untuk menambahkan komponen GUI
     * 
     * 
     */
    public void komponenVisual()
    {
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout(null);               
        
        panel.add(lblnim);
        lblnim.setBounds(10,10,70,20);
        panel.add(txnim);
        txnim.setBounds(75,10,100,20);
        panel.add(tblcari);
        tblcari.setBounds(180,10,95,20);
        panel.add(lblnama);
        lblnama.setBounds(10,30,70,20);
        panel.add(txnama);
        txnama.setBounds(75,30,200,20);
        panel.add(lblkelas);
        lblkelas.setBounds(10,50,100,20);
        panel.add(kelasA);
        kelasA.setBounds(75,50,50,20);
        panel.add(kelasB);
        kelasB.setBounds(125,50,50,20);
        panel.add(kelasC);
        kelasC.setBounds(175,50,50,20);
        grupkelas.add(kelasA);
        grupkelas.add(kelasB);
        grupkelas.add(kelasC);
        panel.add(lblkelompok);
        lblkelompok.setBounds(10,70,100,20);
        panel.add(cbkelompok);
        cbkelompok.setBounds(75,70,100,20);
        
        panel.add(lblnilai);
        lblnilai.setBounds(10,100,70,20);
        
        panel.add(lbltugas1);
        lbltugas1.setBounds(10,118,90,20);
        panel.add(txtugas1);
        txtugas1.setBounds(75,120,90,20);
        
        panel.add(lbltugas2);
        lbltugas2.setBounds(10,134,90,30);
        panel.add(txtugas2);
        txtugas2.setBounds(75,140,90,20);
        
        panel.add(lbltugas3);
        lbltugas3.setBounds(10,154,90,30);
        panel.add(txtugas3);
        txtugas3.setBounds(75,160,90,20);
        
        panel.add(lbltugas4);
        lbltugas4.setBounds(10,174,90,30);
        panel.add(txtugas4);
        txtugas4.setBounds(75,180,90,20);
        
        panel.add(lbltugas5);
        lbltugas5.setBounds(10,194,90,30);
        panel.add(txtugas5);
        txtugas5.setBounds(75,200,90,20);
        
        panel.add(lbluts);
        lbluts.setBounds(10,214,90,30);
        panel.add(txtuts);
        txtuts.setBounds(75,220,90,20);
        
        panel.add(lbluas);
        lbluas.setBounds(10,234,90,30);
        panel.add(txuas);
        txuas.setBounds(75,240,90,20);
        
        panel.add(tblsave);
        tblsave.setBounds(180,200,90,18);
        
        panel.add(tblupdate);
        tblupdate.setBounds(180,220,90,18);
        
        panel.add(tblexit);
        tblexit.setBounds(180,240,90,18);
        
        
    }
    
}
