package it.dstech.repository;

import it.dstech.model.Authority;
import it.dstech.model.AuthorityName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Authority findByName(AuthorityName name);

}