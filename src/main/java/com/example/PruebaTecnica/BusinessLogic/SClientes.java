package com.example.PruebaTecnica.BusinessLogic;
import com.example.PruebaTecnica.BusinessLogicInterfaces.IClientes;
import com.example.PruebaTecnica.Entities.CClientes;
import org.hibernate.annotations.processing.SQL;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SClientes implements IClientes{

    private JdbcTemplate jdbcTemplate;

    private String consulta = "";
    @Override
    public List<CClientes> ObtenerClientes() {
        consulta = "SELECT * FROM CLIENTE ";
        return jdbcTemplate.query(consulta, BeanPropertyRowMapper.newInstance(CClientes.class));
    }

    @Override
    public List<CClientes> ObtenerClientes(int id) {
    consulta = "SELECT * FROM CLIENTE WHERE ID = " + id;
    return jdbcTemplate.query(consulta,BeanPropertyRowMapper.newInstance(CClientes.class));
    }

    @Override
    public int GuardarCliente(CClientes cliente) {
        consulta = "INSERT INTO CLIENTE VALUES(?,?)";
        return jdbcTemplate.update(consulta, new Object[]{cliente.getNombre(), cliente.getApellido()});
    }

    @Override
    public int ActualizarCliente(CClientes cliente) {
        consulta = "UPDATE CLIENTE SET nombre = ?, apellido = ? WHERE ID = ?";
        return jdbcTemplate.update(consulta, new Object[]{cliente.getNombre(), cliente.getApellido()});
    }

}
