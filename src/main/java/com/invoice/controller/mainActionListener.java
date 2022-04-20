/* 

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.invoice.controller;

import com.invoice.model.invoiceHeader;
import com.invoice.model.invoiceLine;
import com.invoice.model.tableModelInvoiceHead;
import com.invoice.model.tableModelInvoiceLine;
import com.invoice.view.InvoiceFrame;
import com.invoice.view.dialogHeader;
import com.invoice.view.dialogLine;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author aboba
 */
public class mainActionListener implements ActionListener{
    public InvoiceFrame invoiceFrame;
    private dialogHeader dialogheader;
    private dialogLine dialogline;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    public mainActionListener(InvoiceFrame invoiceFrame){
        this.invoiceFrame = invoiceFrame; 
    }

    @Override
    public void actionPerformed(ActionEvent e) { 
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        switch (e.getActionCommand()) {
            case "Load Files":
                loadFiles();
                break;
            case "Save Files":
                saveFiles();
                break;   
            case "Create New Invoice":
                createNewInvoice();
                break;
            case "Create Invoice Items":
                CreateInvoiceItems();
                break;
            case "Delete Invoice":
                deleteInvoice();
                break;
            case "Cancel Line":
                Cancel();
                break;
            case "OKinvoiceH":
                ok();
                break;
            case "CancelinvoiceH":
                cancelinvoice();
                break;
            case "OKinvoiceL":
                okLine();
                break;
            case "CancelinvoiceL":
                cancelinvoiceline();
                break;
                
            default:
                throw new AssertionError();
        }
    }

    private void loadFiles() {
        JFileChooser fileChooser = new JFileChooser();
        try{
            int Result = fileChooser.showOpenDialog(invoiceFrame);
            if (Result ==JFileChooser.APPROVE_OPTION){
                File Header = fileChooser.getSelectedFile();
                Path headerPath = Paths.get(Header.getAbsolutePath());
                java.util.List<String> headerLines =Files.readAllLines(headerPath);
                ArrayList<invoiceHeader>invoiceHeaders=new ArrayList<>();
                for(String headerLine : headerLines ){
                    String[] HeaderLines = headerLine.split(",");
                    String HeaderLines1 = HeaderLines[0];
                    String HeaderLines2 = HeaderLines[1];
                    String HeaderLines3 = HeaderLines[2];
                    int id = Integer.parseInt(HeaderLines1);
                    Date dateHeader = dateFormat.parse(HeaderLines2);      
                    invoiceHeader headers = new invoiceHeader(id,HeaderLines3,dateHeader);
                    invoiceHeaders.add(headers);
               
                }
                invoiceFrame.setArrInvoice(invoiceHeaders);
                Result=fileChooser.showOpenDialog(invoiceFrame);
                 if (Result ==JFileChooser.APPROVE_OPTION){
                     File Lines = fileChooser.getSelectedFile();
                     Path linePath = Paths.get(Lines.getAbsolutePath());
                     java.util.List<String> invLines =Files.readAllLines(linePath);
                     ArrayList<invoiceLine>invoiceLines=new ArrayList<>();
                     for(String invLine:invLines){
                        String[] invLinee = invLine.split(",");
                        String arr1 = invLinee[0];//no
                        String arr2 = invLinee[1];//nameitem
                        String arr3 = invLinee[2];//cost
                        String arr4 = invLinee[3];//count
                        int id = Integer.parseInt(arr1);
                        double price = Double.parseDouble(arr3);
                        int count = Integer.parseInt(arr4);
                        invoiceHeader invheader = invoiceFrame.getItems(id);
                        //invoiceLine line = new invoiceLine(arr4, price, count, invheader);
                        //invheader.getInvoiceLines().add(line);
                        invoiceLine InvoiceLine = new invoiceLine(arr2,price,count,invheader);
                        invheader.getInvoiceLines().add(InvoiceLine);

                     }
                 }
                 tableModelInvoiceHead table = new tableModelInvoiceHead(invoiceHeaders);
                 invoiceFrame.setTableModelInvoice(table);
                 invoiceFrame.getHeaderTBL().setModel(table);
                 
                
            
            }
    }catch(IOException e){
            JOptionPane.showMessageDialog(invoiceFrame, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
    }   catch (ParseException ex) {
            JOptionPane.showMessageDialog(invoiceFrame, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }}

    private void saveFiles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void createNewInvoice() {
        dialogheader = new dialogHeader(invoiceFrame);
        dialogheader.setVisible(true);
    }

    private void deleteInvoice() {
        int selectedInvoiceIndex = invoiceFrame.getHeaderTBL().getSelectedRow();
        if (invoiceFrame.getHeaderTBL().getSelectedRow() != -1) {
            invoiceFrame.getArrInvoiceHeader().remove(selectedInvoiceIndex);
            invoiceFrame.getTableModelInvoice().fireTableDataChanged();

            invoiceFrame.getLineTBL().setModel(new tableModelInvoiceLine(null));
            invoiceFrame.setArrInvoiceLine(null);
            invoiceFrame.getInvNm().setText("");
            invoiceFrame.getInvNm().setText("");
            invoiceFrame.getInvTL().setText("");
            invoiceFrame.getInvDt().setText("");
        }
    }
    

    private void CreateInvoiceItems() {
        dialogline = new dialogLine(invoiceFrame);
        dialogline.setVisible(true);
        
    }

    private void Cancel() {
        
        if (invoiceFrame.getLineTBL().getSelectedRow() != -1) {
            invoiceFrame.getArrInvoiceLine().remove(invoiceFrame.getLineTBL().getSelectedRow());
            tableModelInvoiceLine lineModel = (tableModelInvoiceLine) invoiceFrame.getLineTBL().getModel();
            lineModel.fireTableDataChanged();
            invoiceFrame.getInvTL().setText(""+invoiceFrame.getArrInvoiceHeader().get(invoiceFrame.getHeaderTBL().getSelectedRow()).getInvoiceTotalPrice());
            invoiceFrame.getTableModelInvoice().fireTableDataChanged();
            invoiceFrame.getHeaderTBL().setRowSelectionInterval(invoiceFrame.getHeaderTBL().getSelectedRow(), invoiceFrame.getHeaderTBL().getSelectedRow());
    }
 
    }

    private void ok() {
        dialogheader.setVisible(false);
        String customerName = dialogheader.getCustomerNameF().getText();
        String date = dialogheader.getDateF().getText();
        Date datee = new Date();
        try {
            datee=invoiceFrame.dateformat.parse(date);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(invoiceFrame, "error date","invalid",JOptionPane.ERROR_MESSAGE);   
        }
        int Number = 0;
        for (invoiceHeader invH : invoiceFrame.getArrInvoiceHeader()) {
            if (invH.getNumber() > Number) {
                Number = invH.getNumber();
            }
        }
        Number++;
        invoiceHeader InvoiceHeader= new invoiceHeader(Number, customerName, datee);
        invoiceFrame.getArrInvoiceHeader().add(InvoiceHeader);
        invoiceFrame.getTableModelInvoice().fireTableDataChanged();
      
        dialogheader.dispose();
        dialogheader=null;
    }

    private void cancelinvoice() {
        dialogheader.setVisible(false);
        dialogheader.dispose();
        dialogheader = null;
    }

    private void okLine() {
        dialogline.setVisible(false);
        
        String nameitem = dialogline.getItemNameF().getText();
        String countitem = dialogline.getItemCountF().getText();
        String priceitem = dialogline.getItemPriceF().getText();
        int c = 1;
        double Price = 1;
        try {
            c = Integer.parseInt(countitem);
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(invoiceFrame, "error", "Invalid", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            Price = Double.parseDouble(priceitem);
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(invoiceFrame, "error", "Invalid", JOptionPane.ERROR_MESSAGE);
        }
        int selectedHeader = invoiceFrame.getHeaderTBL().getSelectedRow();
        if (selectedHeader != -1) {
            invoiceHeader Header = invoiceFrame.getArrInvoiceHeader().get(selectedHeader);
            invoiceLine line = new invoiceLine(nameitem, Price, c, Header);
            //invHeader.getLines().add(line);
            invoiceFrame.getArrInvoiceLine().add(line);
            tableModelInvoiceLine lineTableModel = (tableModelInvoiceLine) invoiceFrame.getLineTBL().getModel();
            lineTableModel.fireTableDataChanged();
            invoiceFrame.getTableModelInvoice().fireTableDataChanged();
        }
        invoiceFrame.getHeaderTBL().setRowSelectionInterval(selectedHeader, selectedHeader);
        dialogline.dispose();
        dialogline = null;
    }

    private void cancelinvoiceline() {
        dialogline.setVisible(false);
        dialogline.dispose();
        dialogline = null;
    }
    
}
