package swt.accessingdatamysql;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity // This tells Hibernate to make a table out of this class
public class WorkHours {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  
  //@ManyToOne(targetEntity = swt.accessingdatamysql.User.class) //nessecary 
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private Integer userId;    //==User

  private String workDate;

  private float workTime;

  private String startTime;

  private String endTime;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    if (id < 0) {
      throw new IllegalArgumentException("id must not be negative");
    } else {
      this.id = id;
    }
  }

  public String getWorkDate() {
    return workDate;
  }

  public void setWorkDate(String workDate) {
    this.workDate = workDate;
  }

  public float getWorkTime() {
    return workTime; 
  }

  public void setWorkTime(float workTime) {
    this.workTime = workTime;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }
  
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId){
    this.userId = userId;
  }

}
