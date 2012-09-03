package action.test;

import com.bruce.mvc.ActionSupport;
import com.bruce.mvc.FormBean;
import com.bruce.util.basedao.FacadeProxy;

import dao.hbn.UserDao;
import vo.User;

@FormBean("user")
public class HibernateCreateUser extends ActionSupport
{
	private User user;
	
	@Override
	public String execute() throws Exception
	{
		UserDao dao = FacadeProxy.getManualCommitProxy(UserDao.class);
		dao.createUser(user);
		
		return SUCCESS;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}
	
}
