package br.com.alura.rh.service.promocao;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.service.ValidacaoException;

public class PromocaoService {
    public void promover(Funcionario funcionario, boolean metaBatida){
        Cargo cargoAtual = funcionario.getCargo();
        if(Cargo.GERENTE == cargoAtual){
            throw new ValidacaoException("Gerente não pode ser promovidos");
        }
        if(metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        }
    }
}
