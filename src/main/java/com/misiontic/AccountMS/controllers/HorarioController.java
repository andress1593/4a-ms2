package com.misiontic.AccountMS.controllers;
import com.misiontic.AccountMS.exceptions.HorarioNotFoundException;
import com.misiontic.AccountMS.models.Horario;
import com.misiontic.AccountMS.repositories.HorarioRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class HorarioController {
    private final HorarioRepository repository;

    public HorarioController(HorarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/horarios/{documento}")
    public Horario getHorario(@PathVariable String documento){
        return this.repository.findById(documento)
                .orElseThrow(() -> new HorarioNotFoundException("El profesional no esta registrado"));
    }

    @PostMapping("/horarios")
    public Horario newHorario(@RequestBody Horario horario){
        return this.repository.save(horario);
    }

    @DeleteMapping("/horarios/{documento}")
    public void deleteHorario(@PathVariable String documento){
        this.repository.deleteById(documento);

    }

    @PutMapping("/horarios/{documento}")
    public Horario updateHorario(@PathVariable  String documento, @RequestBody Horario new_horario){
        Horario old_horario = repository.findById(documento).orElse(null);
        // ESTO ACTUALIZA EL OBJETO DE JAVA
        old_horario.setNombres(new_horario.getNombres());
        old_horario.setJornada(new_horario.getJornada());
        old_horario.setHora(new_horario.getHora());
        old_horario.setFecha(new_horario.getFecha());
        // ESTO SÍ ACTUALIZA LA BASE DE DATOS
        return repository.save(old_horario);
    }


}
