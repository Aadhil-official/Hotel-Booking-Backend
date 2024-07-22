package com.example.hotel.Services;

import com.example.hotel.Entity.AddHotel;
import com.example.hotel.Repository.AddHotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddHotelSer {

    private final AddHotelRepo addHotelRepo;


    public AddHotelSer(AddHotelRepo addHotelRepo) {
        this.addHotelRepo = addHotelRepo;
    }

    public AddHotel addNewHotel(AddHotel addHotel){
        return addHotelRepo.save(addHotel);
    }

}
