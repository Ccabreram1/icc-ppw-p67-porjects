package ups.icc.eva_developers.Person.mapper;

import java.util.List;

import ups.icc.eva_developers.ContactLink.dto.ContactLinkDto;
import ups.icc.eva_developers.ContactLink.mapper.ContactLinkMapper;
import ups.icc.eva_developers.Person.dto.PersonDetailDto;
import ups.icc.eva_developers.Person.dto.PersonSummaryDto;
import ups.icc.eva_developers.Person.entity.Person;

public class PersonMapper {

    public static PersonSummaryDto toSummaryDto(Person person) {

        List<ContactLinkDto> links = person.getContactLinks() == null
                ? List.of()
                : person.getContactLinks()
                        .stream()
                        .map(ContactLinkMapper::toDto)
                        .toList();

        int projectCount = person.getProjects() == null
                ? 0
                : (int) person.getProjects()
                        .stream()
                        .filter(p -> p.getActive() == 'S')
                        .count();

        return new PersonSummaryDto(
                person.getId(),
                person.getFirstName(),
                person.getLastName(),
                person.getProfession(),
                person.getLocation(),
                person.getActive() == 'S',
                links,
                projectCount);
    }

    public static PersonDetailDto toDetailDto(Person person) {

        List<ContactLinkDto> links = person.getContactLinks() == null
                ? List.of()
                : person.getContactLinks()
                        .stream()
                        .map(ContactLinkMapper::toDto)
                        .toList();

        int projectCount = person.getProjects() == null
                ? 0
                : (int) person.getProjects()
                        .stream()
                        .filter(p -> p.getActive() == 'S')
                        .count();

        return new PersonDetailDto(
                person.getId(),
                person.getFirstName(),
                person.getLastName(),
                person.getEmail(),
                person.getBio(),
                person.getProfession(),
                person.getLocation(),
                person.getActive() == 'S',
                links,
                projectCount);
    }
}