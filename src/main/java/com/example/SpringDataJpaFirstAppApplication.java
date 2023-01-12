package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.Model.User;
import com.example.Repository.UserRepository;

@SpringBootApplication
public class SpringDataJpaFirstAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaFirstAppApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
	
//single data insert:-		
		
//		User user=new User();
//		user.setUserId(6);
//		user.setUserName("Nimrit");
//		user.setUserEmail("nimrit@gmail.com");
//		user.setUserAge(28);
//		userRepository.save(user);
//	
//single data update:-		
//		User user1=new User();
//		user1.setUserId(2);
//		user1.setUserName("Rubina");
//		user1.setUserEmail("rubina@gmail.com");
//		user1.setUserAge(32);
//		userRepository.save(user1);          //save() perform both operations like save and update if record not present then save the data else update the data using primary key
	
		
//Multiple records insert:-	
//		User user1=new User();
//		user1.setUserName("Shiv");
//		user1.setUserEmail("shiv@gmail.com");
//		user1.setUserAge(28);
//	
//		User user2=new User();
//		user2.setUserName("Rubina");
//		user2.setUserEmail("rubina@gmail.com");
//		user2.setUserAge(32);
//		
//		User user3=new User();
//		user3.setUserName("Archana");
//		user3.setUserEmail("archana@gmail.com");
//		user3.setUserAge(27);
//		
//		List<User> list=new ArrayList();
//		list.add(user1);
//		list.add(user2);
//		list.add(user3);
//		
//		userRepository.saveAll(list);
		
//Multiple data Update:-		
//		User user1=new User();
//		user1.setUserId(3);
//		user1.setUserName("Shiv");
//		user1.setUserEmail("shiv@gmail.com");
//		user1.setUserAge(29);
//	
//		User user2=new User();
//		user2.setUserId(4);
//		user2.setUserName("Ankit");
//		user2.setUserEmail("ankit@gmail.com");
//		user2.setUserAge(28);
//		
//		User user3=new User();
//		user3.setUserId(5);
//		user3.setUserName("Tina");
//		user3.setUserEmail("tina@gmail.com");
//		user3.setUserAge(25);
//		
//		List<User> list=new ArrayList();
//		list.add(user1);
//		list.add(user2);
//		list.add(user3);
//		
//		userRepository.saveAll(list);
		
	
//get single data from database:-
//		User user=userRepository.findById(2).get();
//		System.out.println(user);
		
//get multiple data from database:-
//		List<User> findall=(List<User>) userRepository.findAll();
//		System.out.println(findall);
//		for(User user1:findall)
//		{
//			System.out.println(user1);
//		}
		
//get multiple data using primary key:-
//		List<Integer> list = Arrays.asList(1,4,6,2);
//		Iterable<User> findAllById = userRepository.findAllById(list);
//		System.out.println(findAllById);
//		for(User user2:findAllById)
//			{
//				System.out.println(user2);
//			}
		
		
//Particular data available or not check in database:-		
//		boolean existsById = userRepository.existsById(5);
//		System.out.println(existsById);
		
		
//count how many values are available in database:-
//		long count = userRepository.count();
//		System.out.println(count);
		
		
		
//delete single record by id:-
//		userRepository.deleteById(6);
		
//delete single record by object:-
//		User user=new User();
//		user.setUserId(5);
//		userRepository.delete(user);
		
//delete Multiple records:-
//		List<Integer> list=Arrays.asList(3,4);
//		userRepository.deleteAllById(list);
		
		
//delete all data:-
//		userRepository.deleteAll();
		
		
//get unique data:-
//		Optional<User> findById = userRepository.findById(8);
//		System.out.println(findById);
		
//		User user = userRepository.findByUserName("Rubina");
//		System.out.println(user);
		
//		User user = userRepository.findByUserEmail("rubina@gmail.com");
//		System.out.println(user);
		
//		User user = userRepository.findByUserAge(28);
//		System.out.println(user);
		
//		List<User> list = userRepository.findByUserAgeGreaterThan(25);
//		System.out.println(list);
//		for(User user:list)
//		{
//			System.out.println(user);
//		}
		
//		List<User> list = userRepository.findByUserAgeGreaterThanEqual(25);
//		System.out.println(list);
//		for(User user:list)
//		{
//			System.out.println(user);
//		}
//		
//		List<User> list = userRepository.findByUserAgeLessThanEqual(25);
//		System.out.println(list);
//		for(User user:list)
//		{
//			System.out.println(user);
//		}
//		
//		List<User> list = userRepository.findByUserAgeLessThan(25);
//		System.out.println(list);
//		for(User user:list)
//		{
//			System.out.println(user);
//		}
		
		
//		User user= userRepository.findByUserNameAndUserEmail("Rubina","rubina@gmail.com");
//		System.out.println(user);
		
//		User user= userRepository.findByUserNameOrUserEmail("Rubina","rubinaa@gmail.com");
//		System.out.println(user);
		
//		List<User> list = userRepository.findByUserNameIs("Rubina");
//		System.out.println(list);
//		for(User user:list)
//		{
//			System.out.println(user);
//		}
		
//		List<User> list = userRepository.findByUserNameEquals("Rubina");
//		System.out.println(list);
//		for(User user:list)
//		{
//			System.out.println(user);
//		}
		
		
//		List<User> list = userRepository.findByUserAgeBetween(25,29);
//		System.out.println(list);
//		for(User user:list)
//		{
//			System.out.println(user);
//		}
		

//		List<User> list = userRepository.findByUserAgeAfter(25);
//		System.out.println(list);
//		for(User user:list)
//		{
//			System.out.println(user);
//		}
		
//		List<User> list = userRepository.findByUserAgeBefore(25);
//		System.out.println(list);
//		for(User user:list)
//		{
//			System.out.println(user);
//		}
		
//		List<User> list = userRepository.findByUserAgeIsNull();
//		System.out.println(list);
//		for(User user:list)
//		{
//			System.out.println(user);
//		}
		
		
		List<User> list = userRepository.findByUserEmailIs("rubina@gmail.com");
		System.out.println(list);
		for(User user:list)
		{
			System.out.println(user);
		}
		
		List<User> list1 = userRepository.findByUserEmailEquals("rubina@gmail.com");
		System.out.println(list1);
		for(User user:list1)
		{
			System.out.println(user);
		}
		
		
		List<User> list2 = userRepository.findByUserIdBetween(8,10);
		System.out.println(list2);
		for(User user:list2)
		{
			System.out.println(user);
		}
		

		List<User> list3 = userRepository.findByUserIdAfter(10);
		System.out.println(list3);
		for(User user:list3)
		{
			System.out.println(user);
		}
		
		List<User> list4 = userRepository.findByUserIdBefore(10);
		System.out.println(list4);
		for(User user:list4)
		{
			System.out.println(user);
		}
		
		List<User> list5 = userRepository.findByUserIdIsNull();
		System.out.println(list5);
		for(User user:list5)
		{
			System.out.println(user);
		}
	}

}
