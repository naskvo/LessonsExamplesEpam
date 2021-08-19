package javaclasses.enumandfunctinterface;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public enum RectangleParam implements Supplier<BiFunction> {
    PERIMETER((o1, o2) -> 2 * (o1 + o2)),
    SQUARE((o1, o2) -> o1 * o2);
    private BiFunction<Double,Double,Double> biFunction;

    RectangleParam(BiFunction<Double, Double, Double> biFunction) {
        this.biFunction = biFunction;
    }

    @Override
    public BiFunction<Double, Double, Double> get() {
        return biFunction;
    }
};

/*public enum RectangleParam implements ShapeService {
    PERIMETER {
        @Override
        public double service(double... param) {
            return 2 * (param[0] + param[1]);
        }
    }, SQUARE {
        @Override
        public double service(double... param) {
            return param[0] * param[1];
        }
    };
}*/
