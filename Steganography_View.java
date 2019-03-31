package cse;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints; 
import java.awt.GridBagLayout; 
import java.awt.Insets; 

import javax.swing.BorderFactory; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JMenu; 
import javax.swing.JMenuBar; 
import javax.swing.JMenuItem; 
import javax.swing.JPanel; 
import javax.swing.JScrollPane; 
import javax.swing.JTextArea; 

public class Steganography_View extends JFrame 
{ 
private static final long serialVersionUID = -1703553958323231590L; 

private static int WIDTH  = 700; 
private static int HEIGHT = 700; 
 
//elements for JPanel 
private JTextArea  input; 
private JButton  encodeButton,decodeButton; 
private JLabel  image_input; 
 
//elements for Menu 
private JMenuItem  encode; 
private JMenuItem  decode; 
private JMenuItem  exit; 
 
public Steganography_View(String name) 
{ 
	
 super(name); 

 JMenuBar menu = new JMenuBar(); 
 JMenu file = new JMenu("File");
 file.setFont(new Font("Times New Roman", Font.PLAIN, 26));
 file.setMnemonic('F'); 
 encode = new JMenuItem("Encode"); 
 encode.setFont(new Font("Times New Roman", Font.PLAIN, 26));
 encode.setMnemonic('E'); 
 file.add(encode); 
 decode = new JMenuItem("Decode"); 
 decode.setFont(new Font("Times New Roman", Font.PLAIN, 26));
 decode.setMnemonic('D'); 
 file.add(decode); 
 file.addSeparator(); 
 exit = new JMenuItem("Exit");
 exit.setFont(new Font("Times New Roman", Font.PLAIN, 26));
 exit.setMnemonic('x');
 file.add(exit); 
  
 menu.add(file); 
 setJMenuBar(menu); 
   
 setResizable(true);      
 setBackground(Color.black);    
 setLocation(700,200);    
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setSize(WIDTH,HEIGHT);   
 setVisible(true);   
} 
 
public JMenuItem getEncode() 
{
	return encode;  
} 

public JMenuItem getDecode()  
{
	return decode;  
} 
 
public JMenuItem getExit() 
{
	return exit;  
} 

public JTextArea getText()  
{
	return input;    
} 
 
public JLabel  getImageInput() 
{
	return image_input; 
} 
 
public JPanel  getTextPanel()
{
	return new Text_Panel();
} 

public JPanel  getImagePanel()
{
	return new Image_Panel();
} 
 
public JButton  getEButton() 
{
	return encodeButton; 
} 

public JButton  getDButton()
{
	return decodeButton; 
} 
 

private class Text_Panel extends JPanel 
{ 
 private static final long serialVersionUID = -1503714729990491598L; 

 
 public Text_Panel() 
 { 
  
  GridBagLayout layout = new GridBagLayout();  
  GridBagConstraints layoutConstraints = new GridBagConstraints();  
  setLayout(layout); 
   
  input = new JTextArea();
  input.setFont(new Font("Times New Roman", Font.BOLD, 20)); 
  layoutConstraints.gridx  = 0; 
  layoutConstraints.gridy = 0;  
  layoutConstraints.gridwidth = 1; 
  layoutConstraints.gridheight = 1;  
  layoutConstraints.fill   = GridBagConstraints.BOTH;  
  layoutConstraints.insets  = new Insets(10,10,10,10);  
  layoutConstraints.anchor  = GridBagConstraints.CENTER;  
  layoutConstraints.weightx  = 1.0;
  layoutConstraints.weighty = 50.0; 
  JScrollPane scroll = new JScrollPane(input,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
  JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);  
  layout.setConstraints(scroll,layoutConstraints); 
  scroll.setBorder(BorderFactory.createLineBorder(Color.BLACK,1)); 
   add(scroll); 
      
     encodeButton = new JButton("Encode Now"); 
     encodeButton.setFont(new Font("Times New Roman", Font.BOLD, 28)); 
     layoutConstraints.ipady=40;
     layoutConstraints.gridx  = 0; 
     layoutConstraints.gridy = 1;  
  layoutConstraints.gridwidth = 4; 
  layoutConstraints.gridheight = 16;  
  layoutConstraints.fill   = GridBagConstraints.BOTH;  
  layoutConstraints.insets  = new Insets(0,-5,-5,-5);  
  layoutConstraints.anchor  = GridBagConstraints.CENTER;  
  layoutConstraints.weightx  = 1.0; 
  layoutConstraints.weighty = 1.0; 
  layout.setConstraints(encodeButton,layoutConstraints); 
    add(encodeButton); 
      
  
  setBackground(Color.lightGray); 
  setBorder(BorderFactory.createLineBorder(Color.BLACK,1)); 
 } 
} 
 

private class Image_Panel extends JPanel 
{ 
 private static final long serialVersionUID = 6962328466941120160L; 

  
 public Image_Panel() 
 { 
   
  GridBagLayout layout = new GridBagLayout();  
  GridBagConstraints layoutConstraints = new GridBagConstraints();  
  setLayout(layout); 
   
  image_input = new JLabel(); 
  
  layoutConstraints.gridx  = 0;
  layoutConstraints.gridy = 0;  
  layoutConstraints.gridwidth = 1; 
  layoutConstraints.gridheight = 1;  
  layoutConstraints.fill   = GridBagConstraints.BOTH;  
  layoutConstraints.insets  = new Insets(0,0,0,0);  
  layoutConstraints.anchor  = GridBagConstraints.CENTER;  
  layoutConstraints.weightx  = 1.0;
  layoutConstraints.weighty = 50.0; 
  JScrollPane scroll2 = new JScrollPane(image_input,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
  JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);  
  layout.setConstraints(scroll2,layoutConstraints); 
  scroll2.setBorder(BorderFactory.createLineBorder(Color.BLACK,1)); 
  image_input.setHorizontalAlignment(JLabel.CENTER); 
    add(scroll2); 
      
     decodeButton = new JButton("Decode Now"); 
     encodeButton.setFont(new Font("Times New Roman", Font.BOLD, 28));
     layoutConstraints.ipady=40;
     layoutConstraints.gridx  = 0; 
     layoutConstraints.gridy = 1;  
  layoutConstraints.gridwidth = 1; 
  layoutConstraints.gridheight = 1;  
  layoutConstraints.fill   = GridBagConstraints.BOTH;  
  layoutConstraints.insets  = new Insets(0,-5,-5,-5);  
  layoutConstraints.anchor  = GridBagConstraints.CENTER;  
  layoutConstraints.weightx  = 1.0; 
  layoutConstraints.weighty = 1.0; 
  layout.setConstraints(decodeButton,layoutConstraints); 
     add(decodeButton); 
      
      
  setBackground(Color.lightGray); 
  setBorder(BorderFactory.createLineBorder(Color.BLACK,1)); 
    } 
 } 
 

public static void main(String args[]) 
{ 
	Steganography_View c=new Steganography_View("Steganography"); 
} 
}