/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assasincreed;

/**
 *
 * @author ASUS
 */
public class Game_Detail {
    private String gameName;
    private String protagonistName;
    private String timePeriode;
    private String place;
    
    Game_Detail(){
        gameName = "";
        protagonistName = "";
        timePeriode = "";
        place = "";
    }
    
    /**
     * @return the gameName
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * @param gameName the gameName to set
     */
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
    
    /**
     * @return the protagonistName
     */
    public String getProtagonistName() {
        return protagonistName;
    }

    /**
     * @param protagonistName the protagonistName to set
     */
    public void setProtagonistName(String protagonistName) {
        this.protagonistName = protagonistName;
    }

    /**
     * @return the timePeriode
     */
    public String getTimePeriode() {
        return timePeriode;
    }

    /**
     * @param timePeriode the timePeriode to set
     */
    public void setTimePeriode(String timePeriode) {
        this.timePeriode = timePeriode;
    }

    /**
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(String place) {
        this.place = place;
    }
    
    public void ToString(){
        System.out.println("Game's Name : "+gameName);
        System.out.println("Protagonist's Name : "+protagonistName);
        System.out.println("Time Periode : "+timePeriode);
        System.out.println("Set in : "+place);
    }
   
}
