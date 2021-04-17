import java.util.Objects;

public class Pessoa {

    private String nomeCompleto;
    private String CPF;
    private String endereco;
    private String numCartaoSUS;
    private String email;
    private String telefone;
    private String profissao;
    private String comorbidades;

    public Pessoa(String nomeCompleto, String CPF, String endereco, String numCartaoSUS, String email, String telefone, String profissao, String comorbidades) {
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.endereco = endereco;
        this.numCartaoSUS = numCartaoSUS;
        this.email = email;
        this.telefone = telefone;
        this.profissao = profissao;
        this.comorbidades = comorbidades;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumCartaoSUS() {
        return numCartaoSUS;
    }

    public void setNumCartaoSUS(String numCartaoSUS) {
        this.numCartaoSUS = numCartaoSUS;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getComorbidades() {
        return comorbidades;
    }

    public void setComorbidades(String comorbidades) {
        this.comorbidades = comorbidades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nomeCompleto, pessoa.nomeCompleto) && Objects.equals(CPF, pessoa.CPF) && Objects.equals(endereco, pessoa.endereco) && Objects.equals(numCartaoSUS, pessoa.numCartaoSUS) && Objects.equals(email, pessoa.email) && Objects.equals(telefone, pessoa.telefone) && Objects.equals(profissao, pessoa.profissao) && Objects.equals(comorbidades, pessoa.comorbidades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCompleto, CPF, endereco, numCartaoSUS, email, telefone, profissao, comorbidades);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", CPF='" + CPF + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numCartaoSUS='" + numCartaoSUS + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", profissao='" + profissao + '\'' +
                ", comorbidades='" + comorbidades + '\'' +
                '}';
    }
}
