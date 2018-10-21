package controllers;

import dialogs.ModulesDialog;
import dialogs.commands.CommandsModuleDialog;
import entities.CommandEntity;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CommandsModuleController {
    
    public static void openPreviousDialog() {
        CommandsModuleDialog.close();
        ModulesDialog.main(null);
    }
    
    public static void displayCommands(String dateFilter, String userFilter, int resultQuantity, JTable commandsTable) {
        ArrayList<CommandEntity> commandList = CommandEntity.select(dateFilter, userFilter, resultQuantity);

        DefaultTableModel model = (DefaultTableModel) commandsTable.getModel();
        model.setRowCount(0);

        for (int i = 0; i < commandList.size(); i++) {
            Object[] rowData = new Object[3];
            rowData[0] = commandList.get(i).getCommand_date();
            rowData[1] = commandList.get(i).getCommand_user().getUser_person().getPerson_name();
            rowData[2] = commandList.get(i).getArticlesQuantity();

            model.insertRow(i, rowData);
        }

        model.fireTableDataChanged();
        commandsTable.setModel(model);
    }
    
}