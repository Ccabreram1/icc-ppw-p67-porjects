package ups.icc.eva_developers.Project.dto;

import java.time.LocalDate;

import ups.icc.eva_developers.ProjectLink.dto.ProjectLinkDto;

public class ProjectWithLinkDto {

    private Long id;
    private String name;
    private String description;
    private String technologies;
    private String status;
    private Double cost;
    private LocalDate startDate;
    private LocalDate endDate;
    private ProjectLinkDto projectLink;

    public ProjectWithLinkDto(
            Long id,
            String name,
            String description,
            String technologies,
            String status,
            Double cost,
            LocalDate startDate,
            LocalDate endDate,
            ProjectLinkDto projectLink) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.technologies = technologies;
        this.status = status;
        this.cost = cost;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectLink = projectLink;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTechnologies() {
        return technologies;
    }

    public String getStatus() {
        return status;
    }

    public Double getCost() {
        return cost;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public ProjectLinkDto getProjectLink() {
        return projectLink;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setProjectLink(ProjectLinkDto projectLink) {
        this.projectLink = projectLink;
    }
    
}