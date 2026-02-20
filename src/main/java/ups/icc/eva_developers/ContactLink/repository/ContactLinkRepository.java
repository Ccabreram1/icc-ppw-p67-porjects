package ups.icc.eva_developers.ContactLink.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ups.icc.eva_developers.ContactLink.entity.ContactLink;

public interface ContactLinkRepository extends JpaRepository<ContactLink, Long> {

    List<ContactLink> findByPersonId(Long personId);
}