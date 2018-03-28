package edu.cnm.deepdive.heydocbe.model.dao;

import edu.cnm.deepdive.heydocbe.model.entity.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

}
