package com.example.hotel.Controller;

import com.example.hotel.Entity.AddHotelImg;
import com.example.hotel.Services.AddHotelImgSer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/auth")
public class AddHotelImgCon {

    private final AddHotelImgSer addHotelImgSer;

    public AddHotelImgCon(AddHotelImgSer addHotelImgSer) {
        this.addHotelImgSer = addHotelImgSer;
    }

    @PostMapping("/uploadImage")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        try {
            String originalFilename = file.getOriginalFilename();
            byte[] bytes = file.getBytes();

            AddHotelImg addHotelImg = new AddHotelImg();
            addHotelImg.setFileName(originalFilename);

            return addHotelImgSer.addImgToHotel(addHotelImg, bytes);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Failed to upload file");
        }
    }
}
