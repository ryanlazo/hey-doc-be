package edu.cnm.deepdive.heydocbe.model.entity;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String firstName;

  private String lastName;

  private String googleEmail;

  @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
  @OrderBy("date_time ASC")
  private List<Appointment> appointments = new LinkedList<>();

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getGoogleEmail() {
    return googleEmail;
  }

  public void setGoogleEmail(String googleEmail) {
    this.googleEmail = googleEmail;
  }

  public List<Appointment> getAppointments() {
    return appointments;
  }
}
