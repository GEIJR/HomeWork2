package Lesson1;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
    this.obstacles = obstacles;
    }
    public void doIt(Team mate) {
        for (TeamMate mates : mate.getMates()) {
            for (Obstacle obs :obstacles) {
            obs.passObstacle(mates);
            if (mates.getResult()== Result.NoPassDistant){
                break;
            }
            }
        }
    }
}






