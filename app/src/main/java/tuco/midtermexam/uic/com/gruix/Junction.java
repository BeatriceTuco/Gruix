package tuco.midtermexam.uic.com.gruix;

/**
 * Created by Bea on 20/01/2018.
 */

public class Junction {
    private int x;
    private int y;
    private String occupiedBy;
    private boolean picked;

    public Junction() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getOccupiedBy() {
        return occupiedBy;
    }

    public void setOccupiedBy(String occupiedBy) {
        this.occupiedBy = occupiedBy;
    }

    public boolean isPicked() {
        return picked;
    }

    public void setPicked(boolean picked) {
        this.picked = picked;
    }

}


