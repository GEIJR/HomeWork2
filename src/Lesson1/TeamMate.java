package Lesson1;

public class TeamMate {

        private  Result result = Result.NoPassDistant;
        private String nameTeamMate;
        private int power;

        public TeamMate(String nameTeamMate, int power) {
            this.nameTeamMate = nameTeamMate;
            this.power = power;
        }

        public Result getResult() {
            return result;
        }

        public String getNameTeamMate() {
            return nameTeamMate;
        }

        public void run(int courseDistance) {
            if (checkPower(courseDistance)) {
                changeResult(Result.PassDistant," пробежал кросс");
            }
            else{
                changeResult(Result.NoPassDistant,"  не пробежал кросс");
            }
        }

        public void swim(int courseDistance) {
            if (checkPower(courseDistance)) {
                changeResult(Result.PassDistant," проплыл дистанцию");
            }
            else{
                changeResult(Result.NoPassDistant," не проплыл дистанцию");
            }
        }

        private boolean checkPower(int courseDistance) {
            return power > courseDistance || power == courseDistance;
        }

        private void changeResult(Result newResult, String message) {
            result = newResult;
            System.out.println(nameTeamMate + message);
        }

}


