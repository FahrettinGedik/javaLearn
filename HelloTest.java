public class HelloTest{
    public static void main(String[] args) {
        Hello nesne = new Hello();

        String cevap = nesne.helloWorld("John Doe");
        System.out.println(cevap);
    }
}