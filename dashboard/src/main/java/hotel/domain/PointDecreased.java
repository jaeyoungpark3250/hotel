package hotel.domain;

import hotel.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class PointDecreased extends AbstractEvent {

    private Long id;
}
