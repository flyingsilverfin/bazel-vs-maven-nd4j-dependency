package testing;


// apache works
import org.apache.commons.math3.random.RandomDataGenerator;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
        RandomDataGenerator rand = new RandomDataGenerator();
        long n = rand.nextLong(0, 100);
        System.out.println("Generated: ");
        System.out.println(n);
    }
}
