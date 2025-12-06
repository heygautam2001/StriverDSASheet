package Basics;

import java.util.Arrays;

public class Temperature {
    // leet-code 2469
    public static double[] convertTemperature(double celsius) {
        double[] ans = new double[2];

        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        ans[0] = kelvin;
        ans[1] = fahrenheit;

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(35)));
    }
}
