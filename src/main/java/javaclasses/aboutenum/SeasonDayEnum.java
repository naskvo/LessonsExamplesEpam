package javaclasses.aboutenum;

public class SeasonDayEnum {
    //private Season season;
    private int season;
    private int day;

/*    public SeasonDayEnum(Season season, int day) {
        this.season = season;
        this.day = day;
    }*/

    public SeasonDayEnum(int season, int day) {
        this.season = season;
        this.day = day;
    }
}

/*    public SeasonDayEnum(Season season, int day) {
        this.season = season.ordinal();
        this.day = day;
    }*/
