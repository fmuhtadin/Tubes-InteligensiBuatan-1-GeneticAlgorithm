/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUIJadwal.java
 *
 * Created on Feb 21, 2013, 5:28:31 PM
 */
package gajadwaliboy;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.event.*;
import java.lang.*;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Gabrielle
 */
public class GUIJadwal extends javax.swing.JFrame {

    /** Creates new form GUIJadwal */
    public GUIJadwal(String s, Iboy.DataUmum du) {
        
        initComponents();
         todo.setText(s);
        imgThisImg = new ImageIcon();
        labelboy.setIcon(cowo1);
        counter = 1;
        dataUmum = du;
        enlightenment = 0;
        energy = du.energi;
        money = du.modaluang;
       
    }
    
     /* protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw image centered.
        int x = (getWidth() - image.getWidth())/2;
        int y = (getHeight() - image.getHeight())/2;
        g.drawImage(image, x, y, this);
    }*/
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        boydraw = new javax.swing.JLabel();
        labelgambar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        done = new javax.swing.JTextField();
        nowdoing = new javax.swing.JTextField();
        todo = new javax.swing.JTextField();
        labelboy = new javax.swing.JLabel();
        labelthingsgirl = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        currEnlightenmentLabel = new javax.swing.JLabel();
        currEnergyLabel = new javax.swing.JLabel();
        currEnlightenment = new javax.swing.JTextField();
        currEnergy = new javax.swing.JTextField();
        currMoneyLabel = new javax.swing.JLabel();
        currMoney = new javax.swing.JTextField();
        hariLabel = new javax.swing.JLabel();
        hari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setText("jTextField1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        done.setEditable(false);

        nowdoing.setEditable(false);

        todo.setEditable(false);
        todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todoActionPerformed(evt);
            }
        });

        labelboy.setText("    ");

        labelthingsgirl.setText("    ");

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gajadwaliboy/next1.jpg"))); // NOI18N
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        currEnlightenmentLabel.setText("Enlightenment");

        currEnergyLabel.setText("Energy");

        currEnlightenment.setEditable(false);

        currEnergy.setEditable(false);
        currEnergy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currEnergyActionPerformed(evt);
            }
        });

        currMoneyLabel.setText("Money");

        currMoney.setEditable(false);

        hariLabel.setText("Day");

        hari.setEditable(false);
        hari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nowdoing, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(done, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(todo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(currEnlightenment)
                                    .addComponent(currEnlightenmentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(labelboy)))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(currEnergyLabel)
                                    .addComponent(currEnergy, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(currMoneyLabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(currMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(hariLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hari, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(labelthingsgirl))))
                .addContainerGap(341, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(next)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(nowdoing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(todo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(currEnlightenmentLabel)
                            .addComponent(currEnergyLabel)
                            .addComponent(currMoneyLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(currEnlightenment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currEnergy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hariLabel)
                            .addComponent(hari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelboy, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelthingsgirl)))))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(boydraw)
                        .addGap(245, 245, 245)
                        .addComponent(labelgambar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(414, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boydraw)
                    .addComponent(labelgambar))
                .addContainerGap(246, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_todoActionPerformed
    public ImageIcon imgThisImg;
    private ImageIcon cewe1 = new ImageIcon("gambarceww/cewe10.jpg");
    private ImageIcon cewe2 = new ImageIcon("gambarceww/cewe5.jpg");
    private ImageIcon cewe3 = new ImageIcon("gambarceww/cewe11.jpg");
    private ImageIcon cewe4 = new ImageIcon("gambarceww/cewe9.jpg");
    private ImageIcon cewe5 = new ImageIcon("gambarceww/cewe4.jpg");
    private ImageIcon giftbox1 = new ImageIcon("gambarceww/gitbox1.jpg");
    private ImageIcon giftbox2 = new ImageIcon("gambarceww/gitbox2.jpg");
    private ImageIcon giftbox3 = new ImageIcon("gambarceww/gitbox6.jpg");
    private ImageIcon giftbox4 = new ImageIcon("gambarceww/gitbox4.jpg");
    private ImageIcon giftbox5 = new ImageIcon("gambarceww/gitbox5.jpg");
    private ImageIcon cowo1 = new ImageIcon("gambarceww/cowo1.jpg");
    private ImageIcon idle1 = new ImageIcon("gambarceww/bed1.jpg");
    private int counter;
    private int enlightenment;
    private int energy;
    private int money;
    private Iboy.DataUmum dataUmum;
    
    Timer aTimer = new Timer();
    
    TimerTask taskPerformer = new TimerTask() {
        @Override
        public void run() {
            char c='@';
            if (!nowdoing.getText().equalsIgnoreCase("")) {
                calcAndSetEnlightenment(nowdoing.getText().charAt(0));
                calcAndSetEnergy(nowdoing.getText().charAt(0),counter);
                calcAndSetMoney(nowdoing.getText().charAt(0),counter);
                hari.setText(Integer.toString(counter/10 +1));
                done.setText(done.getText()+nowdoing.getText());
            }
            if (todo.getText().length() != 0) {
                nowdoing.setText( todo.getText().substring(0, 1));
                c=nowdoing.getText().charAt(0);
                todo.setText(todo.getText().substring(1));
            } else {
                nowdoing.setText("");
                hari.setText(Integer.toString(counter/10));
                labelthingsgirl.setIcon(null);
                aTimer.cancel();
            }

            switch(c){
                case '0' : labelthingsgirl.setIcon(idle1);  break;
                case '1' : labelthingsgirl.setIcon(cewe1);  break;                      
                case '2' : labelthingsgirl.setIcon(cewe2); break;
                case '3' : labelthingsgirl.setIcon(cewe3); break;
                case '4' : labelthingsgirl.setIcon(cewe4);break;
                case '5' : labelthingsgirl.setIcon(cewe5);break;
                case 'A' : labelthingsgirl.setIcon(giftbox1);break;
                case 'B' : labelthingsgirl.setIcon(giftbox2);break;
                case 'C' : labelthingsgirl.setIcon(giftbox3);break;
                case 'D' : labelthingsgirl.setIcon(giftbox4);break;
                
            }
            counter++;
        }
    };
    
    private void scheduleTimer (Timer timer, TimerTask task) {
        timer.scheduleAtFixedRate(task, 0, 650);
    }
    
    private void calcAndSetEnlightenment(char c) {
        if ((c <= '9') && (c > '0')) {
            enlightenment += dataUmum.findKandidat((int) c - 48).enlightmentperjam;
        }
        currEnlightenment.setText(Integer.toString(enlightenment));
    }
    
    private void calcAndSetEnergy(char c, int counter) {
        if (counter%10 == 0) {
            energy = dataUmum.energi;
        }
        if ((c <= '9') && (c > '0')) {
            energy -= dataUmum.findKandidat((int) c - 48).energiperjam;    
        }
        currEnergy.setText(Integer.toString(energy));
    }
    
    private void calcAndSetMoney(char c, int counter) {
        if (counter%10 == 0) {
            money += dataUmum.tambahanuangperhari;
        }
        if ((c <= 'Z') && (c>='A')) {
            money -= dataUmum.findBarang(c).hargabarang;
        }
        currMoney.setText(Integer.toString(money));
    }
    
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        
        
        scheduleTimer(aTimer,taskPerformer);
        next.setEnabled(false);
       
        
    }//GEN-LAST:event_nextActionPerformed

    private void currEnergyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currEnergyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currEnergyActionPerformed

    private void hariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hariActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
              //  new GUIJadwal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boydraw;
    private javax.swing.JTextField currEnergy;
    private javax.swing.JLabel currEnergyLabel;
    private javax.swing.JTextField currEnlightenment;
    private javax.swing.JLabel currEnlightenmentLabel;
    private javax.swing.JTextField currMoney;
    private javax.swing.JLabel currMoneyLabel;
    private javax.swing.JTextField done;
    private javax.swing.JTextField hari;
    private javax.swing.JLabel hariLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelboy;
    private javax.swing.JLabel labelgambar;
    private javax.swing.JLabel labelthingsgirl;
    private javax.swing.JButton next;
    private javax.swing.JTextField nowdoing;
    private javax.swing.JTextField todo;
    // End of variables declaration//GEN-END:variables
}