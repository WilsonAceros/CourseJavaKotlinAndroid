public class IncrementDecrement {

    public static void main(String[] args) {
        var live=5;
        System.out.println(live);

        live--; //Decremento
        System.out.println(live);

        live++; //Incremento
        System.out.println(live);

        //Prefija
        //Gana un regalo por ganar una vida
        int gift=100+ ++live;//prefijo
        System.out.println(gift);
    }
}
