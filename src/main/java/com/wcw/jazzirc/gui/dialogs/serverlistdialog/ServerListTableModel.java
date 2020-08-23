package com.wcw.jazzirc.gui.dialogs.serverlistdialog;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class ServerListTableModel extends AbstractTableModel {

	private List<Map<Integer, Object>> rowData = new ArrayList<>();
	
	public ServerListTableModel() {
		
	}
     
	@Override
	public String getColumnName(int column) {
		if (column == 0) {
			return "Network";
		}
		else if (column == 1) {
			return "Identity";
		}
		else if (column == 2) {
			return "Channels";
		}
		else {
			return "Undefined";
		}
	}
	
	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return rowData.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
}
