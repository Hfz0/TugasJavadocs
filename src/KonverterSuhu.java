/**
 * Kelas utilitas untuk mengonversi suhu antar satuan yang berbeda.
 * Menyediakan metode statis untuk konversi Celcius, Fahrenheit, dan Kelvin.
 *
 */
public class KonverterSuhu {

    /**
     * Menyimpan nilai konstanta nol absolut dalam Celcius.
     * Suhu tidak bisa lebih rendah dari nilai ini.
     */
    private static final double NOL_ABSOLUT_CELCIUS = -273.15;
    
    /**
     * Mengonversi suhu dari Celcius ke Fahrenheit.
     *
     * @param celcius Suhu dalam derajat Celcius.
     * @return Suhu yang setara dalam derajat Fahrenheit.
     * @throws IllegalArgumentException Jika suhu Celcius di bawah nol absolut.
     */
    public static double celciusKeFahrenheit(double celcius) {
        if (celcius < NOL_ABSOLUT_CELCIUS) {
            throw new IllegalArgumentException("Suhu tidak valid, di bawah nol absolut.");
        }
        return (celcius * 9.0 / 5.0) + 32;
    }

    /**
     * Mengonversi suhu dari Fahrenheit ke Celcius.
     *
     * @param fahrenheit Suhu dalam derajat Fahrenheit.
     * @return Suhu yang setara dalam derajat Celcius.
     * @throws IllegalArgumentException Jika suhu Fahrenheit di bawah nol absolut
     * (-459.67 F).
     */
    public static double fahrenheitKeCelcius(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5.0 / 9.0;
        if (celcius < NOL_ABSOLUT_CELCIUS) {
            throw new IllegalArgumentException("Suhu tidak valid, di bawah nol absolut.");
        }
        return celcius;
    }

    /**
     * Mengonversi suhu dari Celcius ke Kelvin.
     *
     * @param celcius Suhu dalam derajat Celcius.
     * @return Suhu yang setara dalam Kelvin.
     * @throws IllegalArgumentException Jika suhu Celcius di bawah nol absolut.
     */
    public static double celciusKeKelvin(double celcius) {
        if (celcius < NOL_ABSOLUT_CELCIUS) {
            throw new IllegalArgumentException("Suhu tidak valid, di bawah nol absolut.");
        }
        return celcius + 273.15;
    }
}