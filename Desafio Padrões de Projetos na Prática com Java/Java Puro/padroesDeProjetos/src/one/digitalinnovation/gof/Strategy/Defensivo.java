package one.digitalinnovation.gof.Strategy;

public class Defensivo implements Comportamento{

    @Override
    public void mover()
    {
        System.out.println("Movendo-se defensivamente....");
    }
}
