package com.example.hotel.Services;

import com.example.hotel.Entity.AddHotelImg;
import com.example.hotel.Repository.AddHotelImgRepo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class AddHotelImgSer {

    @Value("${upload.dir}")
    private String uploadDir;

    private final AddHotelImgRepo addHotelImgRepo;

    public AddHotelImgSer(AddHotelImgRepo addHotelImgRepo) {
        this.addHotelImgRepo = addHotelImgRepo;
    }

    public ResponseEntity<String> addImgToHotel(AddHotelImg addHotelImg, byte[] fileBytes) {
        try {
            // Ensure the directory exists
            File directory = new File(uploadDir);
            if (!directory.exists()) {
                directory.mkdirs();
            }

            Path path = Paths.get(uploadDir + addHotelImg.getFileName());
            Files.write(path, fileBytes);

            // Save file info to database
            addHotelImg.setFilePath(path.toString());
            addHotelImgRepo.save(addHotelImg);

            return ResponseEntity.ok().body("Add hotel image successfully");
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Failed to upload file");
        }
    }
}
