
public class CorreioService {
	
	public String buscaEndereco(String cep) {
		
		if(cep=="9000000") {
			return "Porto Alegre";
		}
		if(cep=="8000000") {
			return "Av. Assis Brasil";
		}
		return null;
		
	}

}
