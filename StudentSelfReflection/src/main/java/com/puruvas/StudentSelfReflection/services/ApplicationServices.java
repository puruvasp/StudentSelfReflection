package com.puruvas.StudentSelfReflection.services;


import com.puruvas.StudentSelfReflection.model.Application;
import com.puruvas.StudentSelfReflection.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServices {

    @Autowired
    ApplicationRepository applicationRepository;

    public Application createUser(Application application) {

        Application savedUser = applicationRepository.save(application);
        return savedUser;
    }

    public List<Application> getAllUsers() {
        List<Application>fetchedUsersFromDb = applicationRepository.findAll();
        return fetchedUsersFromDb;
    }

}
