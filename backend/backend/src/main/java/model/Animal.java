package model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Animales")
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String especie;
    @Column(nullable = false)
    private String nombreComun;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTanque", nullable = false)
    private Estanque estanque;
    @Column(name = "fechaIncorporacion", nullable = false)
    private LocalDate fechaIncorporacion;
    private String color;
    @Column(name = "edadAproximada")
    private Integer edadAproximada;
    @Column(nullable = false)
    private String dieta;
    @Column(name = "requerimientosEspeciales")
    private String requerimientosEspeciales;

}
