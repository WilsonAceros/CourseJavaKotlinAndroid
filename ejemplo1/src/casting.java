public class casting {
    public static void main(String[] args) {
        // En un año ubicar 30 perritos
        // Cuantos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESIMACION
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);


        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        double c=a/b;
        System.out.println(c);

        double d= (double) a/b;
        System.out.println(d);

        char n='1';
        int nI=n;
        System.out.println(nI);

        short nS=(short) n;
        System.out.println(nS);

    }

}
