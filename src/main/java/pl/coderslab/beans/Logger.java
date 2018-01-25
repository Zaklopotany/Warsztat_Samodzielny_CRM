package pl.coderslab.beans;

import javax.servlet.http.HttpSession;

public interface Logger {
	public void log(HttpSession session, Object object);

}
