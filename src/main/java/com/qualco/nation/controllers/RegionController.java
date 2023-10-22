package com.qualco.nation.controllers;

import com.qualco.nation.models.dto.RegionsDto;
import com.qualco.nation.services.RegionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/regions")
public class RegionController {


    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }
    @GetMapping
    public ResponseEntity<List<RegionsDto>> getCountries(

    ) {
        return ResponseEntity.ok(regionService.getRegions());

    }
}
