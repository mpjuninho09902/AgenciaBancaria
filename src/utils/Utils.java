package utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {
    static NumberFormat formatandoValor = new DecimalFormat("R$ #,##0.00");

    public static String doubleToString(Double valor){
        return formatandoValor.format(valor);
    }
}
