import java.util.Locale;
import java.util.Random;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        float[] patientsTemperatures = new float[patientsCount];
        for (int i = 0; i < patientsTemperatures.length; i++) {
            float rounding = (float) Math.pow(10, 1);
            float min = 32;
            float max = 40;
            float randomTemp = (float) ((Math.random() * (max - min)) + min);
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
            if (temperatureData[i] >= 36.2 && temperatureData[i] <= 37.0)
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