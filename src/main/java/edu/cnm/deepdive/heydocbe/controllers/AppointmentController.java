package edu.cnm.deepdive.heydocbe.controllers;

import edu.cnm.deepdive.heydocbe.model.dao.AppointmentRepository;
import edu.cnm.deepdive.heydocbe.model.entity.Appointment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

  private AppointmentRepository appointmentRepository;

  public AppointmentController(AppointmentRepository appointmentRepository) {
    this.appointmentRepository = appointmentRepository;
  }

  @GetMapping
  public Iterable<Appointment> appointmentList() {
    return appointmentRepository.findAll();
  }
}
