package io.ctapp.coronavirustracker.models;

public class Locationstats {
        private String state;
        private String country;
        private int latestTotalCases;

    public int getDiffInDays() {
        return diffInDays;
    }

    public void setDiffInDays(int diffInDays) {
        this.diffInDays = diffInDays;
    }

    private int diffInDays;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Locationstats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }
}
