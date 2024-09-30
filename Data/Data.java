package src.Data;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        if (ano <= 2024 && ano >= 1){
            if (dia >= 1){
                if ((dia <= 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)){
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                }else if ((dia <= 31) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)){
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                }else if (dia <= 29 && mes == 2){
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                }else{
                    System.out.println("Mês ou Dia inválidos");
                }
            }else{
                System.out.println("O dia não é válido");
            }
        }else {
            System.out.println("O Ano tem que ser entre 1 e 2024");
        }

    }

    public void displayData(){
        if (getDia() > 0 && getMes() > 0 && getAno() > 0){
            System.out.printf("%d/%d/%d", getDia(), getMes(), getAno());
        }else {
            System.out.println("ERROR");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
