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
        print(output, HEADER_INFO);
        printCustomerInfo(output);
        printOrderDetails(output);
        return output.toString();
    }

    private void printCustomerInfo(StringBuilder output) {
        print(output, order.getCustomerName());
        print(output, order.getCustomerAddress());
    }

    private void printOrderDetails(StringBuilder output) {
        for (LineItem lineItem : order.getLineItems()) {
            printLieItem(output, lineItem);
            output.append('\n');
        }
        print(output, SALES_TAX, order.calculateTotalTax());
        print(output, TOTAL_AMOUNT, order.calculateTotal());
    }

    private void printLieItem(StringBuilder output, LineItem lineItem) {
        print(output, lineItem.getDescription());
        print(output, lineItem.getPrice());
        print(output, lineItem.getQuantity());
        print(output, lineItem.totalAmount());
    }

    private void print(StringBuilder output, String description) {
        output.append(description);
    }

    private void print(StringBuilder output, String name, double value) {
        output.append(name).append(RECEIPT_FORMAT).append(value);
    }

    private void print(StringBuilder output, double value) {
        output.append(RECEIPT_FORMAT).append(value);
    }

    private void print(StringBuilder output, int value) {
        output.append(RECEIPT_FORMAT).append(value);
    }
}