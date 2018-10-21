package controllers;

import dialogs.ModulesDialog;
import dialogs.users.AddUserDialog;
import dialogs.users.ModifyUserDialog;
import dialogs.users.UsersModuleDialog;
import entities.PersonEntity;
import entities.UserEntity;
import entities.UserStatusEntity;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserModuleController {

    private static int selectUserId;

    public static void setSelectedUser(int id) {
        selectUserId = id;
    }

    public static void previousDialog() {
        UsersModuleDialog.close();
        ModulesDialog.main(null);
    }

    public static void openModifyUserDialog() {
        ModifyUserDialog.main(null);
    }

    public static void openAddUserDialog() {
        AddUserDialog.main(null);
    }

    public static void displayUsers(String emailSearchFilter, int resultNumber, JTable usersTable) {
        ArrayList<UserEntity> userList = UserEntity.select("", emailSearchFilter, "", resultNumber);

        DefaultTableModel model = (DefaultTableModel) usersTable.getModel();
        model.setRowCount(0);

        for (int i = 0; i < userList.size(); i++) {
            Object[] rowData = new Object[4];
            rowData[0] = userList.get(i).getUser_id();
            rowData[1] = userList.get(i).getUser_email();
            rowData[2] = userList.get(i).getUser_status().getUser_status_name();
            rowData[3] = userList.get(i).getUser_person().getPerson_name();

            model.insertRow(i, rowData);
        }

        model.fireTableDataChanged();
        usersTable.setModel(model);
    }

    public static void modifySelectedUser(String email, String password, int status_id, int person_id) {
        PersonEntity userPerson = PersonEntity.select(Integer.toString(person_id), "", 1).get(0);
        UserStatusEntity status = UserStatusEntity.select(Integer.toString(status_id), "", 1).get(0);

        if (userPerson != null) {
            UserEntity user = new UserEntity(selectUserId, email, password, status, userPerson);
            user.update();
        }
    }

}
