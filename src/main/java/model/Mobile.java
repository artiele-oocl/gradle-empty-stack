package model;

abstract class Mobile {

    private String name;
    private String color;
    private String brand;
    private String input;

    public void call(String input) {
        System.out.println("Message : "+input);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
