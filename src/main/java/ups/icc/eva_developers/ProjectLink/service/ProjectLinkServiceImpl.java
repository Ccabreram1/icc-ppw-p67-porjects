package ups.icc.eva_developers.ProjectLink.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ups.icc.eva_developers.ProjectLink.dto.ProjectLinkDetailDto;
import ups.icc.eva_developers.ProjectLink.dto.ProjectLinkDto;
import ups.icc.eva_developers.ProjectLink.entity.ProjectLink;
import ups.icc.eva_developers.ProjectLink.mapper.ProjectLinkMapper;
import ups.icc.eva_developers.ProjectLink.repository.ProjectLinkRepository;

@Service
public class ProjectLinkServiceImpl implements ProjectLinkService {

    private final ProjectLinkRepository repository;

    public ProjectLinkServiceImpl(ProjectLinkRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<ProjectLinkDto> findByProject(Long projectId) {
        return repository.findByProjectId(projectId)
                .map(ProjectLinkMapper::toDto);
    }

    @Override
    public ProjectLinkDetailDto findById(Long id) {

        ProjectLink entity = repository.findById(id)
                .orElseThrow();

        return ProjectLinkMapper.toDetailDto(entity);
    }
}
