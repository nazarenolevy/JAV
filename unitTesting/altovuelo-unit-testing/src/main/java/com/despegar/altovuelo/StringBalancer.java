package com.despegar.altovuelo;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;

/**
 * Esta clase sirve para saber si un String esta balanceado o no.
 * <p/>
 * Created by srosenbolt on 21/02/16.
 */
public class StringBalancer {
    private static final BiMap<String, String> MARKERS = ImmutableBiMap.<String, String>builder()
            .put("[", "]")
            .put("{", "}")
            .build();

    /**
     * Indica si un string esta o no balanceado.  <br>
     * Balanceado significa que para cada caracter de apertura, hay un caracter de cierre. <br>
     * Además deben seguir un orden, el caracter de cierre correspondiente al caracter de apertura debe ser el primer caracter de cierre luego del mismo.<br>
     * <br>
     * EJ:
     * <ul>
     * <li>"[...]" Esta balanceado</li>
     * <li>"[....{....}....]" Esta balanceado</li>
     * <li>"[....{.[..]...}....]" Esta balanceado</li>
     * <li>"[...}" <b>NO</b> Esta balanceado</li>
     * <li>"[...} ]" <b>NO</b> Esta balanceado</li>
     * <li>"[.{..]...} " <b>NO</b> Esta balanceado</li>
     * <li>"[...[...] " <b>NO</b> Esta balanceado</li>
     * </ul>
     * <p/>
     * <br>
     *
     * @param theString El string a chequear. No puede ser null, pero puede ser vacío.
     * @return {@code true} Si el string esta balanceado. {@code false} en caso contrario.
     */
    public boolean isStringBalanced(String theString) {
        Pila<String> pila = new Pila<String>();
        for (Character cChar : theString.toCharArray()) {
            String aChar = cChar.toString();
            try {
                if (MARKERS.containsKey(aChar)) {
                    pila.push(aChar);
                } else if (MARKERS.containsValue(aChar)) {
                    String expected = MARKERS.inverse().get(aChar);
                    String openingChar = pila.pop();
                    if (!expected.equals(openingChar)) {
                        return false;
                    }
                }
            } catch (IllegalStateException e) {
                return false;
            }

        }
        return pila.size() == 0;
    }

    /**
     * @return Devuelve el conjunto de caracteres de aprtura aparejados con sus respectivos caracteres de cierre
     */
    public static BiMap<String, String> getMarkers() {
        return MARKERS;
    }
}
