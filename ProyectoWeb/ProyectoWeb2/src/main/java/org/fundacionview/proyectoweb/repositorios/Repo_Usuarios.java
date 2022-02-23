package org.fundacionview.proyectoweb.repositorios;

import org.fundacionview.proyectoweb.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo_Usuarios extends JpaRepository<Usuario, Integer>{

}
