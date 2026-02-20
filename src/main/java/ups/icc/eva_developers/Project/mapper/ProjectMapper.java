package ups.icc.eva_developers.Project.mapper;

import ups.icc.eva_developers.Project.dto.ProjectDetailDto;
import ups.icc.eva_developers.Project.dto.ProjectSummaryDto;
import ups.icc.eva_developers.Project.entity.Project;

public class ProjectMapper {

    public static ProjectSummaryDto toSummaryDto(Project project) {
        return new ProjectSummaryDto(
                project.getId(),
                project.getName(),
                project.getStatus(),
                project.getActive() == 'Y'
        );
    }

    public static ProjectDetailDto toDetailDto(Project project) {
        return new ProjectDetailDto(
                project.getId(),
                project.getName(),
                project.getDescription(),
                project.getTechnologies(),
                project.getStatus(),
                project.getCost(),
                project.getStartDate(),
                project.getEndDate(),
                project.getActive() == 'Y',
                project.getPerson() != null ? project.getPerson().getId() : null
        );
    }
}
