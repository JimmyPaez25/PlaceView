package com.PlaceView.Dao;

import com.PlaceView.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

}
