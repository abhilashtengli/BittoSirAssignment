package com.example.usermangment.model;

public class UserModel {
    private int UserId;
    private String Name;
    private String UserName;
    private String Address;
    private String phnNum;
    
    public UserModel(int userId, String name, String userName, String address, String phnNum) {
        UserId = userId;
        Name = name;
        UserName = userName;
        Address = address;
        this.phnNum = phnNum;
    }

    
    public int getUserId() {
        return UserId;
    }
    public void setUserId(int userId) {
        UserId = userId;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getPhnNum() {
        return phnNum;
    }
    public void setPhnNum(String phnNum) {
        this.phnNum = phnNum;
    }


    @Override
    public String toString() {
        return "UserModel [UserId=" + UserId + ", Name=" + Name + ", UserName=" + UserName + ", Address=" + Address
                + ", phnNum=" + phnNum + "]";
    }
    
}
