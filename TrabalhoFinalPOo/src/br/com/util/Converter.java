package br.com.util;

public class Converter {

    public static int StringToInt(String value){
        if(value == null || "".equals(value)) return 0;
        return Integer.parseInt(value);
    }

}
