package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Guias")
public class Guia extends Empleado{
    @Column(name = "idiomas")
    private  String idiomas;
    @Column(name = "especializacionTour")
    private String especializacionTour;
    @Column(name = "nivelEducativo")
    private String nivelEducativo;
    @Column(name = "tamanioGrupo")
    private Integer tamanioGrupo;
    @Column(name = "certificadoPrimerosAuxilios")
    private Boolean certificadoPrimerosAuxilios;
}
