package sistema.negocio;



public class AlunoEstrutura {
    private String id;
    private String nome;
    private int idade;
   

    public AlunoEstrutura() {
    } 

    public AlunoEstrutura(String id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        
        this.idade = idade;
    }

    }
    
  

