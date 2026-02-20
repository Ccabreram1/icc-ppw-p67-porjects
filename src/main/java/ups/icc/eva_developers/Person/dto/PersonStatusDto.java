package ups.icc.eva_developers.Person.dto;

public class PersonStatusDto {

    private Long id;
    private String firstName;
    private String lastName;
    private Boolean active;
    private String message;

    public PersonStatusDto() {
    }

    public PersonStatusDto(
            Long id,
            String firstName,
            String lastName,
            Boolean active,
            String message) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
        this.message = message;
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

    public Boolean getActive() {
        return active;
    }

    public String getMessage() {
        return message;
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

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}