package ups.icc.eva_developers.ContactLink.service;

import java.util.List;

import ups.icc.eva_developers.ContactLink.dto.ContactLinkDetailDto;
import ups.icc.eva_developers.ContactLink.dto.ContactLinkDto;

public interface ContactLinkService {

    List<ContactLinkDto> findByPerson(Long personId);

    ContactLinkDetailDto findById(Long id);
}