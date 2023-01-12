package com.example.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	public User findByUserName(String userName);
	
	public User findByUserEmail(String userEmail);

    public User findByUserAge(int userAge);
    
    public List<User> findByUserAgeGreaterThan(int userAge);

    public List<User> findByUserAgeGreaterThanEqual(int userAge);

    public List<User> findByUserAgeLessThanEqual(int userAge);

    public List<User> findByUserAgeLessThan(int userAge);

    public User findByUserNameAndUserEmail(String uname,String email);

    
    public User findByUserNameOrUserEmail(String uname,String email);

//    public List<User> findByUserName,findByUserNameIs,findByUserNameEquals(String uname);
    
    public List<User> findByUserNameIs(String uname);
    
    public List<User> findByUserNameEquals(String uname);
    
    public List<User> findByUserAgeBetween(int age, int age1);
    
    public List<User> findByUserAgeAfter(int age);

    public List<User> findByUserAgeBefore(int age);

    public List<User> findByUserAgeIsNull();
    
    
    public List<User> findByUserEmailIs(String email);
    
    public List<User> findByUserEmailEquals(String email);
    
    public List<User> findByUserIdBetween(int id, int id1);
    
    public List<User> findByUserIdAfter(int age);

    public List<User> findByUserIdBefore(int age);

    public List<User> findByUserIdIsNull();


}
