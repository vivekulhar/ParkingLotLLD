package dev.vivek.practiceparkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Ticket extends BaseModel{
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Operator generatedBy;
    private ParkingLot parkingLot;
    private EntryGate entryGate;
    private String ownerName;
}
