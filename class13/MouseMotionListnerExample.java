import java.awt.*;
import java.awt.event.*;
class MouseMotionListnerExample implements MouseMotionListener{
Label l1;
Frame f;

MouseMotionListnerExample(){
f=new Frame();
f.setSize(600,600);
f.setLayout(null);

l1=new Label();
l1.setBounds(50,50,200,50);
f.add(l1);
f.addMouseMotionListener(this); //register to motionlistner
f.setVisible(true);
}

public void mouseDragged(MouseEvent e){
l1.setText("Mouse Dragged at (" +e.getX() + "," + e.getY() +")" );
Graphics g=f.getGraphics();
g.setColor(Color.RED);
g.fillOval(e.getX(),e.getY(),20,20);
}

public void mouseMoved(MouseEvent e){
l1.setText("moved at" +  + e.getX() + "," + e.getY() );
}

public static void main(String a[]){
new MouseMotionListnerExample();
}
}