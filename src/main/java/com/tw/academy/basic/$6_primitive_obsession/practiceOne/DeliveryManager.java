package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {

  private final Address to;
  private final Address from;

  public DeliveryManager(Address from, Address to) {
    this.to = to;
    this.from = from;
  }

  public DeliverCenter allocate() {
    if (isSameProvince(getToAddress(), getFromAddress())) {
      return DeliverCenter.LOCAL;
    }
    if (isSameCity(getToAddress(), getFromAddress())) {
      return DeliverCenter.PROVINCE;
    }
    return DeliverCenter.FOREIGN;
  }

  private boolean isSameCity(String toAddress, String fromAddress) {
    return to.getProvince(toAddress).equals(from.getProvince(fromAddress));
  }

  private boolean isSameProvince(String toAddress, String fromAddress) {
    return isSameCity(toAddress, fromAddress) && to.getCity(toAddress).equals(from.getCity(fromAddress));
  }

  public String getToAddress() {
    return to.getAddress();
  }

  public String getFromAddress() {
    return from.getAddress();
  }
}
