package sistemaeventos;

import java.sql.Date;
import java.sql.Time;

public class Atividade {
    private String titulo;
    private String descricaoAtividade;
    private Time horario; //mudar dps
    private Date data;
    private int atividadeId;

    public Atividade() {
    }

    public Atividade(String titulo, String descricaoAtividade, Time horario, Date data, int atividadeId) {
        this.titulo = titulo;
        this.descricaoAtividade = descricaoAtividade;
        this.horario = horario;
        this.data = data;
        this.atividadeId = atividadeId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricaoAtividade() {
        return descricaoAtividade;
    }

    public void setDescricaoAtividade(String descricaoAtividade) {
        this.descricaoAtividade = descricaoAtividade;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getAtividadeId() {
        return atividadeId;
    }

    public void setAtividadeId(int atividadeId) {
        this.atividadeId = atividadeId;
    }   
}
