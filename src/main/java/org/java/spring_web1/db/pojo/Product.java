package org.java.spring_web1.db.pojo;

public class Product {

    private String name;
    private int price;
    private int vat;

    public Product(String name, int price, int vat) {

        setName(name);
        setPrice(price);
        setVat(vat);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {

        return "Product [name=" + name + ", price=" + price + ", vat=" + vat + "]";
    }
}
