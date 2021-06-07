package com.genesis.spring.graphql.service;

import com.genesis.spring.graphql.model.Post;
import com.genesis.spring.graphql.model.User;
import com.genesis.spring.graphql.repository.PostRepository;
import com.genesis.spring.graphql.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class DataLoader {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @PostConstruct
    public void loadData(){

    }


    public static Date getRandomDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1990);
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DATE, 2);
        Date date1 = calendar.getTime();
        calendar.set(Calendar.YEAR, 1996);
        Date date2 = calendar.getTime();
        long startMillis = date1.getTime();
        long endMillis = date2.getTime();
        long randomMillisSinceEpoch = ThreadLocalRandom
                .current()
                .nextLong(startMillis, endMillis);

        return new Date(randomMillisSinceEpoch);
    }


}
