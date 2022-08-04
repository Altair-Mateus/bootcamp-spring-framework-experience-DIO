package one.digitalinnovation.gof.Facade;

import one.digitalinnovation.gof.Facade.subsistema.crm.CrmServices;
import one.digitalinnovation.gof.Facade.subsistema2.cep.ApiCep;

public class Facade {

    public void migrarCLiente(String nome, String cep)
    {
        String cidade = ApiCep.getInstancia().recuperarCidade(cep);
        String estado = ApiCep.getInstancia().recuperarEstado(cep);

        CrmServices.gravarCliente(nome, cep, cidade, estado);
    }

}
