package com.adi;

import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.ArrayList;
import java.util.List;

public class UserDAO
{
    HibernateTemplate template;

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
    //method to save employee
    public void saveuser(User e){
        template.save(e);
    }
    //method to update employee
    public void updateuser(User e){
        template.update(e);
    }
    //method to delete employee
    public void deleteuser(User e){
        template.delete(e);
    }
    //method to return one employee of given id
    public User getById(int id){
        User e=(User) template.get(User.class,id);
        return e;
    }
    //method to return all employees
    public List<User> getuser(){
        List<User> list=new ArrayList<User>();
        return template.loadAll(User.class);
    }
}
