package model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Estanques")
public class Estanque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private Double capacidad;
    @Column(nullable = false)
    private Double temperatura;
    @Column(nullable = false)
    private Double pH;
    @Column(name = "ultimoMantenimiento", nullable = false)
    private LocalDateTime ultimoMantenimiento;
    @Column(name = "numeroAnimales", nullable = false)
    private Integer numeroAnimales;
    @Enumerated(EnumType.STRING);
    @Column(nullable = false)
    private tipoEstanque tipo;
    @Enumerated(EnumType.STRING);
    @Column(nullable = false)
    private estadoTanque estado;
    @ManyToOne(FetchType.LAZY)
    @JoinColumn(name = "idAquario", nullable = false)
    private Acuario acuario;


}
