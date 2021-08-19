package javaclasses.finalattributes;

import java.util.Random;

public class Point2D {
    final int MAX_RANGE; //должно проинициализироваться до окончания работы конструктора (всех конструкторов)
    //неизменяемое в пределах одного объекта
    private int x;
    private int y;
/*    {
        MAX_RANGE = new Random().nextInt(10_000); //а можно так, тогда в конструкторах не надо, т.к. блок вызывается до конструкторов
    }*/

    public Point2D(){
        MAX_RANGE = 1_000;
    }

    public Point2D(int x, int y) {
        MAX_RANGE = new Random().nextInt(10_000);
        this.x = x;
        this.y = y;
    }
}
