package unp.dao;

public class ContatoDao {
	
	private Integer id;
	private String nome;
	private String email;
	private String telefone;
	
	public void setId(Integer id)
	{
		this.id = id;
	}
	
	public Integer getId()
	{
		return this.id;
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
