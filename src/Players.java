
public class Players {
    private int playerID;
    private String playerName;
    private int age;
    private String country;
    private float height;
    private String position;
    private int goalScored;
    private float hoursPlayed;
    private int yellowCard;
    private int redCard;
    private float rating;
       private String teamName;
    public Players(int id, int age,String name, String country, float height,
            String position, int goal, float HP, int YC,
            int RC, float rating,String tname) {
        this.playerID = id;
        this.playerName = name;
        this.age = age;
        this.country = country;
        this.height = height;
        this.position = position;
        this.goalScored = goal;
        this.hoursPlayed = HP;
        this.yellowCard = YC;
        this.redCard = RC;
        this.rating = rating;
        this.teamName=tname;
    }
    public Players(int age, String name, String country, float height,
            String position, int goal, float HP, int YC,
            int RC, float rating,String tname) {
        this.playerName = name;
        this.age = age;
        this.country = country;
        this.height = height;
        this.position = position;
        this.goalScored = goal;
        this.hoursPlayed = HP;
        this.yellowCard = YC;
        this.redCard = RC;
        this.rating = rating;
        this.teamName=tname;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

  

    public int getPlayerID() {
        return playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public float getHeight() {
        return height;
    }

    public String getPosition() {
        return position;
    }

    public int getGoalScored() {
        return goalScored;
    }

    public float getHoursPlayed() {
        return hoursPlayed;
    }

    public int getYellowCard() {
        return yellowCard;
    }

    public int getRedCard() {
        return redCard;
    }

    public float getRating() {
        return rating;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setGoalScored(int gaolScored) {
        this.goalScored = gaolScored;
    }

    public void setHoursPlayed(float hoursPlayed) {
        this.hoursPlayed = hoursPlayed;
    }

    public void setYellowCard(int yellowCard) {
        this.yellowCard = yellowCard;
    }

    public void setRedCard(int redCard) {
        this.redCard = redCard;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    
    
}