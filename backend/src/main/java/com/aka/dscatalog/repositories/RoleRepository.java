package com.aka.dscatalog.repositories;

import com.aka.dscatalog.entities.Category;
import com.aka.dscatalog.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
