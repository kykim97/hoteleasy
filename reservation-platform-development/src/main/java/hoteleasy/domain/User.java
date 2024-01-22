package hoteleasy.domain;

import hoteleasy.ReservationPlatformDevelopmentApplication;
import hoteleasy.domain.UserRegistered;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "User_table")
@Data
//<<< DDD / Aggregate Root
public class User {

    @Id
    private String name;

    private String email;

    private Password password;

    @PostPersist
    public void onPostPersist() {
        UserRegistered userRegistered = new UserRegistered(this);
        userRegistered.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static UserRepository repository() {
        UserRepository userRepository = ReservationPlatformDevelopmentApplication.applicationContext.getBean(
            UserRepository.class
        );
        return userRepository;
    }
}
//>>> DDD / Aggregate Root
