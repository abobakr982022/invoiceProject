/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.invoice.model;
 
/**
 *
 * @author aboba
 */ 
public class invoiceLine {
    
    private String nameItems;
    private double priceItems;
    private int count;
    private invoiceHeader number;

    public invoiceLine(String nameItems, double priceItems, int count, invoiceHeader number) {
        this.nameItems = nameItems;
        this.priceItems = priceItems;
        this.count = count;
        this.number = number;
    }

    public invoiceLine() {
    }
    
    
     

  

   

    

//    public invoiceLine(String arr4, double price, int count, invoiceHeader invheader) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    

    public invoiceHeader getNumber() {
        return number;
    }

    public void setNumber(invoiceHeader number) {
        this.number = number;
    }

    public String getNameItems() {
        return nameItems;
    }

    public void setNameItems(String nameItems) {
        this.nameItems = nameItems;
    }

    public double getPriceItems() {
        return priceItems;
    }

    public void setPriceItems(double priceItems) {
        this.priceItems = priceItems;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
     public double getTotalLine(){
         return count*priceItems; 
     }
     

    @Override
    public String toString() {
        return "invoiceLine{" + "number=" + number + ", nameItems=" + nameItems + ", priceItems=" + priceItems + ", count=" + count + '}';
    }
    
    

   
    
}
