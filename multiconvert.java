import java.awt.*;
import java.awt.event.*;

class multiconvert implements ActionListener
{
    //Declaring Objects
    Frame f=new Frame("Pachi");
    Label l=new Label("Multi Purpose Converter");
  
    
    TextField t1=new TextField();
    TextField t2=new TextField();
    
    
    Button b1=new Button("C->F");
    Button b2=new Button("$->Rs");
    Button b3=new Button("Po->Kg");
    Button b4=new Button("Mi->Km");
    Button b5=new Button("Rad->Deg");
    Button b11=new Button("F->C");
    Button b22=new Button("Rs->$");
    Button b33=new Button("Kg->Po");
    Button b44=new Button("Km->Mi");
    Button b55=new Button("Deg->Rad");

    
    multiconvert()
    {
        //Giving Coordinates
        
        l.setBounds(145,40,400,45);
        t1.setBounds(75,85,300,40);
        t2.setBounds(75,140,300,40);
        
        
        b1.setBounds(30,200,65,20);
        b2.setBounds(110,200,65,20);
        b3.setBounds(190,200,65,20);
        b4.setBounds(270,200,65,20);
        b5.setBounds(350,200,75,20);
        b11.setBounds(30,250,65,20);
        b22.setBounds(110,250,65,20);
        b33.setBounds(190,250,65,20);
        b44.setBounds(270,250,65,20);
        b55.setBounds(350,250,75,20);
        
        //Adding components to the frame
        f.add(l);
        
        f.add(t1);
        f.add(t2);
        
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b11);
        f.add(b22);
        f.add(b33);
        f.add(b44);
        f.add(b55);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b11.addActionListener(this);
        b22.addActionListener(this);
        b33.addActionListener(this);
        b44.addActionListener(this);
        b55.addActionListener(this);
        
        f.pack();
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(450,350);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        float n1=Float.parseFloat(t1.getText());
      
        
        if(e.getSource()==b1)
        {
            t2.setText(String.valueOf((n1*1.8)+32));
        }
        
        if(e.getSource()==b2)
        {
            t2.setText(String.valueOf(n1*65));
        }
        
        if(e.getSource()==b3)
        {
            t2.setText(String.valueOf(n1*0.453));
        }
        
        if(e.getSource()==b4)
        {
                t2.setText(String.valueOf(n1*1.6));
            
        }
        
        if(e.getSource()==b5)
        {
            t2.setText(String.valueOf(n1/0.017));
        }
        
        
        if(e.getSource()==b11)
        {
            t2.setText(String.valueOf((n1-32)/1.8));
        }
        
        if(e.getSource()==b22)
        {
            t2.setText(String.valueOf(n1/65));
        }
        
        if(e.getSource()==b33)
        {
            t2.setText(String.valueOf(n1/0.453));
        }
        
        if(e.getSource()==b44)
        {
            t2.setText(String.valueOf(n1/1.6));
            
        }
        
        if(e.getSource()==b55)
        {
            t2.setText(String.valueOf(n1*0.017));
        }

        
    }
    
    public static void main(String...s)
    {
        new multiconvert();
    }
}
