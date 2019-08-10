package com.adi;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Insert
{
    public void add(String name, String email)
        {

        Resource r=new ClassPathResource("applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(r);

        UserDAO dao=(UserDAO)factory.getBean("d");

        User e=new User(name, email);
        dao.saveuser(e);

    }
}



package com.paytm.repo;

import com.paytm.entity.Dept;
import com.paytm.entity.Interest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


Insert into User(u_id,email,password,phone,u_name,dept_dept_id) Values ('1234','ekansh1897@gmail.com','qwerty@32','8218175643','ekansh','4321');
