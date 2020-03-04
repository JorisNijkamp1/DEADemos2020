package oose.dea.domain;

public class Jedi {
    private int customerId;
    private String name;
    private StarShip startShip;
    private boolean darkside;
    private int rank;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StarShip getStartShip() {
        return startShip;
    }

    public void setStartShip(StarShip startShip) {
        this.startShip = startShip;
    }

    public boolean isDarkside() {
        return darkside;
    }

    public void setDarkside(boolean darkside) {
        this.darkside = darkside;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
