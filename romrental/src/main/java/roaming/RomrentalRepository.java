package roaming;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="romrentals", path="romrentals")
public interface RomrentalRepository extends PagingAndSortingRepository<Romrental, Long>{


}
