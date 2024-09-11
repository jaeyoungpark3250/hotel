package hotel.domain;

import hotel.domain.*;
import hotel.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Reserved extends AbstractEvent {

    private Long id;
    private String useId;
    private Date reserveDt;

    public Reserved(Reservation aggregate) {
        super(aggregate);
    }

    public Reserved() {
        super();
    }
}
//>>> DDD / Domain Event
