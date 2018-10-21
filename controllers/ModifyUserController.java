package controllers;

import entities.PersonEntity;
import entities.UserStatusEntity;
import java.util.ArrayList;

public class ModifyUserController {

    public static String[] getStatusField() {
        ArrayList<UserStatusEntity> selectedStatus = UserStatusEntity.select("", "", 100);

        String[] fields = new String[selectedStatus.size()];

        for (int i = 0; i < selectedStatus.size(); i++) {
            fields[i] = selectedStatus.get(i).getUser_status_name();
        }

        return fields;
    }

    public static String[] getNameField() {
        ArrayList<PersonEntity> selectedName = PersonEntity.select("", "", 100);

        String[] fields = new String[selectedName.size()];

        for (int i = 0; i < selectedName.size(); i++) {
            fields[i] = selectedName.get(i).getPerson_name();
        }

        return fields;
    }

}
