package multithreading.zad32;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        Letters letters = new Letters("ABCD");

        for (Thread t : letters.getThreads()) {
            System.out.println(t.getName());
        }

        letters.startAllThreads();
       /*<- tu uruchomić
            wszystkie kody w wątkach
        */

        Thread.sleep(5000);

        letters.abortAndPrintLetters();
       /*<- tu trzeba zapisać
          fragment, który kończy działanie kodów, wypisujących litery
       */
        System.out.println("\nProgram skończył działanie");
    }

}
//    powinno (w tej postaci) wypisać:
//        Thread A
//        Thread B
//        Thread C
//        Thread D
//
//        (po 5 sekundach)
//        Program skończył działanie
//
//        Natomiast po uzupełnieniu kodu w miejscah wskazanych przez /*<-   */ - coś w rodzaju:
//
//        Thread A
//        Thread B
//        Thread C
//        Thread D
//        ACDBDBACACDBCBDA
//        Program skończył działanie.