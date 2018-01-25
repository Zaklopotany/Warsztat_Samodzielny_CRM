package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.coderslab.entity.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long>{
	List<Activity> findTop25ByOrderByCreatedDesc();
}
