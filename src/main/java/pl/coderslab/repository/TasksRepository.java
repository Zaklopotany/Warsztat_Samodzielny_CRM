package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pl.coderslab.entity.Tasks;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Long>{
	@Query(value="select Count(*) from Tasks where projects_id = ?1", nativeQuery=true)
	int countingByProjectId(Long id);
	List<Tasks> findByProjectsId(Long id);
	
	List<Tasks> findByOrderByCreatedDesc();
	

}
