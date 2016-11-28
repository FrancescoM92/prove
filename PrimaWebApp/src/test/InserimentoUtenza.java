package test;

import javax.swing.JOptionPane;

import com.almaviva.bean.Anagrafica;
import com.almaviva.bean.User;
import com.almaviva.service.CreationNewRecordModelServiceImpl;

public class InserimentoUtenza 
{
	public static void main(String[] args)
	{
		//Simulazione maschera input
		
		
		//CAMPI USER
		String username = JOptionPane.showInputDialog("inserire username");
		String password = JOptionPane.showInputDialog("inserire password");
		String roles = JOptionPane.showInputDialog("inserire role");
		int role = Integer.parseInt(roles);
		
		//CAMPI ANAGRAFICA
		String nome = JOptionPane.showInputDialog("inserire nome");
		String cognome = JOptionPane.showInputDialog("inserire cognome");
		String indirizzo = JOptionPane.showInputDialog("inserire indirizzo");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setRole(role);
		
		Anagrafica anagrafica = new Anagrafica();
		anagrafica.setUsername(username);
		anagrafica.setNome(nome);
		anagrafica.setCognome(cognome);
		anagrafica.setIndirizzo(indirizzo);
		
		CreationNewRecordModelServiceImpl cnrmsi = new CreationNewRecordModelServiceImpl();
		
		cnrmsi.insertNewUtenza(user, anagrafica);
		
	}
}
