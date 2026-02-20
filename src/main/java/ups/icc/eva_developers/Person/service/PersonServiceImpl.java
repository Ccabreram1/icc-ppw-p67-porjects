package ups.icc.eva_developers.Person.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ups.icc.eva_developers.Person.dto.PersonDetailDto;
import ups.icc.eva_developers.Person.dto.PersonProjectsDto;
import ups.icc.eva_developers.Person.dto.PersonStatusDto;
import ups.icc.eva_developers.Person.dto.PersonSummaryDto;
import ups.icc.eva_developers.Person.entity.Person;
import ups.icc.eva_developers.Person.mapper.PersonMapper;
import ups.icc.eva_developers.Person.repository.PersonRepository;
import ups.icc.eva_developers.Project.dto.ProjectWithLinkDto;
import ups.icc.eva_developers.ProjectLink.dto.ProjectLinkDto;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repository;

    public PersonServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PersonSummaryDto> findAll(Boolean activeOnly) {

        List<Person> persons;

        if (Boolean.TRUE.equals(activeOnly)) {
            persons = repository.findByActive('Y');
        } else {
            persons = repository.findAll();
        }

        return persons.stream()
                .map(PersonMapper::toSummaryDto)
                .toList();
    }

    @Override
    public PersonDetailDto findById(Long id) {

        Person person = repository.findById(id)
                .orElseThrow();

        return PersonMapper.toDetailDto(person);
    }

    @Override
    public PersonStatusDto toggleActive(Long id) {

        Person person = repository.findById(id)
                .orElseThrow();

        boolean nowActive;

        if (person.getActive() == 'S') {
            person.setActive('N');
            nowActive = false;
        } else {
            person.setActive('S');
            nowActive = true;
        }

        repository.save(person);

        String message = nowActive
                ? "Person activated successfully"
                : "Person deactivated successfully";

        return new PersonStatusDto(
                person.getId(),
                person.getFirstName(),
                person.getLastName(),
                nowActive,
                message);
    }

    @Override
    public PersonProjectsDto getPersonProjects(Long id, Double minCost) {

        Person person = repository.findById(id)
                .orElseThrow();

        boolean filterApplied = minCost != null;

        List<ProjectWithLinkDto> projects = person.getProjects() == null
                ? List.of()
                : person.getProjects().stream()
                        .filter(p -> p.getActive() == 'S')
                        .filter(p -> minCost == null || p.getCost() >= minCost)
                        .sorted((a, b) -> b.getCost().compareTo(a.getCost()))
                        .map(p -> new ProjectWithLinkDto(
                                p.getId(),
                                p.getName(),
                                p.getDescription(),
                                p.getTechnologies(),
                                p.getStatus(),
                                p.getCost(),
                                p.getStartDate(),
                                p.getEndDate(),
                                p.getProjectLink() != null
                                        ? new ProjectLinkDto(
                                                p.getProjectLink().getId(),
                                                p.getProjectLink().getName(),
                                                p.getProjectLink().getUrl())
                                        : null))
                        .toList();

        return new PersonProjectsDto(
                person.getId(),
                person.getFirstName() + " " + person.getLastName(),
                person.getActive() == 'S',
                filterApplied,
                minCost,
                projects.size(),
                projects);
    }
}