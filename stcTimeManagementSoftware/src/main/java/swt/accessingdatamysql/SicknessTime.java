package swt.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity // This tells Hibernate to make a table out of this class
public class SicknessTime {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    //@ManyToOne(targetEntity = swt.accessingdatamysql.User.class) //necessary 
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Integer userId;    //==User
  
    private String sicknessDay;
  
    private int totalSicknessDays;
  
  
    public Integer getId() {
      return id;
    }
  
    public void setId(Integer id) {
      this.id = id;
    }
  
    public String getSicknessDay() {
      return sicknessDay;
    }
  
    public void setSicknessDay(String sicknessDay) {
      this.sicknessDay = sicknessDay;
    }
  
    public int getTotalSicknessDays() {
      return totalSicknessDays;
    }
  
    public void setTotalSicknessDays(int totalSicknessDays) {
      this.totalSicknessDays = totalSicknessDays;
    }
    
    public Integer getUserId() {
      return userId;
    }
  
    public void setUserId(Integer userId){
      this.userId = userId;
    }
  }