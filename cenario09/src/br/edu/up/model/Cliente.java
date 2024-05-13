package br.edu.up.model;

public abstract class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private double vlrMaxCredito;
    private double vlrEmprestado;

    public Cliente(String nome, String telefone, String email, double vlrMaxCredito){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

        this.vlrMaxCredito = vlrMaxCredito;
        this.vlrEmprestado = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getVlrMaxCredito() {
        return vlrMaxCredito;
    }

    public void setVlrMaxCredito(double vlrMaxCredito) {
        this.vlrMaxCredito = vlrMaxCredito;
    }

    public double getVlrEmprestado() {
        return vlrEmprestado;
    }

    public void setVlrEmprestado(double vlrEmprestado) {
        this.vlrEmprestado = vlrEmprestado;
    }

    public void emprestar(double valor) throws Exception {
        if((getVlrEmprestado() + valor) <= getVlrMaxCredito()){
            setVlrEmprestado(getVlrEmprestado() + valor);
        } else {
            throw new Exception("Valor disponível maior que permitido!");
        }
    }

    public double devolver(double valor){
        if(getVlrEmprestado() < valor){
            throw new IllegalArgumentException("Valor a devolver maior do que o valor emprestado!");
        }

        setVlrEmprestado(getVlrEmprestado() - valor);
        return getVlrEmprestado();
    }
}
