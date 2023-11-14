package vibze.site.vibze.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vibze.site.vibze.entity.Person;

public interface PersonRepo extends JpaRepository<Person,Long> {
}
