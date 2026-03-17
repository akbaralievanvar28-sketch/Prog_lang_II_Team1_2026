public class FitnessTracker {
    private String userName;
    private int dailySteps = 0;
    private int stepGoal;

    public FitnessTracker(String userName, int stepGoal) {
        this.userName = userName;
        this.stepGoal = stepGoal;
    }

    public FitnessTracker(String userName) {
        this.userName = userName;
        this.stepGoal = 10000;
    }

    public void addSteps(int steps) {
        if (steps > 0) {
            dailySteps = dailySteps + steps;
        }
    }

    public boolean isGoalReached() {
        return dailySteps >= stepGoal;
    }

    public String toString() {
        return userName + " took " + dailySteps + " steps out of " + stepGoal + " goal. Goal reached: " + isGoalReached();
    }
}