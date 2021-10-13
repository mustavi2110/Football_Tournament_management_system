
public class Referee {
    private int RefereeId;
    private String RefereeName;
    private String RefereeCountry;
    private int MatchOperated;
    
    
    public Referee(int RefId,String RefName,String RefCountry,int MatchOperate)
    {
        this.RefereeId=RefId;
        this.RefereeName=RefName;
        this.RefereeCountry=RefCountry;
        this.MatchOperated=MatchOperate;
        
    }
     public Referee(String RefName,String RefCountry,int MatchOperate)
    {

        this.RefereeName=RefName;
        this.RefereeCountry=RefCountry;
        this.MatchOperated=MatchOperate;
        
    }
     
    public int getRefereeId() {
        return RefereeId;
    }

    public String getRefereeName() {
        return RefereeName;
    }

    public String getRefereeCountry() {
        return RefereeCountry;
    }

    public int getMatchOperated() {
        return MatchOperated;
    }
  

    public void setRefereeId(int RefereeId) {
        this.RefereeId = RefereeId;
    }

    public void setRefereeName(String RefereeName) {
        this.RefereeName = RefereeName;
    }

    public void setRefereeCountry(String RefereeCountry) {
        this.RefereeCountry = RefereeCountry;
    }

    public void setMatchOperated(int MatchOperated) {
        this.MatchOperated = MatchOperated;
    }
}  
