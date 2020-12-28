package by.mjc.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        try {
            Number num = NumberUtils.createNumber(str);
            return num.doubleValue() > 0;
        } catch (NumberFormatException ignore) {
        }
        return false;
    }
}
