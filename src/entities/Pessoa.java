package entities;

public class Pessoa {
    private static int countPessoa = 1;

    private String nome;
    private String CPF;
    private String email;

    public Pessoa(String nome, String CPF, String email) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        countPessoa += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "\nNome: " + getNome() +
                "\nCPF: " + getCPF() +
                "\nEmail: " + getEmail();
    }
}
