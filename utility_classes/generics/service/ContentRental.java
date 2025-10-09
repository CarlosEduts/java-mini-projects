package utility_classes.generics.service;

import java.util.List;

public class ContentRental<T> {
    private List<T> contentList;

    public ContentRental(List<T> contentList) {
        this.contentList = contentList;
    }

    public void displayContent() {
        System.out.println("\nConteúdos disponíveis para aluguel:");
        for (T content : contentList) {
            System.out.println("+ " + content);
        }
    }

    public void rentContent(T content) {
        if (contentList.contains(content)) {
            System.out.println("Alugando: " + content);
            contentList.remove(content);
        } else {
            System.out.println("Conteúdo não disponível para aluguel: " + content);
        }
    }

    public void returnContent(T content) {
        System.out.println("Devolvendo: " + content);
        contentList.add(content);
    }
}
