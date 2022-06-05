package data_type;

@SuppressWarnings("ALL")
public class NumberConversion {
    public static void main(String[] args) {
        // konversi dari byte -> short -> int -> long -> float -> double
        // bisa dilakukan secara otomatis
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInteger = iniShort;
        long iniLong = iniInteger;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        // konversi dari double -> float -> long -> int -> short -> byte
        // di konversi manual
        double iniDouble2 = 10.5;
        float iniFloat2 = (float) iniDouble2;
        long iniLong2 = (long) iniFloat2;
        int iniInteger2 = (int) iniLong2;
        short iniShort2 = (short) iniInteger2;
        byte iniByte2 = (byte) iniShort2;
    }
}
