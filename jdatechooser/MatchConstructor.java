
import java.sql.Date;


public class MatchConstructor {
   private  int matchid;
   private String hometeam;
   private String awayteam;
   private Date date;
   private String venue;
    public MatchConstructor(int matchid,String hometeam,String awayteam,Date date,String venue)
    {
      this.matchid=matchid;
      this.hometeam=hometeam;
      this.awayteam=awayteam;
      this.date=date;
      this.venue=venue;
    }
    public MatchConstructor(String hometeam,String awayteam,Date date,String venue)
    {
      this.hometeam=hometeam;
      this.awayteam=awayteam;
      this.date=date;
      this.venue=venue;
    }
      public MatchConstructor(String hometeam,String awayteam,Date date)
    {
      this.hometeam=hometeam;
      this.awayteam=awayteam;
      this.date=date;
  
    }
       public void setMatchid(int matchid) {
        this.matchid = matchid;
    }

    public void setHometeam(String hometeam) {
        this.hometeam = hometeam;
    }

    public void setAwayteam(String awayteam) {
        this.awayteam = awayteam;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public int getMatchid() {
        return matchid;
    }

    public String getHometeam() {
        return hometeam;
    }

    public String getAwayteam() {
        return awayteam;
    }

    public Date getDate() {
        return date;
    }

    public String getVenue() {
        return venue;
    }
     public MatchConstructor(int matchid,String hometeam,String awayteam,Date date)
    {
      this.matchid=matchid;
      this.hometeam=hometeam;
      this.awayteam=awayteam;
      this.date=date;
  
    }
      
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
