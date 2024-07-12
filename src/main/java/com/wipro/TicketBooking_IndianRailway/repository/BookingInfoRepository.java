package com.wipro.TicketBooking_IndianRailway.repository;

import com.wipro.TicketBooking_IndianRailway.model.BookingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingInfoRepository extends JpaRepository<BookingInfo, Integer> {
}
