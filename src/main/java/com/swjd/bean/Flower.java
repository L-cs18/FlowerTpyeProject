package com.swjd.bean;

public class Flower {
    private int flowered;
    private int typename;
    private String flowerName;
    private String manager;
    private String instore;
    private String price;

    public Flower() {
    }

    public Flower(int typename, String flowerName, String manager, String instore, String price) {
        this.typename = typename;
        this.flowerName = flowerName;
        this.manager = manager;
        this.instore = instore;
        this.price = price;
    }

    public int getFlowered() {
        return flowered;
    }

    public void setFlowered(int flowered) {
        this.flowered = flowered;
    }

    public int getTypename() {
        return typename;
    }

    public void setTypename(int typename) {
        this.typename = typename;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getInstore() {
        return instore;
    }

    public void setInstore(String instore) {
        this.instore = instore;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowered=" + flowered +
                ", typename=" + typename +
                ", flowerName='" + flowerName + '\'' +
                ", manager='" + manager + '\'' +
                ", instore='" + instore + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
