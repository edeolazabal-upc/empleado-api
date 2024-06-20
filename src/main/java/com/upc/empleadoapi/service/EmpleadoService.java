package com.upc.empleadoapi.service;

import com.upc.empleadoapi.model.Empleado;
import com.upc.empleadoapi.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;

    public List<Empleado> listAll() {
        return empleadoRepository.findAll();
    }
    public Empleado insert(Empleado nuevoEmpleado) {
        return empleadoRepository.save(nuevoEmpleado);
    }

}
