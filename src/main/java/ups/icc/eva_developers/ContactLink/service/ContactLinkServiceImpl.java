package ups.icc.eva_developers.ContactLink.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ups.icc.eva_developers.ContactLink.dto.ContactLinkDetailDto;
import ups.icc.eva_developers.ContactLink.dto.ContactLinkDto;
import ups.icc.eva_developers.ContactLink.entity.ContactLink;
import ups.icc.eva_developers.ContactLink.mapper.ContactLinkMapper;
import ups.icc.eva_developers.ContactLink.repository.ContactLinkRepository;

@Service
public class ContactLinkServiceImpl implements ContactLinkService {

    private final ContactLinkRepository repository;

    public ContactLinkServiceImpl(ContactLinkRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ContactLinkDto> findByPerson(Long personId) {
        return repository.findByPersonId(personId)
                .stream()
                .map(ContactLinkMapper::toDto)
                .toList();
    }

    @Override
    public ContactLinkDetailDto findById(Long id) {

        ContactLink entity = repository.findById(id)
                .orElseThrow();

        return ContactLinkMapper.toDetailDto(entity);
    }
}