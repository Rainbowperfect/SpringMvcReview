package org.person.pojo;

public class ItemCat implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -4879620645999387029L;

    /** 类目ID */
    private Long id;

    /** 类目名称 */
    private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "ItemCat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}