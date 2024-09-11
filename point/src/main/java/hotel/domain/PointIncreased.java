package hotel.domain;

import hotel.domain.*;
import hotel.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PointIncreased extends AbstractEvent {

    private Long id;

    public PointIncreased(Pointer aggregate) {
        super(aggregate);
    }

    public PointIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
