package com.qualco.nation.repositories;

import com.qualco.nation.models.entities.Regions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository  extends JpaRepository<Regions , Long> {
}
