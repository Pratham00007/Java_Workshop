import java.awt.*;
import java.awt.event.*;
class Form extends Frame implements ActionListener{
    Checkbox cricket,badminton;
    Checkbox male,female;
    Button b;
    Form(){
        CheckboxGroup cbg=new CheckboxGroup();
        male=new Checkbox("Male",cbg,false);
        female=new Checkbox("Female",cbg,false);
        add(male);
        add(female);

        

        cricket=new Checkbox("Cricket");
        badminton=new Checkbox("Badminton");
        b=new Button("Submit");
        b.addActionListener(this);
        setSize(500,500);
        setLayout(null);
        cricket.setBounds(50,50,100,50);
        badminton.setBounds(50,200,100,50);
        b.setBounds(50,200,100,50);
        male.setBounds(200,350,100,50);
        female.setBounds(200,550,100,50);
        
        add(cricket);
        add(badminton);
        setVisible(true);
        add(b);

    }
    public void actionPerformed(ActionEvent e){
        if(cricket.getState()==true){
            System.out.println("Cricket");
        }
        if(badminton.getState()==true){
            System.out.println("Badminton");
        }
    }

    public static void main(String a[]){
        Form f=new Form();

    }
}