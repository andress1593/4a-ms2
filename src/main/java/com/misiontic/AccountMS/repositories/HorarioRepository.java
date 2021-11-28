package com.misiontic.AccountMS.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.misiontic.AccountMS.models.Horario;

public interface HorarioRepository extends MongoRepository<Horario, String> {

}
