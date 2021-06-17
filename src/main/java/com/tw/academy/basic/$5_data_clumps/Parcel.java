package com.tw.academy.basic.$5_data_clumps;

public class Parcel {

  private final User receiver;
  private String size;
  private Double weight;

  private String senderName;
  private String senderPhoneNumber;
  private String senderAddress;

  public Parcel(String size, Double weight,
      User receiver, String senderName, String senderPhoneNumber, String senderAddress) {
    this.size = size;
    this.weight = weight;
    this.receiver = receiver;
    this.senderName = senderName;
    this.senderPhoneNumber = senderPhoneNumber;
    this.senderAddress = senderAddress;
  }

  public String confirmReceiver() {
    return String.format("Please confirm receiver information: receiver name is %s, " +
            "receiver phone number is %s and receiver address is %s.\n",
        this.receiver.getName(), this.receiver.getPhoneNUmber(), this.receiver.getAddress());
  }

  public String confirmSender() {
    return String.format("Please confirm sender information: sender name is %s, " +
            "sender phone number is %s and sender address is %s.\n",
        senderName, senderPhoneNumber, senderAddress);
  }
}
