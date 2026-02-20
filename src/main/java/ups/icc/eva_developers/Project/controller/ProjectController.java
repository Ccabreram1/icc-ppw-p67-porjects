package ups.icc.eva_developers.Project.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ups.icc.eva_developers.Project.dto.ProjectDetailDto;
import ups.icc.eva_developers.Project.dto.ProjectSummaryDto;
import ups.icc.eva_developers.Project.service.ProjectService;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProjectSummaryDto> findAll(
            @RequestParam(required = false) Boolean active
    ) {
        return service.findAll(active);
    }

    @GetMapping("/{id}")
    public ProjectDetailDto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PatchMapping("/{id}/toggle-active")
    public void toggleActive(@PathVariable Long id) {
        service.toggleActive(id);
    }
}