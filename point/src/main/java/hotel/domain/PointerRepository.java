package hotel.domain;

import hotel.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "pointers", path = "pointers")
public interface PointerRepository
    extends PagingAndSortingRepository<Pointer, Long> {}
