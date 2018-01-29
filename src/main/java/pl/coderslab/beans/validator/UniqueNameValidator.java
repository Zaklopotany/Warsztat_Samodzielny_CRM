package pl.coderslab.beans.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import pl.coderslab.entity.Users;
import pl.coderslab.repository.UsersRepository;

public class UniqueNameValidator implements ConstraintValidator<UniqueName, String> {
	@Autowired
	UsersRepository userRep;

	@Override
	public void initialize(UniqueName username) {
	}

	@Override
	public boolean isValid(String login, ConstraintValidatorContext arg1) {

		try {
			Users tempUser = new Users();
			tempUser = userRep.findOneByLogin(login);

			if (tempUser.getId() > 0) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
		}
		return true;

	}

}
