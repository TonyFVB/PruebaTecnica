package com.example.PruebaTecnica.Controllers;
import com.example.PruebaTecnica.Entities.CClientes;
import com.example.PruebaTecnica.BusinessLogicInterfaces.IClientes;
import com.example.PruebaTecnica.ValidateModel.ValidateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Cliente")
public class ClienteController {
    @Autowired
    private IClientes clientes;
    @GetMapping("/ObtenerListaClientes")
    public ResponseEntity<List<CClientes>> ObtenerListaClientes() {

        return new ResponseEntity<>(clientes.ObtenerClientes(), HttpStatus.OK);
    }
    @GetMapping("/ObtenerCliente/{id}")
    public ResponseEntity<List<CClientes>> ObtenerCliente(@PathVariable int id){

        return new ResponseEntity<>(clientes.ObtenerClientes(id), HttpStatus.OK);
    }

    @PostMapping("/AgregarCliente")
    public ResponseEntity<ValidateModel> AgregarCliente(CClientes model) {
        ValidateModel validate = new ValidateModel();
        int resultado = clientes.GuardarCliente(model);
        if (resultado == 1) {
            validate.setMessage("El registro ha guardado satisfacctoriamente.");
        }
        return new ResponseEntity<>(validate, HttpStatus.OK);
    }
    @PutMapping("/ActualizarCliente")
    public ResponseEntity<ValidateModel> ActualizarCliente(CClientes model) {
        ValidateModel validate = new ValidateModel();
        int resultado = clientes.ActualizarCliente(model);
        if (resultado == 1) {
            validate.setMessage("El registro ha modificado satisfacctoriamente.");
        }
        return new ResponseEntity<>(validate, HttpStatus.OK);
    }

}



