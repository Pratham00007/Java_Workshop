import java.awt.*;
import java.awt.event.*;

public class FavoriteLanguageAWT extends Frame implements ActionListener {

    // Declare components
    Label nameLabel, langLabel, resultLabel;
    TextField nameField;
    Choice langChoice;
    Button submitButton;

    public FavoriteLanguageAWT() {
        
        setTitle("Favorite Programming Language");
        setSize(400, 250);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));


        nameLabel = new Label("Enter your name:");
        nameField = new TextField(15);

        langLabel = new Label("Select your favorite language:");
        langChoice = new Choice();
        langChoice.add("Java");
        langChoice.add("Python");
        langChoice.add("C++");

        submitButton = new Button("Submit");
        
        resultLabel = new Label("Your selection will appear here.");
        submitButton.addActionListener(this);

        add(nameLabel);
        add(nameField);
        add(langLabel);
        add(langChoice);
        add(submitButton);
        add(resultLabel);

        // Handle window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        String language = langChoice.getSelectedItem();

        if (name.isEmpty()) {
            resultLabel.setText("Please enter your name!");
        } else {
            resultLabel.setText("Hello " + name + " Your favorite language is " + language);
        }
    }

    public static void main(String[] args) {
        new FavoriteLanguageAWT();
    }
}
