package com.beegfs.admon.gui.components.panels;


import java.awt.Color;


public class StatusPanel extends javax.swing.JPanel
{
   private static final long serialVersionUID = 1L;

   public StatusPanel()
   {
      initComponents();
   }

   public javax.swing.JTextPane getTextPane()
   {
      return jTextPaneStatus;
   }

   public void addLine(String text, boolean withDate)
   {
      if (withDate)
      {
         String message = text.substring(text.indexOf(']') + 2);
         if (!jTextPaneStatus.getText().contains(message))
         {
            jTextPaneStatus.setText(jTextPaneStatus.getText() + text + System.lineSeparator());
            jTextPaneStatus.setBackground(new Color(255, 61, 81));
            jTextPaneStatus.revalidate();
            this.revalidate();
         }
      }
      else
      {
         addLine(text);
      }
   }

   public void addLine(String text)
   {
      if (!jTextPaneStatus.getText().contains(text))
      {
         jTextPaneStatus.setText(jTextPaneStatus.getText() + text + System.lineSeparator());
         jTextPaneStatus.setBackground(new Color(255, 61, 81));
         jTextPaneStatus.revalidate();
         this.revalidate();
      }
   }

   public void clear()
   {
      jTextPaneStatus.setText("");
      jTextPaneStatus.setBackground(Color.WHITE);
      jTextPaneStatus.revalidate();
      this.revalidate();
   }

   /**
    * This method is called from within the constructor to initialize the form. WARNING: Do NOT
    * modify this code. The content of this method is always regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jScrollPaneStatus = new javax.swing.JScrollPane();
      jTextPaneStatus = new javax.swing.JTextPane();

      setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 0)));
      setLayout(new java.awt.BorderLayout());

      jTextPaneStatus.setEditable(false);
      jTextPaneStatus.setBorder(null);
      jScrollPaneStatus.setViewportView(jTextPaneStatus);

      add(jScrollPaneStatus, java.awt.BorderLayout.CENTER);
   }// </editor-fold>//GEN-END:initComponents


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JScrollPane jScrollPaneStatus;
   private javax.swing.JTextPane jTextPaneStatus;
   // End of variables declaration//GEN-END:variables

}