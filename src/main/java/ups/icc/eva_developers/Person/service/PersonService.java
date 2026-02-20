package ups.icc.eva_developers.Person.service;

import java.util.List;

import ups.icc.eva_developers.Person.dto.PersonDetailDto;
import ups.icc.eva_developers.Person.dto.PersonProjectsDto;
import ups.icc.eva_developers.Person.dto.PersonStatusDto;
import ups.icc.eva_developers.Person.dto.PersonSummaryDto;

public interface PersonService {

    List<PersonSummaryDto> findAll(Boolean activeOnly);

    PersonDetailDto findById(Long id);

    PersonStatusDto toggleActive(Long id);   

    PersonProjectsDto getPersonProjects(Long id, Double minCost);
}