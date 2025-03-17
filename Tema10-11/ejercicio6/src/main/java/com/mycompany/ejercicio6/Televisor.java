package com.mycompany.ejercicio6;

/**
 * Crea una clase Electrodomestico con atributos marca y consumoEnergetico.
 * Luego, crea subclases Lavadora (con atributo capacidadKg) y Televisor (con
 * atributo tamañoPulgadas).
 *
 * Implementa un método calcularConsumoDiario(int horasUso), que estime el
 * consumo en kWh basándose en el consumo energético (atributo) y las horas de
 * uso (se le pasan al método por parámetro al ejecutarlo en el main). Ten en
 * cuenta que la lavadora cuando está parada no consume nada, pero el televisor
 * sí, por lo que deberás sobreescribir el método en el televisor para
 * considerar también las horas que no se ha utilizado (24-horasUso).
 *
 * Para hacer pruebas, puedes considerar que la lavadora consume 1,5kWh mientras
 * funciona y 0kWh apagada, y el televisor consume 0,1kWh encendida y 0,001kWh
 * apagada.
 */
public class Televisor extends Electrodomestico{
    
    private int tamanoPulgadas;
    
    public Televisor (String marca, float consumoEnergetico, int tP){
        super(marca, consumoEnergetico);
        this.tamanoPulgadas = tP;
    }

    public int getTamanoPulgadas() {
        return tamanoPulgadas;
    }

    public void setTamanoPulgadas(int tamanoPulgadas) {
        this.tamanoPulgadas = tamanoPulgadas;
    }

    public String toString() {
        return "tamaño en pulgadas: " + this.tamanoPulgadas;
    }

    @Override
    public void calcularConsumoDiario(int horasUso){
        float consumo = super.getConsumoEnergetico();
        int apagada = 24-horasUso;
        float consumoApagada = 0.0001f * apagada;
        System.out.println("El consumo es de " + ((consumo*horasUso)+consumoApagada) + " kWh");
    }
}
