package ups.icc.eva_developers.Project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ups.icc.eva_developers.Project.dto.ProjectDetailDto;
import ups.icc.eva_developers.Project.dto.ProjectSummaryDto;
import ups.icc.eva_developers.Project.entity.Project;
import ups.icc.eva_developers.Project.mapper.ProjectMapper;
import ups.icc.eva_developers.Project.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository repository;

    public ProjectServiceImpl(ProjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProjectSummaryDto> findAll(Boolean activeOnly) {

        List<Project> projects;

        if (Boolean.TRUE.equals(activeOnly)) {
            projects = repository.findByActive('Y');
        } else {
            projects = repository.findAll();
        }

        return projects.stream()
                .map(ProjectMapper::toSummaryDto)
                .toList();
    }

    @Override
    public ProjectDetailDto findById(Long id) {

        Project project = repository.findById(id)
                .orElseThrow();

        return ProjectMapper.toDetailDto(project);
    }

    @Override
    public void toggleActive(Long id) {

        Project project = repository.findById(id)
                .orElseThrow();

        project.setActive(project.getActive() == 'Y' ? 'N' : 'Y');
        repository.save(project);
    }
}