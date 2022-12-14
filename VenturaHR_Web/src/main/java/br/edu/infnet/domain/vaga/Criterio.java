package br.edu.infnet.domain.vaga;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Criterio{

    private Integer id;
    private int vagasId;
    private String descricao;
    private int perfil;
    private int peso;
    @JsonIgnore
    private Vaga vaga;
    
    public Criterio() {
    }

    public Criterio(Integer id) {
        this.id = id;
    }

    public Criterio(Integer id, int vagasId, String descricao, int perfil, int peso) {
        this.id = id;
        this.vagasId = vagasId;
        this.descricao = descricao;
        this.perfil = perfil;
        this.peso = peso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getVagasId() {
        return vagasId;
    }

    public void setVagasId(int vagasId) {
        this.vagasId = vagasId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Criterio)) {
            return false;
        }
        Criterio other = (Criterio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.infnet.domain.vaga.Criterio[ id=" + id + " ]";
    }
    
}
