package roaming;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="statechangeds", path="statechangeds")
public interface StatechangedRepository extends PagingAndSortingRepository<Statechanged, Long>{


}
