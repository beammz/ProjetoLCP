package sistemaeventos;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author beama
 */
public class Evento {
    private String nomeEvento;
    private String descricaoEvento;
    private Time horario;
    private Date dataInicio;
    private Date dataFim;

    public Evento() {
    }

    public Evento(String nomeEvento, String descricaoEvento, Time horario, Date dataInicio, Date dataFim) {
        this.nomeEvento = nomeEvento;
        this.descricaoEvento = descricaoEvento;
        this.horario = horario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    
}


