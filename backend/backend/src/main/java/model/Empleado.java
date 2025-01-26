package model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.objenesis.instantiator.annotations.Instantiator;

import java.time.LocalDate;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String numeroTelefono;
    @Column(nullable = false)
    private String telefonoEmergencia;
    @Column(nullable = false)
    private LocalDate fechaContratacion;
    @Column(nullable = false)
    private Double salario;
    @Column(name = "isActive")
    private Boolean isActive = true;
}
