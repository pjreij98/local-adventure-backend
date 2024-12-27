package com.local_adventure_backend.controllers;

import com.local_adventure_backend.models.Location;
import com.local_adventure_backend.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    @Autowired
    private LocationRepository locationRepository;

    @GetMapping
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @GetMapping("/category")
    public List<Location> getByCategory(@RequestParam String category) {
        return locationRepository.findByCategory(category);
    }

    @PostMapping
    public Location addLocation(@RequestBody Location location) {
        return locationRepository.save(location);
    }
}
