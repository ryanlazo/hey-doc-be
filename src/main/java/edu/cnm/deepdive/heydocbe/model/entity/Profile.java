package edu.cnm.deepdive.heydocbe.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;


@Entity
public class Profile {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @JsonIgnore
  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "practitioner_id")
  Practitioner practitioner;

  private String imageRef;

  @Column(columnDefinition="text")
  @Lob
  private String bio;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getImageRef() {
    return imageRef;
  }

  public void setImageRef(String imageRef) {
    this.imageRef = imageRef;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public Practitioner getPractitioner() {
    return practitioner;
  }

  public void setPractitioner(Practitioner practitioner) {
    this.practitioner = practitioner;
  }
}
