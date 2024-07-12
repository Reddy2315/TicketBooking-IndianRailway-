package com.wipro.TicketBooking_IndianRailway.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bookingInfo")
public class BookingInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;

    @ManyToOne
    @JoinColumn(name = "trainNumber", referencedColumnName = "trainNumber")
    private TrainInfo trainInfo;

    @ManyToOne
    @JoinColumn(name = "passengerId", referencedColumnName = "id")
    private PassengerInfo passengerInfo;
}
