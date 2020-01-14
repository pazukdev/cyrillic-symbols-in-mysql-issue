package com.pazukdev.cyrillicsymbolsinmysqlissue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Siarhei Sviarkaltsau
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
