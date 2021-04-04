package aula6;

import java.util.stream.Collectors;

public class StringLinesExemplo {
    public static void main(String[] args) {

        String html = "<html>\n<head>\n/<head>\n <body> \n <body>   \n<html>";
        // pegando uma teg especifica lines(
        System.out.println(html.lines().filter(s -> s.contains("head")).collect(Collectors.joining()));

        // coma utilização do map
        System.out.println(html.lines().map(s -> "[TAG] :: " +s).collect(Collectors.joining()));

    }
}
