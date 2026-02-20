package ups.icc.eva_developers.ContactLink.dto;

public class ContactLinkDetailDto {

    private Long id;
    private String name;
    private String url;
    private Long personId;
    

    public ContactLinkDetailDto() {
    }

    public ContactLinkDetailDto(Long id, String name, String url, Long personId) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.personId = personId;
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

    public Long getPersonId() {
        return personId;
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

    public void setPersonId(Long personId) {
        this.personId = personId;
    }
    
}