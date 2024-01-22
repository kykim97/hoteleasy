package hoteleasy.domain;

import hoteleasy.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "marketingCampaigns",
    path = "marketingCampaigns"
)
public interface MarketingCampaignRepository
    extends PagingAndSortingRepository<MarketingCampaign, String> {}
