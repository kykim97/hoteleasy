package hoteleasy.domain;

import hoteleasy.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "travelAgencies",
    path = "travelAgencies"
)
public interface TravelAgencyRepository
    extends PagingAndSortingRepository<TravelAgency, String> {}
