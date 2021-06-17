package com.tw.academy.basic.$7_long_method;

import java.util.List;

public class Order {

    String customerName;
    String address;
    List<LineItem> lineItems;

    public Order(String customerName, String address, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.address = address;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return address;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public double calculateTotalTax() {
        return getLineItems().stream().mapToDouble(LineItem::calculateSalesTax).sum();
    }

    public double calculateLineItemTotalAmount() {
        return getLineItems().stream().mapToDouble(LineItem::totalAmount).sum();
    }

    public double calculateTotal() {
        return calculateTotalTax() + calculateLineItemTotalAmount();
    }
}
