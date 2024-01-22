package hoteleasy.domain;

import hoteleasy.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "hotelPartners",
    path = "hotelPartners"
)
public interface HotelPartnerRepository
    extends PagingAndSortingRepository<HotelPartner, String> {}
