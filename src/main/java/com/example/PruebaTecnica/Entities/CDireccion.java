package com.example.PruebaTecnica.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "DIRECCION")
public class CDireccion {

    @Id
    @Column(name = "CODIGO", nullable = false)
    private int CODIGO;

    @Column(name = "DESCRIPCION", nullable = false, length = 200)
    private String DESCRIPCION;

    @Column(name = "CODIGO_CLIENTE", nullable = false)
    private int CODIGO_CLIENTE;

    public CDireccion() {
    }
    public CDireccion(int codigo, String descrpcion, int codigo_cliente) {
        this.CODIGO = codigo;
        this.DESCRIPCION = descrpcion;
        this.CODIGO_CLIENTE = codigo_cliente;
    }
    public int getCODIGO() {
        return CODIGO;
    }
    public void setCODIGO(int CODIGO) {
        this.CODIGO = CODIGO;
    }
    public String getDESCRIPCION() {
        return DESCRIPCION;
    }
    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }
    public int getCODIGO_CLIENTE() {
        return CODIGO_CLIENTE;
    }
    public void setCODIGO_CLIENTE(int CODIGO_CLIENTE) {
        this.CODIGO_CLIENTE = CODIGO_CLIENTE;
    }


}
