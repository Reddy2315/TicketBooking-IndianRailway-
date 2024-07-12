package com.wipro.TicketBooking_IndianRailway.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name = "passengerInfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassengerInfo {

    @Id
    private int id;
    private String name;
    private String email;
    private String password;
    private String gender;
    private int age;
    private String phoneNumber;
    private String address;
    private String pnrNumber;

}
