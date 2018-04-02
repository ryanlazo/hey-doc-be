package edu.cnm.deepdive.heydocbe.model.dao;

import edu.cnm.deepdive.heydocbe.model.entity.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {

  public Profile findProfileByPractitionerId(long practitionerId);
}
