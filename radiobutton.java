import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class radiobutton extends JFrame{
    private JTextField text;
    private Font plainFont;
    private Font boldFont;
    private Font italicFont;
    private Font boldItalicFont;
    private JRadioButton plainJRadioButton;
    private JRadioButton boldJRadioButton;
    private JRadioButton italicJRadioButton;
    private JRadioButton boldItalicJRadioButton;
    private ButtonGroup radioGroup;
    public radiobutton (){

         super("test radio");
         setLayout(new FlowLayout());

         text = new JTextField("watch the style change",25);
         text.setEditable(false);
         
         plainJRadioButton = new JRadioButton("Plain",true);
         boldJRadioButton = new JRadioButton("Bold",false);
         italicJRadioButton = new JRadioButton("Italic",false);
         boldItalicJRadioButton = new JRadioButton("BoldItalic",false);
        
        add(text);
        add(plainJRadioButton);
        add(boldJRadioButton);
        add(italicJRadioButton);
        add(boldItalicJRadioButton);

        radioGroup = new ButtonGroup();
        radioGroup.add(plainJRadioButton);
        radioGroup.add(boldJRadioButton);
        radioGroup.add(italicJRadioButton);
        radioGroup.add(boldItalicJRadioButton);

        plainFont = new Font ("Serif",Font.PLAIN,14);
        boldFont = new Font ("Serif",Font.BOLD,14);
        italicFont = new Font ("Serif",Font.ITALIC,14);
        boldItalicFont = new Font ("Serif",Font.BOLD + Font.ITALIC,14);
         
        plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
        boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
        italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
        boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
        text.setFont(plainFont);
    }
        private class RadioButtonHandler implements ItemListener{
           private Font fonte;
           public RadioButtonHandler ( Font f){
            fonte = f;
           }
           public void itemStateChanged ( ItemEvent event){
            text.setFont(fonte);
           }
        }
}
