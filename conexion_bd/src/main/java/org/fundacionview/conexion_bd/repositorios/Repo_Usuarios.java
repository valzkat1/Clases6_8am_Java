package org.fundacionview.conexion_bd.repositorios;

import org.fundacionview.conexion_bd.modelos.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo_Usuarios extends JpaRepository<Usuarios, Integer>{

	// C R U D 
	
}
