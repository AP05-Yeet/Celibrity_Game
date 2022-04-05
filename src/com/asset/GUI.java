package com.asset;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

import static com.Main.MAIN.END;

public class GUI {

    JFrame window;
    JLabel counterLabel;
    JTextField input;

    /*JTextArea Qinfo;*/
    //String title = JOptionPane.showInputDialog(null, "Place your question here!");



    Font font1 = new Font("SF Digital Readout", Font.BOLD, 100);
    Font FontMain = new Font("Arial", Font.PLAIN, 15);
    Timer timer;
    int second, minute;
    String ddSecond, ddMinute;
    DecimalFormat dFormat = new DecimalFormat("00");


    public static void main(String[] args) {

        new GUI();
    }

    public GUI() {

        window = new JFrame();
        window.setSize(300,150);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Celebrity Game Timer");
        window.setLayout(null);
        //window.setBackground(Color.black);

        counterLabel = new JLabel("");
        counterLabel.setBounds(45, 10, 200, 100);
        counterLabel.setHorizontalAlignment(JLabel.CENTER);
        counterLabel.setFont(font1);

        input = new JTextField();
        input.setText("Place your question here!");
        input.setBounds(300, 435 ,300, 50);
        input.setHorizontalAlignment(JLabel.CENTER);
        input.setFont(FontMain);


        window.add(input);
        window.setVisible(true);

        window.add(counterLabel);
        window.setVisible(true);

        // Countdown Timer
        counterLabel.setText("03:00");
        counterLabel.setBackground(Color.RED);
        second =0;
        minute =3;
        countdownTimer();
        timer.start();


        /*Qinfo = new JTextArea();
        Qinfo.setText("Place your question down here!");
        Qinfo.setBounds(300, 335 ,300, 50);
        Qinfo.setFont(FontMain);


        window.add(Qinfo);
        window.setVisible(true);*/



    }


    public void countdownTimer() {

        timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                second--;
                ddSecond = dFormat.format(second);
                ddMinute = dFormat.format(minute);
                counterLabel.setText(ddMinute + ":" + ddSecond);

                if(second==-1) {
                    second = 59;
                    minute--;
                    ddSecond = dFormat.format(second);
                    ddMinute = dFormat.format(minute);
                    counterLabel.setText(ddMinute + ":" + ddSecond);
                }
                if(minute==0 && second==0) {
                    timer.stop();
                    END();

                }
            }
        });
    }
}
