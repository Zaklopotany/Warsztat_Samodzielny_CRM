package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pl.coderslab.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
/*	@Query("Select Count(u) from Users u where projects =:project")
	int getCount (@Param("project") Projects project);
*/
	
	@Query(value="Select p.* from Users p inner join Users_Projects up on p.id = up.users_id where up.projects_id = ?1", nativeQuery=true)
	List<Users> getProjectUsers(Long id);

	Users findOneByLogin(String login);
	Users findOneById(Long id);
	Users findOneByLoginAndPassword(String login, String password);

}
