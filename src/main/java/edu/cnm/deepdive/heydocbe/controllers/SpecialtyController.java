package edu.cnm.deepdive.heydocbe.controllers;

import edu.cnm.deepdive.heydocbe.model.dao.SpecialityRepository;
import edu.cnm.deepdive.heydocbe.model.entity.Specialty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/specialties")
public class SpecialtyController {

  private SpecialityRepository specialityRepository;

  @Autowired
  public SpecialtyController(SpecialityRepository specialityRepository) {
    this.specialityRepository = specialityRepository;
  }

  @GetMapping
  public Iterable<Specialty> specialtyList() {
    return specialityRepository.findAll();
  }
}
