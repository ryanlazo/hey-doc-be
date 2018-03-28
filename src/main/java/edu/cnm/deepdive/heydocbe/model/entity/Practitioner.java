package edu.cnm.deepdive.heydocbe.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Practitioner {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String lastName;

  private String firstName;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "specialty_id")
  private Specialty specialty;

  @OneToOne(mappedBy = "practitioner", fetch = FetchType.LAZY)
  private Profile profile = new Profile();

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Specialty getSpecialty() {
    return specialty;
  }

  public void setSpecialty(Specialty specialty) {
    this.specialty = specialty;
  }

  public Profile getProfile() {
    return profile;
  }
}
