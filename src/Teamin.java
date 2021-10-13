/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Teamin {
    
    private int teamID;
    private String teamName;
    private String homeGround;
    private int homeWin;
    private int homeLose;
    private int awayWin;
    private int awayLose;
    private int totalwin;

 
    private int totallose;

    
    public Teamin(int id ,String tname,String homeg,int homew,int homel,int awayw,int awayl)
    
    {
        this.teamID=id;
        this.teamName=tname;
        this.homeGround=homeg;
        this.homeWin=homew;
        this.homeLose=homel;
        this.awayWin=awayw;
        this.awayLose=awayl;
      
    }
    
      public Teamin(int id ,String tname,String homeg,int homew,int homel,int awayw,int awayl,int totalwin,int totallose)
    
    {
        this.teamID=id;
        this.teamName=tname;
        this.homeGround=homeg;
        this.homeWin=homew;
        this.homeLose=homel;
        this.awayWin=awayw;
        this.awayLose=awayl;
        this.totalwin=totalwin;
        this.totallose=totallose;
      
    }
    
       public Teamin(String tname,String homeg,int homew,int homel,int awayw,int awayl,int totalwin,int totallose)
    
    {
        
        this.teamName=tname;
        this.homeGround=homeg;
        this.homeWin=homew;
        this.homeLose=homel;
        this.awayWin=awayw;
        this.awayLose=awayl;
        this.totalwin=totalwin;
        this.totallose=totallose;
      
    }
    
    
    public Teamin(String tname,String homeg,int homew,int homel,int awayw,int awayl)
    {
        this.teamName=tname;
        this.homeGround=homeg;
        this.homeWin=homew;
        this.homeLose=homel;
        this.awayWin=awayw;
        this.awayLose=awayl;

        
        
           
    }
      
    public int getTeamID() {
        return teamID;
    }

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @return the homeGround
     */
    public String getHomeGround() {
        return homeGround;
    }

    /**
     * @return the homeWin
     */
    public int getHomeWin() {
        return homeWin;
    }

    /**
     * @return the homeLose
     */
    public int getHomeLose() {
        return homeLose;
    }

    public void setTotalwin(int totalwin) {
        this.totalwin = totalwin;
    }

    public void setTotallose(int totallose) {
        this.totallose = totallose;
    }

    public int getTotalwin() {
        return totalwin;
    }

    public int getTotallose() {
        return totallose;
    }
    /**
     * @return the awayWin
     */
    public int getAwayWin() {
        return awayWin;
    }

    /**
     * @return the awayLose
     */
    public int getAwayLose() {
        return awayLose;
    }

    /**
     * @return the totalWin
     */
    
    /**
     * @param teamID the teamID to set
     */
    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @param homeGround the homeGround to set
     */
    public void setHomeGround(String homeGround) {
        this.homeGround = homeGround;
    }

    /**
     * @param homeWin the homeWin to set
     */
    public void setHomeWin(int homeWin) {
        this.homeWin = homeWin;
    }

    /**
     * @param homeLose the homeLose to set
     */
    public void setHomeLose(int homeLose) {
        this.homeLose = homeLose;
    }

    /**
     * @param awayWin the awayWin to set
     */
    public void setAwayWin(int awayWin) {
        this.awayWin = awayWin;
    }

    /**
     * @param awayLose the awayLose to set
     */
    public void setAwayLose(int awayLose) {
        this.awayLose = awayLose;
    }

    /**
     * @param totalWin the totalWin to set
     */
   
    
}
