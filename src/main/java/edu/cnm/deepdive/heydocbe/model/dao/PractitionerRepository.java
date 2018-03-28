package edu.cnm.deepdive.heydocbe.model.dao;

import edu.cnm.deepdive.heydocbe.model.entity.Practitioner;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PractitionerRepository extends CrudRepository<Practitioner, Long> {

 public List<Practitioner> findPractitionersBySpecialtyId(long specialtyId);
}
