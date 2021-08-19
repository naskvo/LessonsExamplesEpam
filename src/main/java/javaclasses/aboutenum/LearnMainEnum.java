package javaclasses.aboutenum;

public class LearnMainEnum {
    public static void main(String[] args) {
        //SeasonDayEnum season = new SeasonDayEnum(Season.WINTER, 21);
        SeasonDayEnum season = new SeasonDayEnum(Season.WINTER.ordinal(), 21);
    }
}
