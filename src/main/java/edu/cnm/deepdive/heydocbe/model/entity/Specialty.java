package edu.cnm.deepdive.heydocbe.model.entity;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;


@Entity
public class Specialty {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(length = 20)
  private String field;

  @OneToMany(mappedBy = "specialty", fetch = FetchType.LAZY)
  @OrderBy("last_name ASC, first_name ASC")
  private List<Practitioner> practitioners = new LinkedList<>();

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public List<Practitioner> getPractitioners() {
    return practitioners;
  }
}
