import java.awt.*;
import java.awt.event.*;
class Notepad implements ActionListener{

Frame f=new Frame();
MenuBar mb;

Menu File,edit,View,exit;
Notepad (){
    mb=new MenuBar();
File=new Menu("File");
edit=new Menu("Edit");
View=new Menu("View");
MenuItem new1 = new MenuItem("New");
MenuItem save=new MenuItem("save");
MenuItem Window = new MenuItem("New Window");
MenuItem markdowntab=new MenuItem("New arkdown Tab");
   // MenuItem new = new MenuItem("Open");
MenuItem exit = new MenuItem("Exit");
exit.addActionListener(this);

f.setSize(500,500);

    
    f.setLayout(null);
    TextArea ta=new TextArea();
    ta.setBounds(0,0,500,500);

    File.add(new1);
    File.add(save);
    File.add(Window);
    File.add(markdowntab);
   // File.add(open);
    File.add(exit);
    mb.add(File);
    mb.add(edit);
    mb.add(View);
    f.setMenuBar(mb);
    f.add(ta);
    f.setVisible(true);
}

public void actionPerformed(ActionEvent e){
if(e.getSource()==exit)
f.dispose();
}



public static void main(String a[]){
    new Notepad();
}
}