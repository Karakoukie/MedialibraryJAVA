package controllers;

import entities.PersonEntity;
import entities.UserEntity;
import entities.UserStatusEntity;

public class AddUserController {

    public static void addUser(String login, String password, int status_id, int person_id) {
        UserStatusEntity status = UserStatusEntity.select(Integer.toString(status_id), "", 1).get(0);
        PersonEntity person = PersonEntity.select(Integer.toString(person_id), "", 1).get(0);

        UserEntity user = new UserEntity(0, login, password, status, person);
        user.insert();
    }

}
