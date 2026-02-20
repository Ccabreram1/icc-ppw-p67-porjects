package ups.icc.eva_developers.Project.service;

import java.util.List;

import ups.icc.eva_developers.Project.dto.ProjectDetailDto;
import ups.icc.eva_developers.Project.dto.ProjectSummaryDto;

public interface ProjectService {

    List<ProjectSummaryDto> findAll(Boolean activeOnly);

    ProjectDetailDto findById(Long id);

    void toggleActive(Long id);
}