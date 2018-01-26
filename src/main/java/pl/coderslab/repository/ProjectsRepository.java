package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pl.coderslab.entity.Projects;

@Repository
public interface ProjectsRepository extends JpaRepository<Projects, Long> {
	public List<Projects> findTop5ByOrderByCreatedDesc();
	@Query(value="select Count(*) from Users_Projects where projects_id = ?1", nativeQuery=true)
	public int countingByProjectId(Long id);

}
