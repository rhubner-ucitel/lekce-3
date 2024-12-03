public class DatoveTypy {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        System.out.println(a);
        System.out.println(b);

        System.out.println("===== byte ====");

        byte c = 100;
        System.out.println(c);
        c = 127;
        c = -128;
        System.out.println(c);

        System.out.println("===== int ====");

        int i = 200;
        i = 0x1522;
        System.out.println(i);

        System.out.println("===== long ====");
        long l = 100_000_000_000L;
        System.out.println(l);


        System.out.println("===== double ====");
        double d = 10.0115;
        System.out.println(d);
        d = 0.1 + 0.2;
        System.out.println(d);


        System.out.println("===== float ====");
        float f = 10.1123f;
        System.out.println(f);
        f = 0.711111f + 0.2f;
        System.out.println(f);

        System.out.println("===== char ====");
        char znak = 'c';
        System.out.println(znak);
        znak = (char) (znak + 30);
        System.out.println(znak);


        System.out.println("===== String ====");
        String retezec = "hello Java";
        System.out.println(retezec);
        retezec = "Jina hodnota";
        System.out.println(retezec);


        System.out.println("===== pretypovani ====");
        int p = 128;
        byte mensi = (byte)p;
        System.out.println(mensi);

        System.out.println("===== implicitni konverze ====");
        byte im = 10;
        int ll = im;
        System.out.println(ll);


        System.out.println("===== Aritmeticke operace ====");
        i =  10 + 10;
        System.out.println(i);

        i =  10 * 10;
        System.out.println(i);

        i =  30 / 10;
        System.out.println(i);

        i =  5 / 2;
        System.out.println(i);
        System.out.println("===== Zbytek po celociselnem deleni ====");
        i =  5 % 2;
        System.out.println(i);

        System.out.println("===== Realna cisla ====");
        d = 10.1 + 10.2;
        System.out.println(d);

        int i1 = 5;
        int i2 = 2;

        double d2 = (((double)i1) / ((double)i2));
        System.out.println(d2);

        System.out.println("===== Unarni minus ====");
        i = 10 - -10;
        i = 10 - (-10);
        System.out.println(i);
        i++;
        System.out.println(i);
        i--;
        System.out.println(i);
        i += 10;
        System.out.println(i);
        i *= 10;
        System.out.println(i);

        i = 10 * 15 + 2;
        System.out.println(i);
        i = (2 + 10) * 15;
        System.out.println(i);

    }
}
