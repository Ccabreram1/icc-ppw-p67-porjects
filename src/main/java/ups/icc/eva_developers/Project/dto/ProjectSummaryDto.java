package ups.icc.eva_developers.Project.dto;

public class ProjectSummaryDto {
    private Long id;
    private String name;
    private String status;
    private Boolean active;

    public ProjectSummaryDto() {
    }

    public ProjectSummaryDto(Long id, String name, String status, Boolean active) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.active = active;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}