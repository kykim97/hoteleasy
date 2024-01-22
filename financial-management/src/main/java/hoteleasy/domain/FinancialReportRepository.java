package hoteleasy.domain;

import hoteleasy.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "financialReports",
    path = "financialReports"
)
public interface FinancialReportRepository
    extends PagingAndSortingRepository<FinancialReport, Integer> {}
