package course.dao;

import course.domain.Responded;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by admin on 23.04.2017.
 */
public interface RespondedRepository extends JpaRepository<Responded, Long> {
}
