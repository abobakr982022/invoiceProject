/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.invoice.controller;

import com.invoice.model.Header;
import com.invoice.model.Line;
import com.invoice.model.tableModelInvoiceLine;
import com.invoice.view.InvoiceFrame;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author aboba
 */
public class selListener implements ListSelectionListener{
    private InvoiceFrame selInvoiceFrame;

    public selListener(InvoiceFrame selInvoiceFrame) {
        this.selInvoiceFrame = selInvoiceFrame;
    }
    
    

    @Override
    public void valueChanged(ListSelectionEvent e) {
        
//        int sLI = selInvoiceFrame.getHeaderTBL().getSelectedRow();
        
        System.out.println("selected"+selInvoiceFrame.getHeaderTBL().getSelectedRow());
        if(selInvoiceFrame.getHeaderTBL().getSelectedRow()!=-1){
        Header selInvoice = selInvoiceFrame.getArrInvoiceHeader().get(selInvoiceFrame.getHeaderTBL().getSelectedRow());
        ArrayList<Line> lineee = selInvoiceFrame.getArrInvoiceHeader().get(selInvoiceFrame.getHeaderTBL().getSelectedRow()).getInvoiceLines();
        tableModelInvoiceLine modelLine = new tableModelInvoiceLine(lineee);
        selInvoiceFrame.setArrInvoiceLine(lineee);
        selInvoiceFrame.getLineTBL().setModel(modelLine);
        selInvoiceFrame.getInvNo().setText(""+selInvoice.getNumber());
        selInvoiceFrame.getInvDt().setText(""+selInvoice.getInvoiceDate());
        selInvoiceFrame.getInvNm().setText(selInvoice.getCustomerName());
        selInvoiceFrame.getInvTL().setText(""+selInvoice.getInvoiceTotalPrice());
        }

    }
    
}
