package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Converter {
    public int convert(String value) {

        int result = 0;
        if (value == null || value.equals("")) {
            return result;
        }
        
        Matcher m = Pattern.compile("//(;)\n(.*)").matcher(value);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String[] values = m.group(2).split(customDelimiter);
            return ToInt(values);
        }

        String[] values = value.split(",|:");
        return ToInt(values);


    }

    private static int ToInt(String[] values) {
       return Arrays.stream(values).map(value -> new Positive(value).getNumber()).mapToInt(i -> i).sum();
    }
}
