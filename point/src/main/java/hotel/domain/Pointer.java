package hotel.domain;

import hotel.PointApplication;
import hotel.domain.PointDecreased;
import hotel.domain.PointIncreased;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Pointer_table")
@Data
//<<< DDD / Aggregate Root
public class Pointer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        PointIncreased pointIncreased = new PointIncreased(this);
        pointIncreased.publishAfterCommit();

        PointDecreased pointDecreased = new PointDecreased(this);
        pointDecreased.publishAfterCommit();
    }

    public static PointerRepository repository() {
        PointerRepository pointerRepository = PointApplication.applicationContext.getBean(
            PointerRepository.class
        );
        return pointerRepository;
    }

    //<<< Clean Arch / Port Method
    public static void increasePoint(Reserved reserved) {
        //implement business logic here:

        /** Example 1:  new item 
        Pointer pointer = new Pointer();
        repository().save(pointer);

        PointIncreased pointIncreased = new PointIncreased(pointer);
        pointIncreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(reserved.get???()).ifPresent(pointer->{
            
            pointer // do something
            repository().save(pointer);

            PointIncreased pointIncreased = new PointIncreased(pointer);
            pointIncreased.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
