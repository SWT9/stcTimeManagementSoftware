package swt.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String userID; 

  private String forname;

  private String name;

  private String email;

  private String password; 
  
  private Integer supervisorGroupId;

  private Integer supervisorId;

  private Integer hrId;

  private Integer remainingFlexHours;

  private Integer remainingVacationDays; 

  //private String vacationDays; // "12.11.22;21.12.22"

  //private String sickDays; // "31.12.22;05.06.22"

  //private String workHours; // "02.04.22:5,17;" //Dates:Start,End;  



  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }

  public String getForname() {
    return forname;
  }

  public void setForname(String forname) {
    this.forname = forname;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getSupervisorGroupId() {
    return supervisorGroupId;
  }

  public void setSupervisorGroupId(Integer supervisorGroupId) {
    this.supervisorGroupId = supervisorGroupId;
  }

  public Integer getSupervisorId() {
    return supervisorId;
  }

  public void setSupervisorId(Integer supervisorId) {
    this.supervisorId = supervisorId;
  }

  public Integer getHrId() {
    return hrId;
  }

  public void setHrId(Integer hrId) {
    this.hrId = hrId;
  }

  public Integer getRemainingFlexHours() {
    return remainingFlexHours;
  }

  public void setRemainingFlexHours(Integer remainingFlexHours){
    this.remainingFlexHours = remainingFlexHours;
  }

  public Integer getRemainingVacationDays() {
    return remainingVacationDays;
  }

  public void setRemainingVacationDays(Integer remainingVacation) {
    this.remainingVacationDays = remainingVacation;
  }
}