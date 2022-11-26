package hotel.management.system;
import javax.swing.*;//bg pic use korte
import java.awt.*;//color r jono
import java.awt.event.*;

public class HotelManagementSystem extends JFrame  {
    HotelManagementSystem(){
        //setSize(1595,800);
        //setLocation(0,0);
        setBounds(0,0,1595,800);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,1595,800);
        add(image);
        
        JLabel text=new JLabel("PARADISE HOTEL MANAGEMENT SYSTEM");
        text.setBounds(395, 0, 1000, 90);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("serif",Font.ITALIC,50));
        image.add(text);
        
        JButton next=new JButton("NEXT");
        next.setBounds(1200,700,150,50);
        next.setBackground(Color.WHITE);
        image.add(next);

        next.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    new Login().setVisible(true);
                }
                catch(Exception e ){}
            }
        });

         setVisible(true);



    }

       public static void main(String[] args) {
        new  HotelManagementSystem();
       }
}
