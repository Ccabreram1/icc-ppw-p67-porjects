package ups.icc.eva_developers.Person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ups.icc.eva_developers.Person.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByActive(Character active);

    @Modifying
    @Query("UPDATE Person p SET p.active = :active WHERE p.id = :id")
    void updateActive(@Param("id") Long id, @Param("active") Character active);
}
