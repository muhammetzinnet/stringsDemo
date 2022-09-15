public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel";
        System.out.println(message);
        System.out.println("Eleman sayısı: " + message.length());
        System.out.println("5. Eleman: " + message.charAt(4));
        System.out.println(message.concat(" yaşasın"));
        System.out.println(message.startsWith("A"));
        System.out.println(message.endsWith("l"));

        char[] characters = new  char[5];
        message.getChars(0,4,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf('e'));
        System.out.println("------------------------------------");

        System.out.println(message.replace(' ','-'));
        System.out.println(message.substring(2,6));

        for (String word:message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}