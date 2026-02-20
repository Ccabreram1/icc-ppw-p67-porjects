package ups.icc.eva_developers.ContactLink.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ups.icc.eva_developers.ContactLink.dto.ContactLinkDetailDto;
import ups.icc.eva_developers.ContactLink.dto.ContactLinkDto;
import ups.icc.eva_developers.ContactLink.service.ContactLinkService;

@RestController
@RequestMapping("/api/contact-links")
public class ContactLinkController {

    private final ContactLinkService service;

    public ContactLinkController(ContactLinkService service) {
        this.service = service;
    }

    @GetMapping("/person/{personId}")
    public List<ContactLinkDto> getByPerson(@PathVariable Long personId) {
        return service.findByPerson(personId);
    }

    @GetMapping("/{id}")
    public ContactLinkDetailDto findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
