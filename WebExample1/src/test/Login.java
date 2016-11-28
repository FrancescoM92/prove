package test;

import javax.swing.JOptionPane;

import com.almaviva.bean.Anagrafica;
import com.almaviva.bean.User;
import com.almaviva.model.RicercaAnagraficaModel;
import com.almaviva.service.AnagraficaServiceImpl;
import com.almaviva.service.RicercaAnagraficaServiceImpl;
import com.almaviva.service.UserServiceImpl;

public class Login 
{
	public static void main(String[] args)
	{
		String i="";
		i=JOptionPane.showInputDialog("inserire 1 o 2");
		
		if(i.equals("1"))
		{
			String username;
			username = JOptionPane.showInputDialog("Inserire Nome Utente");
			RicercaAnagraficaServiceImpl rasi = new RicercaAnagraficaServiceImpl();
			RicercaAnagraficaModel ram = rasi.ricercaDati(username);
			
			System.out.println(ram.getUser().getUsername() + "\n" +
					ram.getUser().getRole() + "\n" +
					ram.getAnagrafica().getNome() + "\n" +
					ram.getAnagrafica().getCognome() + "\n" +
					ram.getAnagrafica().getIndirizzo());
			
		}
		else if (i.equals("2"))
		{
			String username;
			String password;
			username = JOptionPane.showInputDialog("Inserire Nome Utente");
			password = JOptionPane.showInputDialog("Inserire Password");
			
			User user = new User();
			UserServiceImpl usi = new UserServiceImpl();
			user = usi.searchUser(username);
			
			if(user.getUsername().equals(""))
			{
				System.out.println("accesso non avvenuto");
			}
			else if (user.getPassword().equals(password))
			{
				System.out.println("Benvenuto");
				AnagraficaServiceImpl asi = new AnagraficaServiceImpl();
				Anagrafica anagrafica = new Anagrafica();
				anagrafica = asi.searchAnagrafica(username);
				
				System.out.println(anagrafica.getNome() + "\n" + 
						anagrafica.getCognome() + "\n" +
						anagrafica.getIndirizzo());
			}
			else
			{
				System.out.println("credenziali non valide");
			}
		}
		else
		{
			System.out.println("metodo invalido");
		}
		
	}

}
