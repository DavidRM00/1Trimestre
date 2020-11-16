package controller;

public class CrlConversor {
	
	public static void press_btnConvertir(){
		
		String txtMB = view.FrmCOnversor.txtMB.getText();
		int iMB = Integer.parseInt(txtMB);
		
		int iBytes = logic.Utils.MbToBytes(iMB);
		
		view.FrmConversor.lblBytes.setText("" + iBytes);
	}

}
