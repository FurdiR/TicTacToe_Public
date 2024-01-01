import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;

//import static sun.jvm.hotspot.runtime.BasicObjectLock.size;


public class Main {
    public static void main(String[] args) {

        JFrame jframe = new JFrame("Tic Tac Toe");
        jframe.setLayout(new GridLayout(3,3));
        JButton button2 = new JButton();
        final int[] clickcount = {0};
        for(int i=1;i<=9;i++)
        {
            JButton button1= new JButton();
            jframe.add(button1);

            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    clickcount[0]++;
                    if(clickcount[0] %2==1)
                    {
                        button1.setText("X");
                    }
                    else
                    {
                        button1.setText("0");
                    }

                }
            });
        }


        jframe.setSize(600,600);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);


    }
}
