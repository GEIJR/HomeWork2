package Lesson1;

public class Main {

    public static void main(String[] args) {

        Course courses = new Course(new Run(20), new Swim(15));

        Team team = new Team(" Animals", new TeamMate("Cat", 10),
                new TeamMate("Dog", 20), new TeamMate("Fox",
                25), new TeamMate("Zebra", 29));

        team.getMates();
        courses.doIt(team);
        team.showResults();
    }

}




