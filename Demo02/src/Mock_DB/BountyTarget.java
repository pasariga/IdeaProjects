package Mock_DB;

public class BountyTarget {
    private int targetId;
    private String name;
    private double reward;
    boolean isCaptured;
    public BountyTarget(int targetId, String name, double reward,boolean captured) {
        this.targetId = targetId;
        this.name = name;
        this.reward = reward;
        this.isCaptured = captured;
    }

    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public boolean isCaptured() {
        return isCaptured;
    }

    public void setCaptured(boolean captured) {
        isCaptured = captured;
    }

    @Override
    public String toString() {
        return "BountyTarget{name="
                + name + ", targetId="
                + targetId + ", reward="
                + reward + '}';
    }
}
