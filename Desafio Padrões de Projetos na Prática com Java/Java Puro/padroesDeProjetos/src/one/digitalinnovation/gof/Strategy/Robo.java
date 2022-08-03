package one.digitalinnovation.gof.Strategy;

public class Robo {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento)
    {
        this.comportamento = comportamento;
    }// Fim do setter

    public void mover()
    {
        comportamento.mover();
    }

}
