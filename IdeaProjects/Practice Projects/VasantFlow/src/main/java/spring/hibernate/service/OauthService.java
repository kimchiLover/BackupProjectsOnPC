package spring.hibernate.service;

import org.springframework.orm.hibernate5.HibernateTemplate;
import java.util.List;
import spring.hibernate.pojo.User;

public class OauthService {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public boolean findUser(String uname,String upwd)
    {
        boolean isValidUser = false;
        String mySqlQuery = "FROM User u WHERE u.name=? AND u.password=?";

        List<User> userObj = (List<User>) getHibernateTemplate().find//.find(mySqlQuery,uname,upwd);

        if(userObj != null)
        {
            isValidUser = true;
            System.out.println("Id= "+userObj.get(0).getId()+", Name= "+userObj.get(0).getName()+", Password= "+userObj.get(0).getPassword());
        }
        return isValidUser;
    }
}
