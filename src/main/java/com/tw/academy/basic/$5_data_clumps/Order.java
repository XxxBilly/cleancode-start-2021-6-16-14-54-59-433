package com.tw.academy.basic.$5_data_clumps;

public class Order {

  private int orderNumber;

  private final String buyerName;
  private final String buyerPhoneNumber;
  private final String buyerAddress;

  public Order(int orderNumber, User user) {
    this.orderNumber = orderNumber;

    this.buyerName = user.getBuyerName();
    this.buyerPhoneNumber = user.getBuyerPhoneNumber();
    this.buyerAddress = user.getBuyerAddress();
  }

  public String confirm() {
    return String.format("Please confirm buyer information: buyer name is %s, " +
        "buyer phone number is %s and buyer address is %s.", buyerName, buyerPhoneNumber, buyerAddress);
  }
}

