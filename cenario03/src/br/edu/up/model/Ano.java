package br.edu.up.model;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses;

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        meses = new Mes[12];
    }

    public void adicionarMes(Mes mes) {
        meses[getIndexNomeMes(mes.Nome)] = mes;
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora){
        meses[getIndexNomeMes(nomeMes)].ExcluirCompromisso(diaMes, hora);
    }

    public Dia[] listarCompromisos(String nomeMes){
        var indexMes = getIndexNomeMes(nomeMes);
        var compromissos = meses[indexMes].ListarCompromissos();

        return compromissos;
    }

    public String listarCompromisos(){
        var sb = new StringBuilder("Ano ");
        sb.append(ano).append("\n");
        for (Mes mes : meses) {
            sb.append(mes.ListarCompromissos()).append("\n\n");
        }

        return sb.toString();
    }

    private int getIndexNomeMes(String nomeMes) {
        if(nomeMes == null)
            throw new IllegalArgumentException("Més inválido!");

        return switch (nomeMes) {
            case "Janeiro" -> 0;
            case "Fevereiro" -> 1;
            case "Março" -> 2;
            case "Abril" -> 3;
            case "Maio" -> 4;
            case "Junho" -> 5;
            case "Julho" -> 6;
            case "Agosto" -> 7;
            case "Setembro" -> 8;
            case "Outubro" -> 9;
            case "Novembro" -> 10;
            case "Dezembro" -> 11;
            default -> throw new IllegalArgumentException("Més inválido!");
        };
    }
}
