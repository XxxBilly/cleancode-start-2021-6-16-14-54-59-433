package com.tw.academy.basic.$5_data_clumps;

public class User {

  private final String name;
  private final String phoneNUmber;
  private final String address;

  public User(String name, String phoneNUmber, String address) {
    this.name = name;
    this.phoneNUmber = phoneNUmber;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public String getPhoneNUmber() {
    return phoneNUmber;
  }

  public String getAddress() {
    return address;
  }
}
