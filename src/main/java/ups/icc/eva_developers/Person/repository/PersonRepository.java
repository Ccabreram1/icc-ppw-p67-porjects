package ups.icc.eva_developers.Person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ups.icc.eva_developers.Person.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByActive(Character active);
}
