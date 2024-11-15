package com.hotel.hotelreservation.Repository;

import com.hotel.hotelreservation.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {
    Optional<Room> getRoomByRoomNumber(Long roomNumber);
    List<Room> findByHotelId(Long hotelId);
}
