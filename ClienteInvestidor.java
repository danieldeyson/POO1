
public class ClienteInvestidor extends Cliente {
	private String ClienteVip;
	
	public ClienteInvestidor(String ClienteVip){
		this.ClienteVip = ClienteVip;
		
	}

	public String getClienteVip() {
		return ClienteVip;
	}

	public void setClienteVip(String clienteVip) {
		ClienteVip = clienteVip;
	}


}
