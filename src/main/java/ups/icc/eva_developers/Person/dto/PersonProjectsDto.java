package ups.icc.eva_developers.Person.dto;


import java.util.List;

import ups.icc.eva_developers.Project.dto.ProjectWithLinkDto;

public class PersonProjectsDto {

    private Long personId;
    private String personName;
    private Boolean active;
    private Boolean filterApplied;
    private Double minCost;
    private Integer projectCount;
    private List<ProjectWithLinkDto> projects;

    public PersonProjectsDto(
            Long personId,
            String personName,
            Boolean active,
            Boolean filterApplied,
            Double minCost,
            Integer projectCount,
            List<ProjectWithLinkDto> projects) {
        this.personId = personId;
        this.personName = personName;
        this.active = active;
        this.filterApplied = filterApplied;
        this.minCost = minCost;
        this.projectCount = projectCount;
        this.projects = projects;
    }

    public Long getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public Boolean getActive() {
        return active;
    }

    public Boolean getFilterApplied() {
        return filterApplied;
    }

    public Double getMinCost() {
        return minCost;
    }

    public Integer getProjectCount() {
        return projectCount;
    }

    public List<ProjectWithLinkDto> getProjects() {
        return projects;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setFilterApplied(Boolean filterApplied) {
        this.filterApplied = filterApplied;
    }

    public void setMinCost(Double minCost) {
        this.minCost = minCost;
    }

    public void setProjectCount(Integer projectCount) {
        this.projectCount = projectCount;
    }

    public void setProjects(List<ProjectWithLinkDto> projects) {
        this.projects = projects;
    }
    
}