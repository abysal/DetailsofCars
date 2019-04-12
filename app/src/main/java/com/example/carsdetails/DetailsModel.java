package com.example.carsdetails;
public class DetailsModel {
    private String make2, year2, color2, price2, engine2;

    public DetailsModel(String make, String year, String color, String price, String engine) {
        this.make2 = make;
        this.year2 = year;
        this.color2 = color;
        this.price2 = price;
        this.engine2 = engine;
    }
    public String getMake2() {
        return make2;
    }
    public void setMake2(String make2) {
        this.make2 = make2;
    }
    public String getYear2() {
        return year2;
    }
    public void setYear2(String year2) {
        this.year2 = year2;
    }
    public String getColor2() {
        return color2;
    }
    public void setColor2(String color2) {
        this.color2 = color2;
    }
    public String getPrice2() {
        return price2;
    }
    public void setPrice2(String price2) {
        this.price2 = price2;
    }
    public String getEngine2() {
        return engine2;
    }
    public void setEngine2(String engine2) {
        this.engine2 = engine2;
    }
    @Override
    public String toString() {
        return  "\r\n Make=" + make2 +
                "\r\n year2=" + year2 +
                "\r\n color2=" + color2 +
                "\r\n price2=" + price2 +
                "\r\n engine2=" + engine2;
    }
}
