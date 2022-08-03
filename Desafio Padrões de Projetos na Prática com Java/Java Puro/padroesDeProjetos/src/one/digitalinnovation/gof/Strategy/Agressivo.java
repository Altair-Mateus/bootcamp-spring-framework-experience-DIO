package one.digitalinnovation.gof.Strategy;

public class Agressivo implements Comportamento{

    @Override
    public void mover()
    {
        System.out.println("Movendo-se Agressivo....");
    }
}
