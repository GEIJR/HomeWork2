package Lesson1;

public class Swim extends Obstacle{

    public Swim(int distance) {
        super(distance);
    }
    @Override
    public  void passObstacle(TeamMate mate){ mate.swim(super.getDistance());}
}
