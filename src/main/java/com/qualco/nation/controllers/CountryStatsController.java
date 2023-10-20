package com.qualco.nation.controllers;


import com.qualco.nation.models.dto.CountryStatsViewDto;
import com.qualco.nation.services.CountryStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stats")
public class CountryStatsController {

    private final CountryStatsService  countryStatsService;

    @Autowired
    public CountryStatsController(CountryStatsService countryStatsService) {
        this.countryStatsService = countryStatsService;
    }

    @GetMapping()
    public ResponseEntity<Page<CountryStatsViewDto>> getFilteredCountryStats(
            @RequestParam(name = "regionId", required = false) Long regionId,
            @RequestParam(name = "startDate", required = false) Integer startDate,
            @RequestParam(name = "endDate", required = false) Integer endDate,
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size) {

        Pageable pageable = PageRequest.of(page, size);

        Page<CountryStatsViewDto> filteredCountryStats = countryStatsService.getFilteredCountryStats(regionId, startDate, endDate, pageable);

        return ResponseEntity.ok(filteredCountryStats);
    }
}
