package homework12;

public class task {
    public static void main(String[] args) {

        // ZADANIE 1
        // Risunok "matryoshka"

        // +--------------------------------------+
        // |                 JDK                  |
        // |                                      |
        // |   +------------------------------+   |
        // |   |             JRE              |   |
        // |   |                              |   |
        // |   |    +---------------------+   |   |
        // |   |    |        JVM          |   |   |
        // |   |    | vypolnyaet baytkod |   |   |
        // |   |    +---------------------+   |   |
        // |   |                              |   |
        // |   |        ↑ java                |   |
        // |   |     zapuskaet JVM           |   |
        // |   +------------------------------+   |
        // |                                      |
        // |            ↑ javac                   |
        // |       kompilyator v JDK              |
        // +--------------------------------------+


        // ZADANIE 2
        // Obyasnenie drugu

        // Kogda ty zapuskayesh igru na Java, tebe nuzhna tolko sreda dlya zapuska.
        // Etu rol vypolnyaet JRE, vnutri kotoroy rabotaet JVM.
        // JVM chitaet baytkod programmy i vypolnyaet ego na kompyutere.
        // Kogda ty pishesh igru na Java, snachala sozdayotsya tekst programmy.
        // Potom etot tekst kompiliruetsya v baytkod s pomoshchyu javac iz JDK.
        // Poetomu razrabotchiku nuzhna JDK, a polzovatelyu dlya zapuska dostatochno JRE.


        // ZADANIE 3
        // Proverka do ustanovki Java

        // Komandy:
        // java -version
        // javac -version

        // Primer vyvoda:
        // java version "21.0.2"
        // javac 21.0.2

        // Ili:
        // java version "21.0.2"
        // javac: command not found

        // javac mozhet byt ne naydena, esli ustanovlena tolko JRE,
        // a JDK ne ustanovlena ili ne dobavlena v PATH.


        // ZADANIE 4
        // Distribyutiv JDK
        // Vendor: Temurin
        // Versiya Java: 21 LTS
        // OS: Windows / macOS / Linux
        // Gotovyy ustanovshchik: da
        // Windows -> .msi
        // macOS -> .pkg
        // Linux -> .tar.gz


        // ZADANIE 5
        // Tri fayla — tri roli
        // Snachala sozdaetsya fayl s tekstom programmy, naprimer Game.java.
        // Eto iskhodnyy kod na Java.
        // Kompilyator javac iz JDK kompiliruet etot fayl i sozdaet Game.class.
        // Fayl .class soderzhit baytkod Java.
        // Komanda java iz JRE zapuskaet JVM.
        // JVM chitaet .class fayl i vypolnyaet baytkod.
    }
}
