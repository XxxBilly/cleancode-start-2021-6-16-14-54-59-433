package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author Thoughtworks
 * @version 1.0
 * @since 2018-1-1
 */
public class OrderReceipt {

    public static final String HEADER_INFO = "======Printing Orders======\n";
    public static final String SALES_TAX = "Sales Tax";
    public static final String TOTAL_AMOUNT = "Total Amount";
    private static final String RECEIPT_FORMAT = "\t";
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        output.append(HEADER_INFO);
        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());

        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append(RECEIPT_FORMAT);
            output.append(lineItem.getPrice());
            output.append(RECEIPT_FORMAT);
            output.append(lineItem.getQuantity());
            output.append(RECEIPT_FORMAT);
            output.append(lineItem.totalAmount());
            output.append('\n');
        }

        output.append(SALES_TAX).append(RECEIPT_FORMAT).append(order.calculateTotalTax());
        output.append(TOTAL_AMOUNT).append(RECEIPT_FORMAT).append(order.calculateTotal());
        return output.toString();
    }

}