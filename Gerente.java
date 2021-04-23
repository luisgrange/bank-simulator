
public class Gerente {
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	public int tipo;
	private Endereco endereco = new Endereco();
	
	//1º construtor
	public Gerente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	//2º construtor:
	public Gerente(String nome, int tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
//	//3º construtor
//	public Gerente(String nome, String cpf, String rua, String complemento, int numero) {
//		this.nome = nome;
//		this.cpf = cpf;
//		this.endereco.setRua(rua);
//		this.endereco.setComplemento(complemento);
//		this.endereco.setNumeroRe(numero);
//	}
	
	//4º construtor - vazio
	public Gerente() {}
	
	//set e get para nome
	public void setNome(String nome) {this.nome = nome;}
	public String getNome() {return this.nome;}
	
	//set e get para cpf
	public void setCPF(String cpf) {this.cpf = cpf;}
	public String getCPF() {return this.cpf;}
	
	//set e get para email
	public void setEmail(String email) {this.email = email;}
	public String getEmail() {return this.email;}
	
	//set e get para telefone
	public void setTelefone(String telefone) {this.telefone = telefone;}
	public String getTelefone() {return this.telefone;}
	
	//set e get para tipo
	public void setTipo(int tipo) {this.tipo = tipo;}
	public int getTipo() {return this.tipo;}
	
	//set e get para endereço
	public void setEnderecoRua(String rua) {this.endereco.setRua(rua);}
	public String getEnderecoRua() {return this.endereco.getRua();}
	
	public void setEnderecoNum(int numero) {this.endereco.setNumeroRe(numero);}
	public int getEnderecoNum() {return this.endereco.getNumeroRe();}
	
	public void setEnderecoComple(String complemento) {this.endereco.setComplemento(complemento);}
	public String getEnderecoComple() {return this.endereco.getComplemento();}
}
