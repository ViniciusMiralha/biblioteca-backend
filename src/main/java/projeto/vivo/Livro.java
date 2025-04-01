package projeto.vivo;

public class Livro {
    private int id;
    private String titulo;
    private String tipoLiteratura;
    private String status;
    private String autor;
    private int paginas;
    private String capa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoLiteratura() {
        return tipoLiteratura;
    }

    public void setTipoLiteratura(String tipoLiteratura) {
        this.tipoLiteratura = tipoLiteratura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }
    
}
