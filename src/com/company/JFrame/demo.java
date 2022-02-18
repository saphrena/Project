package JFrame;/*
 @saphrena
 @2022/2/11 011
 @Demo
*/


import javax.swing.*;
import java.awt.*;

public class demo extends JFrame {
    public demo(){
        setTitle("流布局管里器");
        Container c = getContentPane();
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        for(int i = 0;i<=10;i++) {
            c.add(new JButton("button" + i));
        }
            setSize(300,200);
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            setVisible(true);
        }
        public static void main (String[] args){
            new demo();
        }
    }


