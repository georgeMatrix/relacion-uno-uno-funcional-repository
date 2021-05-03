package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Datos {
    private Integer idCliente;
    private String direccion;
    private String telefono;
    private Cliente clienteByIdCliente;

    @Id
    @Column(name = "id_cliente")
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Basic
    @Column(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Datos datos = (Datos) o;
        return Objects.equals(idCliente, datos.idCliente) &&
                Objects.equals(direccion, datos.direccion) &&
                Objects.equals(telefono, datos.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, direccion, telefono);
    }

    @OneToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", nullable = false)
    public Cliente getClienteByIdCliente() {
        return clienteByIdCliente;
    }

    public void setClienteByIdCliente(Cliente clienteByIdCliente) {
        this.clienteByIdCliente = clienteByIdCliente;
    }
}
