package ups.icc.eva_developers.Project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ups.icc.eva_developers.Project.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findByActive(Character active);

    List<Project> findByPersonId(Long personId);
}