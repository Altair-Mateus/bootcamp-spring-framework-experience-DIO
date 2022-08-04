package one.digitalinnovation.gof.Facade.subsistema2.cep;



public class ApiCep {

    private static ApiCep instancia = new ApiCep();

    private ApiCep()
    {
        super();
    }

    public static ApiCep getInstancia()
    {
        return instancia;
    }

    public String recuperarCidade(String cep)
    {
        return "Porto Alegre";
    }

    public String recuperarEstado(String cep)
    {
        return "RS";
    }

}
