import java.util.Locale;
import java.util.Random;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        float[] patientsTemperatures = new float[patientsCount];

        for (int i = 0; i < patientsTemperatures.length; i++) {

            float scale = (float) Math.pow(10, 1);
            float randomTemp = (float) ((Math.random() * 8)+ 32);
            float randomTemperatures = Math.round (randomTemp * scale) / scale;

            patientsTemperatures[i] = randomTemperatures;

        }
        return patientsTemperatures;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
        String patientsTemperatures = "";
        float temperaturesSum = 0;
        int healthyPatientsCount = 0;

        for (int i = 0; i <= temperatureData.length - 1; i++) {
            patientsTemperatures += temperatureData[i] + " ";
            temperaturesSum += temperatureData[i];
            if (temperatureData[i] >= 36.2 && temperatureData[i] <= 37.0)
                healthyPatientsCount++;
        }

        float scale = (float) Math.pow(10, 2);
        float temperatureBeforeRound = temperaturesSum / temperatureData.length;
        float middle = Math.round(temperatureBeforeRound * scale) / scale;
        String report =
                "Температуры пациентов: " + patientsTemperatures.trim() +
                        "\nСредняя температура: " + middle +
                        "\nКоличество здоровых: " + healthyPatientsCount;

        return report;
    }
}
