package com.local_adventure_backend.repositories;

import com.local_adventure_backend.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Long> {
    List<Location> findByCategory(String category);
}
