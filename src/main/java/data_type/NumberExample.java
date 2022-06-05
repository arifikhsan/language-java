package data_type;

@SuppressWarnings("unused")
public class NumberExample {
    public static void main(String[] args) {
        byte iniByte = 100;
        short iniShort = 200;
        int iniInt = 300;
        long iniLong = 400;
        long iniLong2 = 400L;

        float iniFloat = 500.5f;
        double iniDouble = 600.6;
        double iniDouble2 = 600.6d;

        int iniDecimal = 7;
        int iniHexadecimal = 0x7F;
        int iniBinaryDecimal = 0b01111111;

        long iniMillion = 1_000_000_000;
        long iniSejuta = 1_0__0____0____0_____0_______0;
        System.out.println(iniSejuta);
    }
}
