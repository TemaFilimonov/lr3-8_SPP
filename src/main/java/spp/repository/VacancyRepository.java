package spp.repository;

import spp.entity.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by admin on 23.04.2017.
 */
public interface VacancyRepository extends JpaRepository<Vacancy, Long> {

    List<Vacancy> findAllByOrderByCreationDateAsc();
    List<Vacancy> findAllByOwnerId(Long id);
    List<Vacancy> findAllByProjectId(Long id);
}
