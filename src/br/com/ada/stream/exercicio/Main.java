package br.com.ada.stream.exercicio;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato(1, "Mayara", 33333333, LocalDate.of(1995, 9, 22), 27);
        Contato contato1 = new Contato(1, "Drika", 444444444, LocalDate.of(1998, 8, 03), 24);
        Contato contato2 = new Contato(1, "Drika", 55555555, LocalDate.of(1997, 1, 28), 25);

        List<Contato> listContato = List.of(contato, contato1, contato2);

        int totalIdades = listContato
                .stream().map(pessoa -> pessoa.getIdade())
                .reduce(0, (subtotal, valor) -> subtotal + valor);

        System.out.println("Total de idades: " + totalIdades);

        LocalDate dataCompare = LocalDate.of(1995, 9, 22);

        System.out.println("\nFiltro por data de nascimento ");

        listContato.stream().
                filter(dataNascimento -> dataNascimento.getDataNascimento().isEqual(dataCompare))
                .forEach(System.out::println);

        System.out.println("Filtro por ID e nome");

        List<Contato> listFiltroIdNome = listContato.stream().
                filter(item -> {
                    boolean isId = item.getId() == 1;
                    boolean isNome = item.getNome().equals("Drika");
                    return isId && isNome;
                }).collect(Collectors.toList());

        System.out.println(listFiltroIdNome);

        System.out.println("\n Ordenar");

        listContato.stream().
                sorted(Comparator.comparing(Contato::getNome).reversed()).forEach(System.out::println);

        var value = listContato.stream().
                max(Comparator.comparing(Contato::getIdade));

        if (value.isPresent()) {
            System.out.println("A pessoa mais velha é " + value.get().toString());
        } else {
            System.out.println("Não existe pessoa mais velha");
        }

        var value2 = listContato.stream().
                min(Comparator.comparing(Contato::getIdade));

        if (value2.isPresent()) {
            System.out.println("A pessoa mais nova é " + value2.get().toString());
        } else {
            System.out.println("Não existe pessoa mais nova");
        }


    }
}
