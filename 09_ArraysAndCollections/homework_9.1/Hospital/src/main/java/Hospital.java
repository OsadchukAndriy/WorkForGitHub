import java.util.Locale;
import java.util.Random;

public class Hospital {
    public static final int MIN_TEMPERATURE = 32;
    public static final int MAX_TEMPERATURE = 40;
    public static final float MIN_HEALTHY_TEMPERATURE = 36.2f;
    public static final float MAX_HEALTHY_TEMPERATURE = 37.0f;

    public static float[] generatePatientsTemperatures(int patientsCount) {

        float[] patientsTemperatures = new float[patientsCount];
        for (int i = 0; i < patientsTemperatures.length; i++) {
            float rounding = (float) Math.pow(10, 1);
            float randomTemp = (float) ((Math.random() * (MAX_TEMPERATURE - MIN_TEMPERATURE)) + MIN_TEMPERATURE);
            float randomTemperatures = Math.round(randomTemp * rounding) / rounding;
            patientsTemperatures[i] = randomTemperatures;
        }
        return patientsTemperatures;
    }

    public static String getReport(float[] temperatureData) {
        String patientsTemperatures = "";
        float temperaturesSum = 0;
        int healthyPatientsCount = 0;
        for (int i = 0; i <= temperatureData.length - 1; i++) {
            patientsTemperatures += temperatureData[i] + " ";
            temperaturesSum += temperatureData[i];
            if (temperatureData[i] >= MIN_HEALTHY_TEMPERATURE && temperatureData[i] <= MAX_HEALTHY_TEMPERATURE)
                healthyPatientsCount++;
        }

        float rounding = (float) Math.pow(10, 2);
        float temperatureBeforeRound = temperaturesSum / temperatureData.length;
        float middle = Math.round(temperatureBeforeRound * rounding) / rounding;
        String report =
                "Температуры пациентов: " + patientsTemperatures.trim() +
                        "\nСредняя температура: " + middle +
                        "\nКоличество здоровых: " + healthyPatientsCount;

        return report;
    }
}
