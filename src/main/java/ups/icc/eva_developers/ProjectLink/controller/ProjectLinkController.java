package ups.icc.eva_developers.ProjectLink.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ups.icc.eva_developers.ProjectLink.dto.ProjectLinkDetailDto;
import ups.icc.eva_developers.ProjectLink.dto.ProjectLinkDto;
import ups.icc.eva_developers.ProjectLink.service.ProjectLinkService;

@RestController
@RequestMapping("/api/project-links")

public class ProjectLinkController {

    private final ProjectLinkService service;

    public ProjectLinkController(ProjectLinkService service) {
        this.service = service;
    }

    @GetMapping("/project/{projectId}")
    public Optional<ProjectLinkDto> getByProject(@PathVariable Long projectId) {
        return service.findByProject(projectId);
    }

    @GetMapping("/{id}")
    public ProjectLinkDetailDto findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
