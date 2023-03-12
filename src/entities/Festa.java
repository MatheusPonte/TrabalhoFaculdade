package entities;

import entities.Local;

public class Festa {
    private String responsavel;
    private int convidados;
    private double custo;

    public Festa(String responsavel, int convidados, double custo) {
        this.responsavel = responsavel;
        this.convidados = convidados;
        this.custo = custo;
    }

    public static boolean validarCPF(String cpf) {
        return cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}");
        
    }

    public static String formatarCPf(String cpf) {
        if(cpf.contains(".")){
            cpf = cpf.replace(".","");
        }
        if(cpf.contains("-")){
            cpf = cpf.replace("-","");
        }
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
    }

    public String classifcar() {

        if (convidados < 300 && custo < 15000) {
            return "Festa Junina";
        } else if (convidados < 300 && custo >= 15000) {
            return "Aniversário";
        } else if (convidados >= 300 && custo < 1500) {
            return "Formatura";
        } else {
            return "Casamento";
        }
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getConvidados() {
        return convidados;
    }

    public void setConvidados(int convidados) {
        this.convidados = convidados;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void mostrar() {
        System.out.println(
                "Responsavel pela festa : " + responsavel + 
                        " Quantidade de covnidados: " + convidados + 
                        " custo total: " + custo +"$");

    }

    public boolean possivelLocal(Local local) {
        double area = convidados * 3.0;
        double largura = local.getLargura();
        double comprimento = local.getComprimento();
        double areaLocal = largura * comprimento;
        return areaLocal >= area;
    }

}
