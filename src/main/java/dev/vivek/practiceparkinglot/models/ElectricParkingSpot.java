package dev.vivek.practiceparkinglot.models;

public class ElectricParkingSpot extends ParkingSpot{
    private EletricCharager eletricCharager;

    public ElectricParkingSpot(EletricCharager eletricCharager) {
        this.eletricCharager = eletricCharager;
    }
}
