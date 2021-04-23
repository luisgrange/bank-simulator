
public class Endereco {
	private String rua;
	private String complemento;
//	private String bairro;
//	private String cidade;
	private int numero;
	
	//1º construtor
	public Endereco(String rua, int numero) {
		this.rua = rua;
		this.numero = numero;
		//this.bairro = bairro;
	}
	
	//2º construtor
	public Endereco(String rua, String complemento, int numero) {
		this.rua = rua;
		this.complemento = complemento;
		this.numero = numero;
	}
	//3º construtor vazio
	public Endereco() {}
	
	//set e get para rua
	public void setRua(String rua) {this.rua = rua;}
	public String getRua() {return this.rua;}
	
	//set e get para complento
	public void setComplemento(String complemento) {this.complemento = complemento;}
	public String getComplemento() {return this.complemento;}
	
//	//set e get para bairro
//	public void setBairro(String bairro) {this.bairro = bairro;}
//	public String getBairro() {return this.bairro;}
//	
//	//set e get para cidade
//	public void setCidade(String cidade) {this.cidade = cidade;}
//	public String getCidade() {return this.cidade;}
//	
	//set e get para numero
	public void setNumeroRe(int numero) {this.numero = numero;}
	public int getNumeroRe() {return this.numero;}
}
