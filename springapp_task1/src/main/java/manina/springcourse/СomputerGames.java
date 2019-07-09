package manina.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class СomputerGames {
    @Autowired
    @Qualifier("gameComputer")
    private Game game;

    private int levels;
    private int numberofdownloads;
    private int userrating;

    @Autowired
    public СomputerGames(int levels, int numberofdownloads, int userrating) {
        this.levels = levels;
        this.numberofdownloads = numberofdownloads;
        this.userrating = userrating;
    }

    public int getUserrating() {
        return userrating;
    }

    public void setUserrating(int userrating) {
        this.userrating = userrating;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getNumberofdownloads() {
        return numberofdownloads;
    }

    public void setNumberofdownloads(int numberofdownloads) {
        this.numberofdownloads = numberofdownloads;
    }

    //IoC
    @Autowired
    public СomputerGames(Game game){
        this.game = game;
    }

    public СomputerGames(){}

    public void setGame(Game game) {
        this.game = game;
    }

    public void playGame(){
       System.out.println("Game launch:" + game.getApp());

    }
}
