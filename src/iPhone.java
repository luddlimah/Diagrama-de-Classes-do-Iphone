 public class iPhone {
    private String modelo;
    private String sistemaOperacional;
    private String cor;

    public iPhone(String modelo, String sistemaOperacional, String cor) {
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.cor = cor;
    }


    public String getModelo() {
        return modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public String getCor() {
        return cor;
    }

    public interface ReprodutorMusical {
        void tocar();
        void pausar();
        void selecionarMusica();
    }

    public interface AparelhoTelefonico {
        void ligar();
        void atender();
        void iniciarCorreioVoz();
    }

    public interface NavegadorInternet {
        void exibirPagina();
        void adicionarNovaAba();
        void atualizarPagina();
    }
}
