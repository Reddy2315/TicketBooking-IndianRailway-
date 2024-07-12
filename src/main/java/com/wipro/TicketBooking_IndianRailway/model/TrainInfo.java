package com.wipro.TicketBooking_IndianRailway.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "trainInfo")
public class TrainInfo {
    @Id
    private int trainNumber;
    private String trainName;
    private String source;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String status;
    private String fare;
    private String duration;
    private String classType;
    private String distance;
}
