
public class Cliente {
	private String CPF;
	private String nome;
	private String telefone;
	private int tipo;
	private Endereco endereco = new Endereco();
	
	//1º construto
	public Cliente() {
		// vazio para poder criar posteriormente em Conta
	}
	//2º Constrtutor
	public Cliente(String nome) {
		this.nome = nome;
	}
	//3º construtor
	public Cliente(String nome, String cpf, String rua, String complemento, int numero) {
		this.nome = nome;
		this.CPF = cpf;
		this.endereco.setRua(rua);
		this.endereco.setComplemento(complemento);
		this.endereco.setNumeroRe(numero);
	}
	//set e get nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {return this.nome;}
	
	//set e get cpd
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getCPF() {return this.CPF;}
	
	//set e get telefone
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone() {return this.telefone;}
	
	//set e get tipo
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getTipo() {return this.tipo;}
	
	//set e get para endereço
	public void setEnderecoRua(String rua) {this.endereco.setRua(rua);}
	public String getEnderecoRua() {return this.endereco.getRua();}
		
	public void setEnderecoNum(int numero) {this.endereco.setNumeroRe(numero);}
	public int getEnderecoNum() {return this.endereco.getNumeroRe();}
		
	public void setEnderecoComple(String complemento) {this.endereco.setComplemento(complemento);}
	public String getEnderecoComple() {return this.endereco.getComplemento();}
}
