package org.fundacionview.proyectoweb.repositorios;

import org.fundacionview.proyectoweb.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo_Usuarios extends JpaRepository<Usuario, Integer>{

	
	@Query(value = "FROM Usuario u WHERE username=:user AND clave=:clave")
	public Usuario getLogin(@Param("user") String usernam,@Param("clave")String clave);
	
}
