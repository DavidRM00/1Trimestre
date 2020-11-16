package paneles;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;

import javax.swing.JPanel;

public class JPanelExtendido extends JPanel implements Serializable{
	
		private static final long serialVersionUID = 1L;
		
		public String colorFondo;
		

		public String getColorFondo() {
			return colorFondo;
		}


		public void setColorFondo(String colorFondo) {
			this.colorFondo = colorFondo;
			setBackground(null);
		}


		public JPanelExtendido() {
			
			addMouseMotionListener (new MouseMotionListener(){

				@Override
				public void mouseDragged(MouseEvent e) {
				}

				@Override
				public void mouseMoved(MouseEvent e) {
					System.out.println("Moviendo el raton encima del Panel...");
				}
				
			});
		}
	

}
