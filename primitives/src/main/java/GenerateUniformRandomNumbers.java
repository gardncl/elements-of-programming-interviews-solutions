import java.util.Random;

public class GenerateUniformRandomNumbers {

    /*
    5.10
    */

    private static Random random = new Random();

    public static int uniformRandom(int lowerBound, int upperBound) {
        int range = upperBound - lowerBound + 1, result;
        do {
            result = 0;
            for (int i = 0; (1 << i) < range; ++i) {
                result = (result << 1) | randomBit();
            }
        } while (result >= range);

        return result + lowerBound;
    }

    private static int randomBit() {
        return random.nextInt(2);
    }
}
