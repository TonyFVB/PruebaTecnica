package com.example.PruebaTecnica.BusinessLogicInterfaces;
import com.example.PruebaTecnica.Entities.CClientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IClientes {

    public List<CClientes> ObtenerClientes();
    public List<CClientes> ObtenerClientes(int id);
    public int GuardarCliente(CClientes cliente);
    public int ActualizarCliente(CClientes cliente);
}
