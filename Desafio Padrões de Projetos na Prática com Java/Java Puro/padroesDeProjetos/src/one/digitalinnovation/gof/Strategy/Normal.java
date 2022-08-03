package one.digitalinnovation.gof.Strategy;

public class Normal implements Comportamento{

    @Override
    public void mover()
    {
        System.out.println("Movendo....");
    }
}
