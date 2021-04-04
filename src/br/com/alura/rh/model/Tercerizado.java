package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Tercerizado extends  Funcionario{

    private String empresa;

    public Tercerizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        super(nome, cpf, cargo, salario);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
