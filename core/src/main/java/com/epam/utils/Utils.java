package com.epam.utils;

import com.epam.lib.utils.StringUtils;
import java.util.Arrays;

public class Utils {
    public static boolean isAllPositiveNumbers(String... strings){
     return Arrays.stream(strings).allMatch(StringUtils::isPositiveNumber);

    }
}

