import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class MyFrame extends JFrame{   // JFrame = a GUI window to add components to
    
  
    MyFrame(){

        this.setTitle("JFrame title goes here"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
        this.setResizable(false); //prevent frame from being resized
        this.setSize(420,420); //sets the x-dimension, and y-dimension of frame
        this.setVisible(true); //make frame visible
        
        ImageIcon image = new ImageIcon("utd icon.png"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        //this.getContentPane().setBackground(new Color(0x123456)); //change color of background
    
    }
}


