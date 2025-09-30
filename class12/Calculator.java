
import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener{
    Frame f;
    Button plus,minus,mult,div;
    Label FN,SN,Result;
    TextField tf1,tf2;
    Calculator(){
        f=new Frame();
        f.setTitle("Calculator");
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);

        FN=new Label("Enter First No");
        tf1=new TextField();
        FN.setBounds(50,50,150,50);
        tf1.setBounds(170,50,200,50);

        SN=new Label("Enter Second No");
        tf2=new TextField();        
        SN.setBounds(50,150,150,50);
        tf2.setBounds(200,150,150,50);
        

        Result=new Label("Result=");
        Result.setBounds(100,220,200,50);

        plus=new Button("+");
        plus.addActionListener(this);
        minus=new Button("-");
        minus.addActionListener(this);
        mult=new Button("*");
        mult.addActionListener(this);
        div=new Button("/");
        div.addActionListener(this);

        plus.setBounds(50,430,70,50);
        minus.setBounds(150,430,70,50);
        mult.setBounds(250,430,70,50);
        div.setBounds(350,430,70,50);

        f.add(FN);
        f.add(tf1);
        f.add(SN);
        f.add(tf2);
        f.add(Result);

        f.add(plus);
        f.add(minus);
        f.add(mult);
        f.add(div);

        f.setVisible(true);
    }

    public void ActionPerformed(ActionEvent e){
        int i=Integer.parseInt(tf1.getText());
        int j=Integer.parseInt(tf2.getText());
        if(e.getSource()==plus){
            Result.setText("Result= "+(i+j));
        }
        if(e.getSource()==minus){
            Result.setText("Result= "+(i-j));
        }
        if(e.getSource()==mult){
            Result.setText("Result= "+(i*j));
        }
        if(e.getSource()==div){
            Result.setText("Result= "+(i/j));
        }

    } 

    public static void main(String a[]){
        Calculator c=new Calculator();
    }
}