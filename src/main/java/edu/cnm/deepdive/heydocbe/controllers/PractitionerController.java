package edu.cnm.deepdive.heydocbe.controllers;

import edu.cnm.deepdive.heydocbe.model.dao.PractitionerRepository;
import edu.cnm.deepdive.heydocbe.model.entity.Practitioner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practitioners")
public class PractitionerController {

  private PractitionerRepository practitionerRepository;

  @Autowired
  public PractitionerController(PractitionerRepository practitionerRepository) {
    this.practitionerRepository = practitionerRepository;
  }

  @GetMapping
  public Iterable<Practitioner> practitionerList() {
    return practitionerRepository.findAll();
  }
}
