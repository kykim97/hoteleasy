package hoteleasy.domain;

import hoteleasy.FinancialManagementApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FinancialReport_table")
@Data
//<<< DDD / Aggregate Root
public class FinancialReport {

    @Id
    private Integer year;

    private Integer month;

    private Money revenue;

    public static FinancialReportRepository repository() {
        FinancialReportRepository financialReportRepository = FinancialManagementApplication.applicationContext.getBean(
            FinancialReportRepository.class
        );
        return financialReportRepository;
    }
}
//>>> DDD / Aggregate Root
