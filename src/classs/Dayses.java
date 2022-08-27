package classs;

import enums.Days;

public class Dayses {
    private Days monday;
    private Days tuesday;
    private Days wednesday;
    private Days thursday;
    private Days friday;
    private Days saturday;
    private Days sunday;

    public Dayses(Days monday, Days tuesday, Days wednesday, Days thursday, Days friday, Days saturday, Days sunday) {
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
    }

    public Days getMonday() {
        return monday;
    }

    public void setMonday(Days monday) {
        this.monday = monday;
    }

    public Days getTuesday() {
        return tuesday;
    }

    public void setTuesday(Days tuesday) {
        this.tuesday = tuesday;
    }

    public Days getWednesday() {
        return wednesday;
    }

    public void setWednesday(Days wednesday) {
        this.wednesday = wednesday;
    }

    public Days getThursday() {
        return thursday;
    }

    public void setThursday(Days thursday) {
        this.thursday = thursday;
    }

    public Days getFriday() {
        return friday;
    }

    public void setFriday(Days friday) {
        this.friday = friday;
    }

    public Days getSaturday() {
        return saturday;
    }

    public void setSaturday(Days saturday) {
        this.saturday = saturday;
    }

    public Days getSunday() {
        return sunday;
    }

    public void setSunday(Days sunday) {
        this.sunday = sunday;
    }

}
