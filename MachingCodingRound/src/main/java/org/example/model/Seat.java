package org.example.model;

public class Seat {
    private String id;
    private String type;
    private Double price;
    private Boolean isEmpty;

    public Seat(String id, String type, Double price) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.isEmpty = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getEmpty() {
        return isEmpty;
    }

    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", isEmpty=" + isEmpty +
                '}';
    }
}
