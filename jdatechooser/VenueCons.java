
public class VenueCons {
    private int venueid;

    public void setVenueid(int venueid) {
        this.venueid = venueid;
    }

    public void setVenuename(String venuename) {
        this.venuename = venuename;
    }
    private String venuename;

    public int getVenueid() {
        return venueid;
    }

    public String getVenuename() {
        return venuename;
    }
    public VenueCons(int venueid,String venuename)
    {
        this.venueid=venueid;
        this.venuename=venuename;
    }
     public VenueCons(String venuename)
    {
    
        this.venuename=venuename;
    }
     public VenueCons(int venueid)
    {
        this.venueid=venueid;
        
    }
}
