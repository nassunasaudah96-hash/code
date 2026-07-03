import java.util.Random;

public class NaroRainfall {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] rainfall = new double[30];
        double total = 0;
        int wetDays = 0;

        // (i) Generate 30 random readings (0 to 60 mm)
        for (int i = 0; i < 30; i++) {
            rainfall[i] = rand.nextDouble() * 60;
            total += rainfall[i];
            if (rainfall[i] > 30) wetDays++;
        }

        double average = total / 30;

        // (ii) Display total and average
        System.out.printf("Total monthly rainfall: %.2f mm%n", total);
        System.out.printf("Average daily rainfall: %.2f mm%n", average);

        // (iii) Wet days
        System.out.println("Number of wet days (>30mm): " + wetDays);

        // (iv) Classification
        String classification;
        if (total <= 300) {
            classification = "Dry";
        } else if (total <= 600) {
            classification = "Normal";
        } else {
            classification = "Flood-risk";
        }
        System.out.println("Month classification: " + classification);
    }
}