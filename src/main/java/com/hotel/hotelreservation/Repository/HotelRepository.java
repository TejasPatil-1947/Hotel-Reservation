package com.hotel.hotelreservation.Repository;

import com.hotel.hotelreservation.Entity.Hotel;
import com.hotel.hotelreservation.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

        Optional<Hotel> getHotelByCity(String city);

    List<Hotel> getHotelsByCity(String name);
}
