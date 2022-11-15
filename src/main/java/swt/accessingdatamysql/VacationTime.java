package swt.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity // This tells Hibernate to make a table out of this class
public class VacationTime {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  
  //@ManyToOne(targetEntity = swt.accessingdatamysql.User.class) //necessary 
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private Integer userId;    //==User

  private String startPeriod;

  private String endPeriod;

  private int remainingVacationDays;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getStartPeriod() {
    return startPeriod;
  }

  public void setStartPeriod(String startPeriod) {
    this.startPeriod = startPeriod;
  }

  public String getEndPeriod() {
    return endPeriod; 
  }

  public void setEndPeriod(String endPeriod) {
    this.endPeriod = endPeriod;
  }

  public int getRemainingVacationDays() {
    return remainingVacationDays;
  }

  public void setRemainingVacationDays(int remainingVacationDays) {
    this.remainingVacationDays = remainingVacationDays;
  }
  
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId){
    this.userId = userId;
  }
}