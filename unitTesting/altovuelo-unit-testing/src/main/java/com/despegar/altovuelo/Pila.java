package com.despegar.altovuelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementacion de una estructura LIFO
 * Created by srosenbolt
 */
public class Pila<T> {
    private List<T> list = new ArrayList<T>();

    /**
     * Agrega un elemento a la pila.
     *
     * @param element el elemento a agregar.
     */
    public void push(T element) {
        list.add(element);
    }

    /**
     * Devuelve el elemento superior de la pila.
     *
     * @return un elemento.
     * @throws IllegalStateException si la pila se encuentra vacia.
     */
    public T pop() {
        if (list.isEmpty()) {
            throw new IllegalStateException("No hay elementos para remover.");
        }
        return list.remove(list.size() - 1);
    }

    public int size() {
        return list.size();
    }
}
