package org.person.pojo;

import java.io.Serializable;

public class Shop implements Serializable {

    /*** 店铺编号***/
    private String snum;

    /*****店铺名字**/
    public String shopname;

    public String getSnum() {
        return snum;
    }

    public void setSnum(String snum) {
        this.snum = snum;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "snum='" + snum + '\'' +
                ", shopname='" + shopname + '\'' +
                '}';
    }
}