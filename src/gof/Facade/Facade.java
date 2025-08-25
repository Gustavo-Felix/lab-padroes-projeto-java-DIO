package gof.Facade;

import subSistema1.crm.CrmService;
import subSistema2.cep.CepAPI;

public class Facade {

    public void migrarCliente(String name, String cep) {
        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(name, cep, cidade, estado);
    }
}
