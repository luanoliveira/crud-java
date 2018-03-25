package unp.model;

public class Cliente {
	
	private String codigo;
	private String nome;
	private String email;
	private String telefone;
	
	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}
	
	public String getCodigo()
	{
		return this.codigo;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}
	
	public String getTelefone()
	{
		return this.telefone;
	}
}