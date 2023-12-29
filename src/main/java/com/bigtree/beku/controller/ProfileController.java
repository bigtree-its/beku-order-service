package com.bigtree.beku.controller;


import com.bigtree.beku.model.ProfileRequest;
import com.bigtree.beku.model.ProfileResponse;
import com.bigtree.beku.service.ProfileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/profiles")
@CrossOrigin(origins = "*")
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @PostMapping("")
    public ResponseEntity<ProfileResponse> getOrderProfile(@RequestBody ProfileRequest profileRequest) {
        log.info("Request to get profile for {} = {}", profileRequest.getProfileType(), profileRequest.getProfileId());
        final ProfileResponse response = profileService.getProfile(profileRequest);
        log.info("Returning profile respose {} for {} = {}", response, profileRequest.getProfileType(), profileRequest.getProfileId());
        return ResponseEntity.ok(response);
    }
}
