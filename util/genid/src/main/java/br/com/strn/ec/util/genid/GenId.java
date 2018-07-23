package br.com.strn.ec.util.genid;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class GenId {

    private static final String CODE_BASE_36 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String generate() {
        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

        String data = dt.format(formatter);

        UUID uuid = UUID.randomUUID();

        return convert(Long.parseLong(data)) + "-" +
                convert(uuid.getMostSignificantBits()) + "." +
                convert(uuid.getLeastSignificantBits());
    }

    private static String convert(Long numToConvert) {

        if (numToConvert < 0) {
            numToConvert = Math.abs(numToConvert);
        }
        Long num = numToConvert;
        StringBuilder text = new StringBuilder();
        int j = (int) Math.ceil(Math.log(num) / Math.log(CODE_BASE_36.length()));
        for (int i = 0; i < (j > 0 ? j : 1); i++) {
            text.insert(0, CODE_BASE_36.charAt(Integer.parseInt(String.valueOf(num % CODE_BASE_36.length()))));
            num /= CODE_BASE_36.length();
        }

        while (text.length() < 13)
            text.insert(0, "0");

        return text.toString();
    }
}
