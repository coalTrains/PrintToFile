import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Main {

	public static void main(String[] args) {
		
		int i = 1;
		boolean continua = true;
		User user = new User();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(continua){
			try {
				user.setId(i);
        	
				System.out.print("Nome: ");
				user.setNome(in.readLine());
				System.out.print("Cognome: ");
				user.setCognome(in.readLine());
				System.out.print("Data di nascita: ");
				user.setDataNascita(in.readLine());
				i++;
				System.out.println("Inserire un nuovo utente? (S o N)");
				if(in.readLine().equalsIgnoreCase("n")){
					continua = false;
				}
				File file = new File("Utenti.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
				// output pretty printed
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
				jaxbMarshaller.marshal(user, file);
            
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}
		
	}

}
