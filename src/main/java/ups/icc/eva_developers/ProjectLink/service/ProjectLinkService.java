package ups.icc.eva_developers.ProjectLink.service;

import java.util.Optional;

import ups.icc.eva_developers.ProjectLink.dto.ProjectLinkDetailDto;
import ups.icc.eva_developers.ProjectLink.dto.ProjectLinkDto;

public interface ProjectLinkService {

    Optional<ProjectLinkDto> findByProject(Long projectId);

    ProjectLinkDetailDto findById(Long id);
}