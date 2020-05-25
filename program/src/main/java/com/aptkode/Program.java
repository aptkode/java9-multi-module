package com.aptkode;

import com.aptkode.entity.User;
import com.aptkode.repository.CrudRepository;

import java.util.ServiceLoader;

public class Program {

    public static void main(String[] args) {

        @SuppressWarnings("rawtypes")
        ServiceLoader<CrudRepository> repositoryServiceLoader = ServiceLoader.load(CrudRepository.class);
        @SuppressWarnings("unchecked")
        CrudRepository<User,String> repo = repositoryServiceLoader.findFirst().get();

        User user1 = new User("tom");
        User user2 = new User("john");
        User user3 = new User("samanta");

        repo.save(user1);
        repo.save(user2);
        repo.save(user3);

        System.out.println(repo.findAll());
    }

}
