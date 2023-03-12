package entities;

public class Local {
    private double largura;
    private double comprimento;

    public Local(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;

    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void mostrar() {
        System.out.println(
                "Largura " + largura +
                        " Comprimento " + comprimento );

    }
    
}

