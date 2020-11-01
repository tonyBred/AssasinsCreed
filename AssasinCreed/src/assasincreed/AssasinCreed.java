/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assasincreed;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class AssasinCreed {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        String y;
        
        Game_Detail AC1 = new Game_Detail();
        Game_Detail AC2 = new Game_Detail();
        Game_Detail ACBrotherHood = new Game_Detail();
        Game_Detail ACRevelation = new Game_Detail();
        Game_Detail AC3 = new Game_Detail();
        Game_Detail AC4 = new Game_Detail();
        Game_Detail ACRogue = new Game_Detail();
        Game_Detail ACUnity = new Game_Detail();
        Game_Detail ACSyndicate = new Game_Detail();
        Game_Detail ACOrigins = new Game_Detail();
        Game_Detail ACOdyssey = new Game_Detail();
        Game_Detail ACValhalla = new Game_Detail();
        
        AC1.setGameName("Assasin's Creed");
        AC1.setProtagonistName("Altaïr Ibn-La’Ahad");
        AC1.setPlace("Jerrusalam");
        AC1.setTimePeriode("1191 AD");
        
        AC2.setGameName("Assasin's Creed II");
        AC2.setProtagonistName("Ezio Auditore da Firenze");
        AC2.setPlace("Italian Renaissance");
        AC2.setTimePeriode("1459-1500 AD");
        
        ACBrotherHood.setGameName("Assasin's Creed BrotherHood");
        ACBrotherHood.setProtagonistName("Ezio Auditore da Firenze");
        ACBrotherHood.setPlace("Italian Renaissance");
        ACBrotherHood.setTimePeriode("1500-1507 AD");
        
        ACRevelation.setGameName("Assasin's Creed Revelations");
        ACRevelation.setProtagonistName("Ezio Auditore da Firenze");
        ACRevelation.setPlace("Italian Renaissance");
        ACRevelation.setTimePeriode("1511 AD");
        
        AC3.setGameName("Assasin's Creed III");
        AC3.setProtagonistName("Ratonhnhaké:ton a.k.a Conner");
        AC3.setPlace("America");
        AC3.setTimePeriode("1754-1783 AD");
        
        AC4.setGameName("Assasin's Creed IV Black Flag");
        AC4.setProtagonistName("Edward Kenway");
        AC4.setPlace("Europe The Golden Age of Piracy");
        AC4.setTimePeriode("1712-1722 AD");
        
        ACRogue.setGameName("Assasin's Creed Rouge");
        ACRogue.setProtagonistName("Shay Cormac");
        ACRogue.setPlace("Europe Seven Years War");
        ACRogue.setTimePeriode("1752-1760 AD");
        
        ACUnity.setGameName("Assasin's Creed Unity");
        ACUnity.setProtagonistName("Arno Dorian");
        ACUnity.setPlace("France Revolution");
        ACUnity.setTimePeriode("1776-1808 AD");
        
        ACSyndicate.setGameName("Assasin's Creed Syndicate");
        ACSyndicate.setProtagonistName("Jacob and Evie Frye");
        ACSyndicate.setPlace("Victorian London");
        ACSyndicate.setTimePeriode("1868 AD");
        
        ACOrigins.setGameName("Assasin's Creed Origins");
        ACOrigins.setProtagonistName("Bayek");
        ACOrigins.setPlace("Egypt");
        ACOrigins.setTimePeriode("49-43 BC");
        
        ACOdyssey.setGameName("Assasin's Creed Odyssey");
        ACOdyssey.setProtagonistName("Alexios and Kassandra");
        ACOdyssey.setPlace("Ancient Greece");
        ACOdyssey.setTimePeriode("431 AD");
        
        ACValhalla.setGameName("Assasin's Creed Valhalla");
        ACValhalla.setProtagonistName("Eivor");
        ACValhalla.setPlace("Britain");
        ACValhalla.setTimePeriode("873 AD");
        
        
        do{
            System.out.println("Assasin's Creed Games (Ubisoft)");
            System.out.println("1. Assasins's Creed");
            System.out.println("2. Assasins's Creed II");
            System.out.println("3. Assasins's Creed Brotherhood");
            System.out.println("4. Assasins's Creed Revelations");
            System.out.println("5. Assasins's Creed III");
            System.out.println("6. Assasins's Creed IV Black Flag");
            System.out.println("7. Assasins's Creed Rogue");
            System.out.println("8. Assasins's Creed Unity");
            System.out.println("9. Assasins's Creed Syndicate");
            System.out.println("10. Assasins's Creed Origins");
            System.out.println("11. Assasins's Creed Odyssey");
            System.out.println("12. Assasins's Creed Valhalla");
            System.out.print("Choose to see detail : ");
            x = scan.nextInt();
            System.out.println();
            
            switch(x){
                case 1:{
                    AC1.ToString();
                    break;
                }
                case 2:{
                    AC2.ToString();
                    break;
                }
                case 3:{
                    ACBrotherHood.ToString();
                    break;
                }
                case 4:{
                    ACRevelation.ToString();
                    break;
                }
                case 5:{
                    AC3.ToString();
                    break;
                }
                case 6:{
                    AC4.ToString();
                    break;
                }
                case 7:{
                    ACRogue.ToString();
                    break;
                }
                case 8:{
                    ACUnity.ToString();
                    break;
                }
                case 9:{
                    ACSyndicate.ToString();
                    break;
                }
                case 10:{
                    ACOrigins.ToString();
                    break;
                }
                case 11:{
                    ACOdyssey.ToString();
                    break;
                }
                case 12:{
                    ACValhalla.ToString();
                    break;
                }
            }
        
            System.out.print("Continue (Y/N) : ");
            y = scan.next();
            System.out.println();
            
            if("N".equals(y)){
                System.exit(1);
            }
        }while(true);
        
    }
}
