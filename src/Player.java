public class Player {
    String name;     //Player's name
    int score;  //Player's score

    //Default Constructor for the Player class
    public Player(){
        this.name = " ";
        this.score = 10;
    }

    //Getter methods for the Player class
    public String getPlayer(){
        return this.name;
    }

    //Get player score
    public double getScore(){
        return score;
    }

    //Setter methods for the Player class
    public void setPlayer(String name){
        this.name = name;
    }

    //Set player score
    public void setScore(int score){
        this.score = score;
    }

    public String toString(){
        return "Player's name : " + getPlayer() + ", Player's score: " + getScore();
    }
}
