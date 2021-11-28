package Lesson1;

public abstract class Obstacle {
    private int distance;


    public Obstacle(int distance){
        this.distance = distance;

    }
    public int getDistance(){
        return distance;
    }
    public  abstract void passObstacle(TeamMate mate);
}
