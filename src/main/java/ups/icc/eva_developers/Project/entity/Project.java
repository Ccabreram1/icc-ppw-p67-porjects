package ups.icc.eva_developers.Project.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import ups.icc.eva_developers.Person.entity.Person;
import ups.icc.eva_developers.ProjectLink.entity.ProjectLink;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(length = 1000)
    private String description;

    private String technologies;

    private String status;

    private Double cost;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(nullable = false)
    private Character active;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @OneToOne(mappedBy = "project", fetch = FetchType.LAZY)
    private ProjectLink projectLink;


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

    public String getTechnologies() {
        return technologies;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getStatus() {
        return status;
    }

    public Double getCost() {
        return cost;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Character getActive() {
        return active;
    }

    public void setActive(Character active) {
        this.active = active;
    }

    public Person getPerson() {
        return person;
    }

    public ProjectLink getProjectLink() {
        return projectLink;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setProjectLink(ProjectLink projectLink) {
        this.projectLink = projectLink;
    }
}