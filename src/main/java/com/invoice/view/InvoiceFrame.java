/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.invoice.view;

import com.invoice.controller.mainActionListener;
import com.invoice.controller.selListener;
import com.invoice.model.invoiceHeader;
import com.invoice.model.invoiceLine;
import com.invoice.model.tableModelInvoiceHead;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author aboba
 */
public class InvoiceFrame extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceJFrame
     */
    public InvoiceFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        HeaderTBL = new javax.swing.JTable();
        CreateNewInvoice = new javax.swing.JButton();
        DeleteInvoice = new javax.swing.JButton();
        invoicenum = new javax.swing.JLabel();
        invoicedate = new javax.swing.JLabel();
        invoicename = new javax.swing.JLabel();
        invoicetot = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        LineTBL = new javax.swing.JTable();
        CreateInvoiceItems = new javax.swing.JButton();
        CancelLine = new javax.swing.JButton();
        invNo = new javax.swing.JLabel();
        InvDt = new javax.swing.JLabel();
        InvNm = new javax.swing.JLabel();
        InvTL = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeaderTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        HeaderTBL.getSelectionModel().addListSelectionListener(sellistener);
        jScrollPane2.setViewportView(HeaderTBL);

        CreateNewInvoice.setText("Create New Invoice");
        CreateNewInvoice.addActionListener(menuAction);

        DeleteInvoice.setText("Delete Invoice");
        DeleteInvoice.addActionListener(menuAction);
        DeleteInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteInvoiceActionPerformed(evt);
            }
        });

        invoicenum.setText("Invoice Number");

        invoicedate.setText("Invoice Date");

        invoicename.setText("Customer Name");

        invoicetot.setText("Invoice Total");

        LineTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(LineTBL);

        CreateInvoiceItems.setText("Create Invoice Items");
        CreateInvoiceItems.setActionCommand("Create Invoice Items");
        CreateInvoiceItems.addActionListener(menuAction);
        CreateInvoiceItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateInvoiceItemsActionPerformed(evt);
            }
        });

        CancelLine.setText("Cancel Line");
        CancelLine.addActionListener(menuAction);

        jLabel9.setText("Invoice Items");

        jMenu1.setText("File");

        loadMenuItem.setText("Load Files");
        loadMenuItem.addActionListener(menuAction);
        loadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadMenuItem);

        saveMenuItem.setText("Save Files");
        saveMenuItem.addActionListener(menuAction);
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(CreateNewInvoice)
                .addGap(91, 91, 91)
                .addComponent(DeleteInvoice)
                .addGap(86, 469, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(invoicedate)
                                .addComponent(invoicenum))
                            .addComponent(invoicename, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoicetot, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvDt)
                            .addComponent(invNo)
                            .addComponent(InvNm)
                            .addComponent(InvTL))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(CreateInvoiceItems)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CancelLine)
                                .addGap(57, 57, 57))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoicenum)
                            .addComponent(invNo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoicedate)
                            .addComponent(InvDt))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoicename)
                            .addComponent(InvNm))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoicetot)
                            .addComponent(InvTL))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateNewInvoice)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DeleteInvoice)
                        .addComponent(CreateInvoiceItems)
                        .addComponent(CancelLine)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void DeleteInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteInvoiceActionPerformed

    private void CreateInvoiceItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateInvoiceItemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateInvoiceItemsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelLine;
    private javax.swing.JButton CreateInvoiceItems;
    private javax.swing.JButton CreateNewInvoice;
    private javax.swing.JButton DeleteInvoice;
    private javax.swing.JTable HeaderTBL;
    private javax.swing.JLabel InvDt;
    private javax.swing.JLabel InvNm;
    private javax.swing.JLabel InvTL;
    private javax.swing.JTable LineTBL;
    private javax.swing.JLabel invNo;
    private javax.swing.JLabel invoicedate;
    private javax.swing.JLabel invoicename;
    private javax.swing.JLabel invoicenum;
    private javax.swing.JLabel invoicetot;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
private mainActionListener menuAction = new mainActionListener(this);
private ArrayList<invoiceHeader> arrInvoiceHeader;
private ArrayList<invoiceLine> arrInvoiceLine;
private tableModelInvoiceHead TableModelInvoice;
private selListener sellistener = new selListener(this);
public static SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");


    public void setArrInvoice(ArrayList<invoiceHeader> arrInvoiceHeader) {
        this.arrInvoiceHeader = arrInvoiceHeader;
    }
    
    public invoiceHeader getItems(int id){
        for (invoiceHeader invH : arrInvoiceHeader){
            if(invH.getNumber()==id){
                return invH;
            }
        
        }
        return null;
    }

    public tableModelInvoiceHead getTableModelInvoice() {
        return TableModelInvoice;
    }

    public void setTableModelInvoice(tableModelInvoiceHead TableModelInvoice) {
        this.TableModelInvoice = TableModelInvoice;
    }

    public javax.swing.JTable getHeaderTBL() {
        return HeaderTBL;
    }

    public void setHeaderTBL(javax.swing.JTable HeaderTBL) {
        this.HeaderTBL = HeaderTBL;
    }

    public javax.swing.JTable getLineTBL() {
        return LineTBL;
    }

    public void setLineTBL(javax.swing.JTable LineTBL) {
        this.LineTBL = LineTBL;
    }

    public ArrayList<invoiceHeader> getArrInvoiceHeader() {
        return arrInvoiceHeader;
    }

    public javax.swing.JLabel getInvoicedate() {
        return invoicedate;
    }

    public void setInvoicedate(javax.swing.JLabel invoicedate) {
        this.invoicedate = invoicedate;
    }

    public javax.swing.JLabel getInvoicename() {
        return invoicename;
    }

    public void setInvoicename(javax.swing.JLabel invoicename) {
        this.invoicename = invoicename;
    }

    public javax.swing.JLabel getInvoicenum() {
        return invoicenum;
    }

    public void setInvoicenum(javax.swing.JLabel invoicenum) {
        this.invoicenum = invoicenum;
    }

    public javax.swing.JLabel getInvoicetot() {
        return invoicetot;
    }

    public void setInvoicetot(javax.swing.JLabel invoicetot) {
        this.invoicetot = invoicetot;
    }

    public javax.swing.JLabel getInvDt() {
        return InvDt;
    }

    public void setInvDt(javax.swing.JLabel InvDt) {
        this.InvDt = InvDt;
    }

    public javax.swing.JLabel getInvNm() {
        return InvNm;
    }

    public void setInvNm(javax.swing.JLabel InvNm) {
        this.InvNm = InvNm;
    }

    public javax.swing.JLabel getInvTL() {
        return InvTL;
    }

    public void setInvTL(javax.swing.JLabel InvTL) {
        this.InvTL = InvTL;
    }

    public javax.swing.JLabel getInvNo() {
        return invNo;
    }

    public void setInvNo(javax.swing.JLabel invNo) {
        this.invNo = invNo;
    }

    public mainActionListener getMenuAction() {
        return menuAction;
    }

    public void setMenuAction(mainActionListener menuAction) {
        this.menuAction = menuAction;
    }

    public ArrayList<invoiceLine> getArrInvoiceLine() {
        return arrInvoiceLine;
    }

    public void setArrInvoiceLine(ArrayList<invoiceLine> arrInvoiceLine) {
        this.arrInvoiceLine = arrInvoiceLine;
    }
    
    
    
    
    
    
    
}
