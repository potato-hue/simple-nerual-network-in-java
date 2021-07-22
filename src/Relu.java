public class Relu implements Activation {

    @Override
    public double pass(double d) {
        if(d > 0)return d;
        return 0;
    }
}
