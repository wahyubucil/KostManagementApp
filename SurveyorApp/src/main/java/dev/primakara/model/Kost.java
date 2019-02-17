package dev.primakara.model;

public class Kost {
    private String name;
    private String address;
    private int rooms;
    private int price;
    private String electricityCost;
    private String waterCost;
    private String description;
    private String ownerName;
    private String ownerPhoneNumber;

    public Kost() {
    }

    public Kost(String name, String address, int rooms, int price, String electricityCost, String waterCost, String description, String ownerName, String ownerPhoneNumber) {
        this.name = name;
        this.address = address;
        this.rooms = rooms;
        this.price = price;
        this.electricityCost = electricityCost;
        this.waterCost = waterCost;
        this.description = description;
        this.ownerName = ownerName;
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getElectricityCost() {
        return electricityCost;
    }

    public void setElectricityCost(String electricityCost) {
        this.electricityCost = electricityCost;
    }

    public String getWaterCost() {
        return waterCost;
    }

    public void setWaterCost(String waterCost) {
        this.waterCost = waterCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }
}