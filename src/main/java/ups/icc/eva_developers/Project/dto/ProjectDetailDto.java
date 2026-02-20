package ups.icc.eva_developers.Project.dto;

import java.time.LocalDate;

public class ProjectDetailDto {
    private Long id;
    private String name;
    private String description;
    private String technologies;
    private String status;
    private Double cost;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean active;
    private Long personId;

    public ProjectDetailDto() {
    }

    public ProjectDetailDto(Long id, String name, String description, String technologies, String status, Double cost,
            LocalDate startDate, LocalDate endDate, Boolean active, Long personId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.technologies = technologies;
        this.status = status;
        this.cost = cost;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
        this.personId = personId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

     public Double getCost() {
         return cost;
     }

     public void setCost(Double cost) {
         this.cost = cost;
     }

     public LocalDate getStartDate() {
         return startDate;
     }

     public void setStartDate(LocalDate startDate) {
         this.startDate = startDate;
     }

     public LocalDate getEndDate() {
         return endDate;
     }

     public void setEndDate(LocalDate endDate) {
         this.endDate = endDate;
     }

     public Boolean getActive() {
         return active;
     }

     public void setActive(Boolean active) {
         this.active = active;
     }

     public Long getPersonId() {
         return personId;
     }

     public void setPersonId(Long personId) {
         this.personId = personId;
     }
}
