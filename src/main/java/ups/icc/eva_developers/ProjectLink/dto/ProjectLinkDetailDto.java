package ups.icc.eva_developers.ProjectLink.dto;

public class ProjectLinkDetailDto {

    private Long id;
    private String name;
    private String url;
    private Long projectId;
    

    public ProjectLinkDetailDto() {
    }

    public ProjectLinkDetailDto(Long id, String name, String url, Long projectId) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.projectId = projectId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
    
}