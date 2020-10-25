public class Funciones {

    public static void main(String[] args) {
        double y=3;
        //Area de un circulo
        //pi * r2
        double area=circleArea(y);
        System.out.println("El area del circulo es "+area);

        //Area de una esfera
        //4*PI*r2
        System.out.println(sphereArea(y));

        //Volumen de una esfera
        //(4/3)*pi * r3
        System.out.println(sphereVolumen(y));

        //Convertir moneda
        System.out.println("Pesos a Dolares: "+converTodolar(10000,"COP"));

    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripcion: Función que especificando su moneda
     * convierte una cantidad de dinero a dolares
     *
     * @param currency Cantidadd de dinero
     * @param quantity tipo de moneda solo acepta MXN o COP
     * @return  quantity devuelve la cantidad actualizada en dolares
     *
     * */
    public static double converTodolar(double quantity, String currency){
        //PESO COP Y MXN
        switch (currency){
            case "MXN":
                quantity=quantity*0.052;
                break;
            case "COP":
                quantity=quantity*0.00026;
                break;
        }
        return quantity;
    }
}
