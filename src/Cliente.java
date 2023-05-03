import java.util.Date;

public class Cliente {

	String codiceCliente;
	String nomeCognome;
	String email;
	Date dataIscrizione;

	public Cliente (String codiceCliente,String nomeCognome,String email, Date dataIscrizione ) {
		this.codiceCliente=codiceCliente;
		this.nomeCognome=nomeCognome;
		this.email= email;
		this.dataIscrizione=dataIscrizione;
	}
}
