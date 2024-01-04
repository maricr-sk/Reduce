import java.util.stream.DoubleStream;

public class Demo {
    public static void main(String[] args) {
        int x = 8;
        var y = 8; //don't need to specify value

        double answer = DoubleStream.of(2.72,3.14,1.00,0.00,5.67,8.67)
                .map(p -> Math.pow(p, 2))
                .filter(p -> p > 7.0)
                .reduce(1, (a,b) -> a*b);

        System.out.println(answer);

        
    }

}
