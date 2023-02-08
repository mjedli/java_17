package java_17;
public class StringTextBloque {

    public static void main (String[] args) {
        System.out.println(getHtmlBlock());
        /*
               <html>
                 <head>
                   <text>hello wolrd</text>
                 </head>
                 <body>
                 </body>
                </html
        */
        System.out.println(getTextParameter("cat")); 
        // it is a cat
    }
    
    public static String getHtmlBlock() {
        return """
               <html>
                 <head>
                   <text>hello wolrd</text>
                 </head>
                 <body>
                 </body>
                </html>
                """;
    }
    
    public static String getTextParameter(String output) {
        
        return """
               it is a %s 
               """.formatted(output);
    }

}