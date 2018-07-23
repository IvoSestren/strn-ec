package br.com.strn.ec.database.atualizador;

public class Main {

    public static void main(String[] args) {
        Atualizador atualizador = new Atualizador("postgresql", "jdbc:postgresql://localhost:5432/sc", "sc", "sc");
        atualizador.atualizar();
    }
}
