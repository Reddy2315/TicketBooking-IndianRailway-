package com.wipro.TicketBooking_IndianRailway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainInfoDto {
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
