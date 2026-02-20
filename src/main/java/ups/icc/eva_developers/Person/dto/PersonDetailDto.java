package ups.icc.eva_developers.Person.dto;

import java.util.List;

import ups.icc.eva_developers.ContactLink.dto.ContactLinkDto;

public class PersonDetailDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String bio;
    private String profession;
    private String location;
    private Boolean active;
    private List<ContactLinkDto> contactLinks;
    private Integer projectCount;

    public PersonDetailDto(
            Long id,
            String firstName,
            String lastName,
            String email,
            String bio,
            String profession,
            String location,
            Boolean active,
            List<ContactLinkDto> contactLinks,
            Integer projectCount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.bio = bio;
        this.profession = profession;
        this.location = location;
        this.active = active;
        this.contactLinks = contactLinks;
        this.projectCount = projectCount;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getBio() {
        return bio;
    }

    public String getProfession() {
        return profession;
    }

    public String getLocation() {
        return location;
    }

    public Boolean getActive() {
        return active;
    }

    public List<ContactLinkDto> getContactLinks() {
        return contactLinks;
    }

    public Integer getProjectCount() {
        return projectCount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setContactLinks(List<ContactLinkDto> contactLinks) {
        this.contactLinks = contactLinks;
    }

    public void setProjectCount(Integer projectCount) {
        this.projectCount = projectCount;
    }

}