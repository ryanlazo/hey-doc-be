package edu.cnm.deepdive.heydocbe.controllers;

import edu.cnm.deepdive.heydocbe.model.dao.ProfileRepository;
import edu.cnm.deepdive.heydocbe.model.entity.Practitioner;
import edu.cnm.deepdive.heydocbe.model.entity.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfilesController {

  private ProfileRepository profileRepository;

  @Autowired
  public ProfilesController(ProfileRepository profileRepository) {
    this.profileRepository = profileRepository;
  }

  @RequestMapping("/profiles")
  public Iterable<Profile> profileList() {
    return profileRepository.findAll();
  }

  @RequestMapping("/profiles/find")
  public Profile profileById(@RequestParam long practitionerId) {
    return profileRepository.findProfileByPractitionerId(practitionerId);
  }
}