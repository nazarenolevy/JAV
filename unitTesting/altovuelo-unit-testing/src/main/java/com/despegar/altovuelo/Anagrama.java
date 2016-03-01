package com.despegar.altovuelo;

import com.google.common.collect.Sets;

import java.util.*;

/**
 * Clase con metodos para trabajar con anagramas.
 * <p/>
 * Created by srosenbolt
 */
public class Anagrama {

    /**
     * Devuelve si una palabra es el resultado de permutar las letras de otra.
     * <p/>
     * No importan las mayusculas y minusculas. Pero si los espacios.
     *
     * @param palabra1 Una palabra a utilizar. No puede ser null.
     * @param palabra2 Otra palabra a utilizar. No puede ser null.
     * @return {@code true} si palabra2 es un anagrama de palabra1. {@code false} en caso contrario.
     */
    public boolean isAnagrama(String palabra1, String palabra2) {
        if (palabra1 == null || palabra2 == null) {
            throw new IllegalArgumentException("Las palabras no pueden ser null.");
        }
        Map<Character, Integer> letras1 = palabraAMapa(palabra1.toLowerCase());
        Map<Character, Integer> letras2 = palabraAMapa(palabra2.toLowerCase());

        return letras1.equals(letras2);
    }

    private Map<Character, Integer> palabraAMapa(String palabra) {
        Map<Character, Integer> mapa = new HashMap<Character, Integer>();
        for (char aChar : palabra.toCharArray()) {
            Integer count = mapa.get(aChar);
            if (count == null) {
                count = 0;
            }
            count++;
            mapa.put(aChar, count);
        }
        return mapa;
    }

    /**
     * Devuelve una coleccion que contiene todas las palabras que pueden generarse a partir de las
     * permutaciones sobre las letras de una palabra dada.
     *
     * @param palabra Una palabra sobre la que se buscaran anagramas. Puede ser vacia pero no {@code null}.
     * @return Devuelve una coleccion nunca nula, pero podria ser vacia.
     */
    public Set<String> anagrama(String palabra) {
        if (palabra == null) {
            throw new IllegalArgumentException("La palabra no puede ser null.");
        }
        if (palabra.isEmpty()) {
            return Collections.emptySet();
        }
        return anagrama("", palabra.toLowerCase());
    }

    private Set<String> anagrama(String prefjo, String str) {
        int n = str.length();
        if (n == 0) {
            return Sets.newHashSet(prefjo);
        } else {
            Set<String> set = new HashSet<String>();
            for (int i = 0; i < n; i++) {
                set.addAll(anagrama(prefjo + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n)));
            }
            return set;
        }
    }
}
