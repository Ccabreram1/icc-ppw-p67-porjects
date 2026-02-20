package ups.icc.eva_developers.ProjectLink.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ups.icc.eva_developers.ProjectLink.entity.ProjectLink;

public interface ProjectLinkRepository extends JpaRepository<ProjectLink, Long> {

    Optional<ProjectLink> findByProjectId(Long projectId);
}