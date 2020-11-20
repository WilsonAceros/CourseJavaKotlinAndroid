package model;


public class Enumerations<day> {

    enum  Day{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,
        THURSDAY,FRIDAY, SATURDAY
    }

    public static void saveValor(){
        for (Day myVar:
                Day.values ())
        {
            System.out.println (myVar);

        }
    }
}
