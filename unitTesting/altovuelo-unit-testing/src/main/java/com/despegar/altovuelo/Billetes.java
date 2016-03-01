package com.despegar.altovuelo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by srosenbolt on 28/02/16.
 */
public class Billetes {
    private static List<Integer> BILLETES_CIRCULANTES = Arrays.asList(100, 50, 20, 10, 5, 2, 1); // SDR: Si bien el de 1 es una moneda, por simpleza se agrega.

    /**
     * Devuelve el vuelto a un pago de 100$ en la menor cantidad posible de billetes.
     *
     * @param monto el monto a cobrar. Debe ser menor o igual a 100.
     * @return un mapa conteniendo una entrada por cada tipo de billete, con su respectiva cantidad. El mapa puede ser vacio pero no nulo.
     */
    public Map<Integer, Integer> calcularVuelto(int monto) {
        if (monto > 100 || monto <= 0) {
            throw new IllegalArgumentException("Este metodo solo funciona con montos menores o iguales a 100 y mayores a 0.");
        }

        int montoAux = 100 - monto;
        Map<Integer, Integer> vuelto = new HashMap<Integer, Integer>(BILLETES_CIRCULANTES.size());
        for (Integer billete : BILLETES_CIRCULANTES) {
            int cantBillete = montoAux / billete;
            if (cantBillete > 0) {
                vuelto.put(billete, cantBillete);
                montoAux = montoAux % billete;
            }
        }

        return vuelto;
    }
}
