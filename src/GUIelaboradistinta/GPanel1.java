package GUIelaboradistinta;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;


import elaboradistinta.StartUp;
import elaboradistinta.controller.GestisciCommessaHandler;
import elaboradistinta.model.Distinta;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class GPanel1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean DEBUG = false;
	Vector<Vector<String>> data;
	JTable table;
	JScrollPane scrollPane;


	public GPanel1(Vector<String> columnNames) {
		super(new GridLayout(1, 0));

		final StartUp s = StartUp.getInstance();

		
		GestisciCommessaHandler gch = GestisciCommessaHandler.getInstance();
		Distinta d = gch.getCommessaById(2).getDistinta();
		

		data = new Vector<Vector<String>>();
		for (int i=0; i<s.gch.getNumOfCommesse(); i++){
			Vector<String> row = new Vector<String>();
			row.add("");
			row.add("");
			row.add(  ""+s.gch.getCommessaByIndex(i).getID());
			data.add(row);
		}
		

		table = new JTable(data, columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
		table.setFillsViewportHeight(true);

		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				JTable t =  (JTable) evt.getSource();
				if (evt.getClickCount() == 1 && t.getSelectedRow() >= 0) {
					int index = t.getSelectedRow();
					(((GPanelCodInt) GProgLavori.getListbox()).getTable()).setRowSelectionInterval(index, index);
					(((GPanel2) GProgLavori.getPanel2()).getTable()).setRowSelectionInterval(index, index);
					(((GPanel3) GProgLavori.getPanel3()).getTable()).setRowSelectionInterval(index, index);
					(((GPanel4) GProgLavori.getPanel4()).getTable()).setRowSelectionInterval(index, index);
					(((GPanel5) GProgLavori.getPanel5()).getTable()).setRowSelectionInterval(index, index);
					GPanelCodInt t1 =  (GPanelCodInt) GProgLavori.getListbox();
					if (s.gch.hasDistinta( (String) t1.getTable().getValueAt(t.getSelectedRow(), 0) ) ) {
						GProgLavori.getB().setText("Visualizza Distinta");
					} else {
						GProgLavori.getB().setText("Crea Distinta");
					}
				}
			}
		});
		


		
		if (DEBUG) {
			table.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					printDebugData(table);
				}
			});
		}

		// Create the scroll pane and add the table to it.
		scrollPane = new JScrollPane(table);

		// Add the scroll pane to this panel.
		add(scrollPane);

		agganciaScroll(  );
		
	}
	public void agganciaScroll( ){
		GPanelCodInt tSinistra =  (GPanelCodInt) GProgLavori.getListbox();
		final JScrollPane sin = tSinistra.getScroll();
		this.scrollPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener(){ 
			@Override
			public void adjustmentValueChanged(AdjustmentEvent arg0) {
				// TODO Auto-generated method stub
				sin.getVerticalScrollBar().setValue(getScroll().getVerticalScrollBar().getValue());
			}});
		sin.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener(){ 
			@Override
			public void adjustmentValueChanged(AdjustmentEvent arg0) {
				// TODO Auto-generated method stub
				getScroll().getVerticalScrollBar().setValue(sin.getVerticalScrollBar().getValue());
			}});
	}
public JTable getTable(){
	return this.table;
}

public JScrollPane getScroll(){
	return this.scrollPane;
}

public Table addRow(Table t){
	Vector<String> row = new Vector<String>();
	row.add("");
	row.add("");
	row.add("");
	t.data.add(row);
	return t;
}


	private void printDebugData(JTable table) {
		int numRows = table.getRowCount();
		int numCols = table.getColumnCount();
		javax.swing.table.TableModel model = table.getModel();

		System.out.println("Value of data: ");
		for (int i = 0; i < numRows; i++) {
			System.out.print("    row " + i + ":");
			for (int j = 0; j < numCols; j++) {
				System.out.print("  " + model.getValueAt(i, j));
			}
			System.out.println();
		}
		System.out.println("--------------------------");
	}

}
