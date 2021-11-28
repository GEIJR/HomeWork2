package Lesson1;

public class Team {

    private TeamMate[] mates;
    private final String nameTeam;


    public Team(String nameTeam, TeamMate... mates) {
        this.mates = mates;
        this.nameTeam = nameTeam;

    }
    public void showResults() {
        printDivider();
        System.out.println("Полосу препятствий преодолевала команда: " + nameTeam);
        for (TeamMate mate:mates ) {
            if (mate.getResult() == Result.NoPassDistant){
                showResultMateNoPassed(mate);
            }
            else {
                showResultMatePassed(mate);
            }
        }
        printDivider();
    }

    private void showResultMateNoPassed(TeamMate mate) {
        printDivider();
        System.out.println(mate.getNameTeamMate() + " Не прошел полосу препятствий");
    }

    private void showResultMatePassed(TeamMate mate) {
        printDivider();
        System.out.println(mate.getNameTeamMate() + " Успешно прошел полосу препятствий");
    }

    public TeamMate[] getMates() {
        return mates;
    }

    private void printDivider() {
        System.out.println("-----------------------------------------------------------");
    }
}

