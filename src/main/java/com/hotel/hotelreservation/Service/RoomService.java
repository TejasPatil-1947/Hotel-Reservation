package com.hotel.hotelreservation.Service;

import com.hotel.hotelreservation.Entity.Room;
import com.hotel.hotelreservation.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Optional<Room> getRoomById(Long id) {
        return roomRepository.findById(id);
    }

    public Optional<Room> getRoomByRoomNumber(Long roomNumber) {
        return roomRepository.getRoomByRoomNumber(roomNumber);
    }

    public List<Room> getRoomsByHotelId(Long hotelId) {
        return roomRepository.findByHotelId(hotelId);
    }

    public void saveOrUpdateRoom(Room room) {

        roomRepository.saveAndFlush(room);
    }

    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }

}
