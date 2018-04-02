package edu.cnm.deepdive.heydocbe.controllers;

import edu.cnm.deepdive.heydocbe.model.dao.PractitionerRepository;
import edu.cnm.deepdive.heydocbe.model.entity.Practitioner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PractitionerController {

  private PractitionerRepository practitionerRepository;

  @Autowired
  public PractitionerController(PractitionerRepository practitionerRepository) {
    this.practitionerRepository = practitionerRepository;
  }

  @RequestMapping("/practitioners")
  public Iterable<Practitioner> practitionerList() {
    return practitionerRepository.findAll();
  }

  @RequestMapping("/practitioners/find")
  public Iterable<Practitioner> practitionersBySpecialtyId(@RequestParam long specialtyId) {
    return practitionerRepository.findPractitionersBySpecialtyId(specialtyId);
  }

  @RequestMapping("/practitioners/find/id")
  public Practitioner practitionerById(@RequestParam long practitionerId) {
    return practitionerRepository.findById(practitionerId);
  }
}
