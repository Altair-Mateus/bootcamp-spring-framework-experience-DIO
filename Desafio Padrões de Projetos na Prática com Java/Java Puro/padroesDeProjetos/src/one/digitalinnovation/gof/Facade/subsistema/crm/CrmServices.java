package one.digitalinnovation.gof.Facade.subsistema.crm;

public class CrmServices {

    private CrmServices()
    {
        super();
    }

    public static void gravarCliente(String nome, String cep, String estado, String cidade)
    {
        System.out.println("Cliente cadastrado no CRM");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(estado);
        System.out.println(cidade);
    }

}
