/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.invoice.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aboba
 */
public class tableModelInvoiceLine extends AbstractTableModel {
        private ArrayList<invoiceLine> arrInvoiceLine;

    public tableModelInvoiceLine(ArrayList<invoiceLine> arrInvoiceLine) {
        this.arrInvoiceLine = arrInvoiceLine;
    }
        
        


    @Override
    public int getRowCount() {
        return arrInvoiceLine == null ? 0 :  arrInvoiceLine.size();
    }

    @Override
    public int getColumnCount() {
        return  4;
    }

    @Override
    public String getColumnName(int c) {
         switch(c){
            case 0: return "No.";
            case 1: return "Item Name";
            case 2: return "Item Price";
            case 3: return "Count";
            case 4: return "Item Total";
        
        }
        return "";
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
          invoiceLine invLine = arrInvoiceLine.get(rowIndex);
        switch (columnIndex){
            case 0:return  invLine.getNumber().getNumber();
            case 1:return  invLine.getNameItems();
            case 2:return  invLine.getPriceItems();
            case 3:return  invLine.getCount();
            case 4:return  invLine.getTotalLine();
        
        }
        
        return "";
    }

    public ArrayList<invoiceLine> getArrInvoiceLine() {
        return arrInvoiceLine;
    }

    public void setArrInvoiceLine(ArrayList<invoiceLine> arrInvoiceLine) {
        this.arrInvoiceLine = arrInvoiceLine;
    }
    
}