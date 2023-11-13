package com.crud263.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud263.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}