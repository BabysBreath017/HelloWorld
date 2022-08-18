public class BackslashSymbol {
	public static void main(String[] args) {
    String openingLyrics = "Yesterday, all my troubles seemed so far away";
        System.out.println(openingLyrics);

        System.out.println("Hello\nGoodbye");
        /*
        Prints:
        Hello
        Goodbye
        You can think of \n as the escape sequence for “newline”
        */

        System.out.println("\"Hello World\"");
        // Prints: "Hello World"
        System.out.println("反斜杠+双引号就可以输出双引号：\"");
	}
}