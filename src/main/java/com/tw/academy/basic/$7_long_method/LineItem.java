package com.tw.academy.basic.$7_long_method;

public class LineItem {

    public static final double SALE_TAX = .10;
    private String description;
	private double price;
	private int quantity;

	public LineItem(String description, double p, int quantity) {
		super();
		this.description = description;
		this.price = p;
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

    double totalAmount() {
        return price * quantity;
    }

    double calculateSalesTax() {
        return totalAmount() * SALE_TAX;
    }
}