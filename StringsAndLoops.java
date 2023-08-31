public class StringsAndLoops {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to my review program! \n\n");
        String myStr01 = "The quick brown fox jumped over the lazy dog.";
        String myStr02 = "";

        int theCharIndexStart = 0;
        int theCharIndexStop = 0;

        theCharIndexStart = myStr01.indexOf("brown fox");
        System.out.println(" theCharIndexStart is: " + theCharIndexStart);

        theCharIndexStop = myStr01.indexOf("x");
        System.out.println(" theCharIndexStop is: " + theCharIndexStop);
        // Add one to theCharIndexStop
        theCharIndexStop++;

        myStr02 = myStr01.substring(theCharIndexStart, theCharIndexStop);

        System.out.println("\n\n myStr02 is: " + myStr02);

        int i=0;
        while(i<10){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            i++;
        }





    }
}
