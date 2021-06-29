package com.meli.aula03.TMAula2Exer2;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {
    private GregorianCalendar gc;
    private Date data;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    public Data(GregorianCalendar gc, Date data, SimpleDateFormat formatter) {
        this.gc = gc;
        this.data = data;
        this.formatter = formatter;
    }

    public GregorianCalendar getGc() {
        return gc;
    }

    public Date getData() {
        return data;
    }

    public SimpleDateFormat getFormatter() {
        return formatter;
    }

    public void setGc(GregorianCalendar gc) {
        this.gc = gc;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setFormatter(SimpleDateFormat formatter) {
        this.formatter = formatter;
    }

    private void adicionarDia(int tipoCampo){
        gc.add(Calendar.DAY_OF_MONTH, 1);
        this.data = gc.getTime();
    }

    public boolean validaData(int ano, int mes, int dia) {
        boolean valid = true;
        Calendar calendar = new GregorianCalendar(ano, mes, dia);
        if (ano != calendar.get(Calendar.YEAR)) {
            valid = false;
        }
        else if (mes != calendar.get(Calendar.MONTH)) {
            valid = false;
        }
        else if (dia != calendar.get(Calendar.DAY_OF_MONTH)) {
            valid = false;
        }
        return valid;
    }

    @Override
    public String toString() {
        return "Data{" +
                "gc=" + gc +
                ", data=" + data +
                ", formatter=" + formatter +
                '}';
    }
}
