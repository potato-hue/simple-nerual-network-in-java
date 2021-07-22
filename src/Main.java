import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        DenseLayer test = new DenseLayer(5, 10);
        double[]sample = {1.012, 4.032, 2.0343, 9.0101323, 2.08879};
        System.out.println(Arrays.toString(test.pass(sample)));
    }
}
