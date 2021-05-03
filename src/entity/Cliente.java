package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cliente", schema = "cliente-datos", catalog = "")
public class Cliente {
    private Integer idCliente;
    private String nombre;
    private String apellido;
    private Integer edad;
    private Datos datosByIdCliente;

    @Id
    @Column(name = "id_cliente")
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "apellido")
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Basic
    @Column(name = "edad")
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente that = (Cliente) o;
        return Objects.equals(idCliente, that.idCliente) &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(apellido, that.apellido) &&
                Objects.equals(edad, that.edad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nombre, apellido, edad);
    }

    @OneToOne(mappedBy = "clienteByIdCliente")
    public Datos getDatosByIdCliente() {
        return datosByIdCliente;
    }

    public void setDatosByIdCliente(Datos datosByIdCliente) {
        this.datosByIdCliente = datosByIdCliente;
    }
}
