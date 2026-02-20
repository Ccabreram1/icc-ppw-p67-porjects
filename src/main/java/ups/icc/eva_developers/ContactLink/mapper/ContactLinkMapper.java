package ups.icc.eva_developers.ContactLink.mapper;

import ups.icc.eva_developers.ContactLink.dto.ContactLinkDetailDto;
import ups.icc.eva_developers.ContactLink.dto.ContactLinkDto;
import ups.icc.eva_developers.ContactLink.entity.ContactLink;

public class ContactLinkMapper {

    public static ContactLinkDto toDto(ContactLink entity) {
        return new ContactLinkDto(
                entity.getId(),
                entity.getName(),
                entity.getUrl()
        );
    }

    public static ContactLinkDetailDto toDetailDto(ContactLink entity) {
        return new ContactLinkDetailDto(
                entity.getId(),
                entity.getName(),
                entity.getUrl(),
                entity.getPerson() != null ? entity.getPerson().getId() : null
        );
    }
}