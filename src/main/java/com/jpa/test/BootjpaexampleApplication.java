package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

//cREATING THE DATA

		/*
		 * User user1 = new User();
		 * 
		 * user1.setName("Vickky"); user1.setCity("Durgapur");
		 * user1.setStatus("I am python devloper");
		 * 
		 * User user2 = new User();
		 * 
		 * user2.setName("Nicky"); user2.setCity("Durgapur");
		 * 
		 * user2.setStatus("I am Spring boot devloper");
		 */

		// SAVING SINGLE USER AT A TIME

		// userRepository.save(user1);

		// SAVING MULTIPALE OR ALL USER DATA AT A TIME (FIRST OF ALL YOU HAVE TO ADD
		// ALL THE DATA IN A LIST FOR SAVING IN SINGLE TIME)

		// List<User> users = new ArrayList<>();

		// users.add(user1);
		// users.add(user2);

		// Iterable<User> saveAll = userRepository.saveAll(users);

		// System.out.println(saveAll);

// UPDATING DATA (FOR UPDATITE DATE FRIST OF ALL YOU HAVE TO  GET THAT DATA)		

		/*
		 * Optional<User> findById = userRepository.findById(7); User user =
		 * findById.get(); user.setCity("Kolkata"); User result =
		 * userRepository.save(user); System.out.println(result);
		 */

		// HOW TO GET DATA
		// FindById(id)-return optional containing data.

		// finding all data

		// Iterable<User> findAll = userRepository.findAll();

		// old methode

		/*
		 * Iterator<User> iterator = findAll.iterator(); while(iterator.hasNext()) {
		 * 
		 * User next = iterator.next(); System.out.println(next);
		 * 
		 * }
		 */

		// new methode using lamda function i.e available from java1.8

		// findAll.forEach(user -> {
		// System.out.println(user);
		// });

		/*
		 * Delete
		 * 
		 * userRepository.deleteById(7); System.out.println("deleted");
		 * 
		 * Iterable<User> findAll2 = userRepository.findAll();
		 * userRepository.deleteAll(findAll2); System.out.println("All Deleted");
		 */

		// List<User> findByName = userRepository.findByName("Nicky");

		// findByName.forEach(user -> {
		// System.out.println(user);
		// });

		List<User> findByCity = userRepository.findByCity("Durgapur");

		findByCity.forEach(user -> {
			System.out.println(user);
		});

		List<User> findByNameAndCity = userRepository.findByNameAndCity("Nicky", "Durgapur");

		findByNameAndCity.forEach(action -> {
			System.out.println(action);
		});

	}
}
