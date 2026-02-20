package ups.icc.eva_developers.Person.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ups.icc.eva_developers.Person.dto.PersonDetailDto;
import ups.icc.eva_developers.Person.dto.PersonProjectsDto;
import ups.icc.eva_developers.Person.dto.PersonStatusDto;
import ups.icc.eva_developers.Person.dto.PersonSummaryDto;
import ups.icc.eva_developers.Person.service.PersonService;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping
    public List<PersonSummaryDto> findAll(
            @RequestParam(required = false) Boolean active) {
        return service.findAll(active);
    }

    @GetMapping("/{id}")
    public PersonDetailDto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PatchMapping("/{id}/toggle-active")
    public PersonStatusDto toggleActive(@PathVariable Long id) {
        return service.toggleActive(id);
    }

    @GetMapping("/{id}/projects")
    public PersonProjectsDto getProjects(
            @PathVariable Long id,
            @RequestParam(required = false) Double minCost) {
        return service.getPersonProjects(id, minCost);
    }
}
