package edu.cnm.deepdive.heydocbe.model.dao;

import edu.cnm.deepdive.heydocbe.model.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

}
