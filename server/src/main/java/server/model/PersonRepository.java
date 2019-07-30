package server.model;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository
public interface PersonRepository extends CrudRepository<Person, Long> {}
