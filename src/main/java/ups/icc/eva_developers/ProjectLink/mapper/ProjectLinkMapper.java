package ups.icc.eva_developers.ProjectLink.mapper;

import ups.icc.eva_developers.ProjectLink.dto.ProjectLinkDetailDto;
import ups.icc.eva_developers.ProjectLink.dto.ProjectLinkDto;
import ups.icc.eva_developers.ProjectLink.entity.ProjectLink;

public class ProjectLinkMapper {

    public static ProjectLinkDto toDto(ProjectLink entity) {
        return new ProjectLinkDto(
                entity.getId(),
                entity.getName(),
                entity.getUrl()
        );
    }

    public static ProjectLinkDetailDto toDetailDto(ProjectLink entity) {
        return new ProjectLinkDetailDto(
                entity.getId(),
                entity.getName(),
                entity.getUrl(),
                entity.getProject() != null ? entity.getProject().getId() : null
        );
    }
}