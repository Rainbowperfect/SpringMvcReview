package org.person.pojo;

import java.util.List;

public class Item implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3564151450316077366L;
    /** 商品id，同时也是商品编号 */
    private Long id;
    /** 商品标题 */
    private String title;
    /** 商品价格，单位为：分 */
    private Long price;

    /** 所属类目，叶子类目 */
    private ItemCat itemCat;

    /**
    *店铺集合
    * */
    private List<Shop> shops;

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
    public ItemCat getItemCat() {
        return itemCat;
    }
    public void setItemCat(ItemCat itemCat) {
        this.itemCat = itemCat;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", itemCat=" + itemCat +
                ", shops=" + shops +
                '}';
    }
}