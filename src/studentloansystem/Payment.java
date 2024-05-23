/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package studentloansystem;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Panewels
 */
public class Payment extends javax.swing.JInternalFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }
    
    public class Main {
        public static void main(String[] args) {
            // Create a new JFrame to contain the JDesktopPane
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a new JDesktopPane
            JDesktopPane desktop = new JDesktopPane();

            // Create a new Home JInternalFrame and add it to the JDesktopPane
            Payment payment = new Payment();
            payment.setTitle("Home");
            payment.setSize(975, 359);
            desktop.add(payment);

            // Add the JDesktopPane to the JFrame
            frame.getContentPane().add(desktop);

            // Set the JFrame size and make it visible
            frame.setSize(1024, 768);
            frame.setVisible(true);

            // Move the Home JInternalFrame to the center of the JDesktopPane
            payment.setLocation(desktop.getWidth() / 2 - payment.getWidth() / 2, desktop.getHeight() / 2 - payment.getHeight() / 2);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(211, 250, 215));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 963, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
