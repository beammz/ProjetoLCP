package classes;

public class Pessoa {
   private String nome;
   private String usuario;
   private boolean statusPagamento;
   private boolean pessoaTipo;
   private int pessoaId;
   private String email;
   private String senha;
   private String telefone;

    public Pessoa() {
    }

    
   public Pessoa(String nome, String usuario, boolean statusPagamento, boolean pessoaTipo, int pessoaId, String email, String senha, String telefone) {
        this.nome = nome;
        this.usuario = usuario;
        this.statusPagamento = statusPagamento;
        this.pessoaTipo = pessoaTipo;
        this.pessoaId = pessoaId;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public boolean isPessoaTipo() {
        return pessoaTipo;
    }

    public void setPessoaTipo(boolean pessoaTipo) {
        this.pessoaTipo = pessoaTipo;
    }

    public int getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(int pessoaId) {
        this.pessoaId = pessoaId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   
}
