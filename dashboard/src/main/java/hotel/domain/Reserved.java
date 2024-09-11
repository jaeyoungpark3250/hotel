package hotel.domain;

import hotel.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class Reserved extends AbstractEvent {

    private Long id;
    private String useId;
    private Date reserveDt;
}
