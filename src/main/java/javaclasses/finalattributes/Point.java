package javaclasses.finalattributes;

public final class Point { //от final класса нельзя наследоваться
    private final int MAX_RANGE = 1_000;
    final StringBuilder builder = new StringBuilder();
    private int x;
    private String name;

    public Point(int x) {
        this.x = x;
        //MAX_RANGE = 111; //переинициализировать нельзя
        builder.append("hi"); //но внутреннее состояние менять можно, неизменна только ссылка
    }
    final int length(){ //в подклассе метод переопределить нельзя
        return Math.abs(x);
    } //одновременно final класс и final метод делать бессмысленно
}
