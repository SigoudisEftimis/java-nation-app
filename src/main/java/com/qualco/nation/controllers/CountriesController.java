package com.qualco.nation.controllers;
import com.qualco.nation.models.dto.CountryStatsViewDto;
import com.qualco.nation.models.views.interfaces.CountryGdpPopulationRatioView;
import com.qualco.nation.models.views.interfaces.CountryView;
import com.qualco.nation.models.views.interfaces.LanguageView;
import com.qualco.nation.services.CountriesService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountriesController {
    private final CountriesService countriesService;

    public CountriesController(CountriesService countriesService) {
        this.countriesService = countriesService;
    }

    @GetMapping
    public ResponseEntity<Page<CountryView>> getCountries(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "name") String sort
    ) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sort));
        return ResponseEntity.ok(countriesService.getCountries(pageable));

    }

    @GetMapping("/{id}/languages")
    public ResponseEntity<List<LanguageView>> getCountryLanguages(
           @PathVariable int id
    ) {
        return ResponseEntity.ok(countriesService.getLanguagesForCountry(id));

    }

    @GetMapping("/max-gdp-per-population")
    public ResponseEntity<Page<CountryGdpPopulationRatioView>> getCountriesMaxGdpPerPopulationRatio(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Page<CountryGdpPopulationRatioView> countries = countriesService.getCountriesMaxGdpPerPopulationRatio(
                PageRequest.of(page, size)
        );
        return ResponseEntity.ok(countries);
    }

    @GetMapping("/stats")
    public ResponseEntity<Page<CountryStatsViewDto>> getFilteredCountryStats(
            @RequestParam(name = "regionId", required = false) Long regionId,
            @RequestParam(name = "startDate", required = false) Integer startDate,
            @RequestParam(name = "endDate", required = false) Integer endDate,
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size) {

        Pageable pageable = PageRequest.of(page, size);

        Page<CountryStatsViewDto> filteredCountryStats = countriesService.getFilteredCountryStats(regionId, startDate, endDate, pageable);

        return ResponseEntity.ok(filteredCountryStats);
    }


}
