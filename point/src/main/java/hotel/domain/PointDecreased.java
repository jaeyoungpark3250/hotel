package hotel.domain;

import hotel.domain.*;
import hotel.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PointDecreased extends AbstractEvent {

    private Long id;

    public PointDecreased(Pointer aggregate) {
        super(aggregate);
    }

    public PointDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
