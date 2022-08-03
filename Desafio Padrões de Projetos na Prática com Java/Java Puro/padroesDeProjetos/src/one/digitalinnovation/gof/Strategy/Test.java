package one.digitalinnovation.gof.Strategy;

public class Test {

    public static void main(String[] args)
    {

        //  Testes

        Comportamento normal = new Normal();
        Comportamento defensivo = new Defensivo();
        Comportamento agressivo = new Agressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);

        robo.mover();

    }
}
