// src/main/java/com/hamburgueria/Pedido.java
package com.hamburgueria;

import java.util.Arrays;
import java.util.List;

public class Pedido {

    private final List<String> cardapio = Arrays.asList("Cheddar Bacon", "X-Salada", "X-Burger");

    public boolean verificarDisponibilidade(String nomeHamburguer) {
        return cardapio.contains(nomeHamburguer);
    }

    public String realizarPedido(String nomeHamburguer) {
        if (verificarDisponibilidade(nomeHamburguer)) {
            return "Pedido confirmado: " + nomeHamburguer;
        } else {
            return "Hambúrguer indisponível: " + nomeHamburguer;
        }
    }
}
