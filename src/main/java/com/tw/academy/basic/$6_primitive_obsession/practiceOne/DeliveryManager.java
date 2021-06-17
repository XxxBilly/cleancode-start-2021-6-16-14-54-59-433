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
    return getProvince(toAddress).equals(getProvince(fromAddress));
  }

  private boolean isSameProvince(String toAddress, String fromAddress) {
    return isSameCity(toAddress, fromAddress) && getCity(toAddress).equals(getCity(fromAddress));
  }

  private String getCity(String address) {
    return address.substring(address.indexOf("省") + 1, address.indexOf("市"));
  }

  private String getProvince(String address) {
    return address.substring(0, address.indexOf("省"));
  }

  public String getToAddress() {
    return to.getAddress();
  }

  public String getFromAddress() {
    return from.getAddress();
  }
}
