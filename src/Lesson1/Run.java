package Lesson1;

public class Run extends Obstacle {

    public Run(int distance) {
        super(distance);
    }


    @Override
    public void passObstacle(TeamMate mate){ mate.run(super.getDistance());}
}
