public class DenseLayer {
    double[][]weights;
    double[]bias;
    int prev, next;
    Activation RELU;
    public DenseLayer(int prev, int next){
        this.prev = prev;
        this.next = next;
        RELU = new Relu();
        initialize();
    }
    public void initialize(){
        weights = new double[next][prev];
        bias = new double[next];
        for (int i = 0; i < next; i++) {
            bias[i] = Math.random() * 2;
            for (int j = 0; j < prev; j++) {
                weights[i][j] = Math.random() * 2;
            }
        }
    }
    public double[] pass(double[]prevLayer){
        double[]nextLayer = new double[next];
        for(int i = 0; i < next; i++){
            nextLayer[i] = 0;
            for (int j = 0; j < prev; j++) {
                nextLayer[i] += weights[i][j] * prevLayer[j];
            }
            nextLayer[i] = RELU.pass(nextLayer[i] + bias[i]);
        }
        return nextLayer;
    }
}
