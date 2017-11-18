package Lesson2;

public class StringUsage {
    public static void main(String args[]) {
        String helloWorld = "Hello world!";
        String helloWorldLowerCase = "hello world!";
        String helloWorldAdditionalSpaces = " Hello world! ";
        String world = "world";
        String sunny = "Sunny";
        String goodDay = "Have a good day!";
        String lastSymbol = "!";
        int i = 2;

        System.out.println("Char value at the " + i + " place of '" + helloWorld + "' is '" + helloWorld.charAt(i) + "'");
        System.out.println("Conacatination of '" +  helloWorld + "' and '" + goodDay + "' is '" + helloWorld.concat(goodDay) + "'");
        System.out.println("Is '" + helloWorld + "' ends with '" + lastSymbol + "'? " + helloWorld.endsWith(lastSymbol));
        System.out.println("Are objects '" + helloWorld + "' and '" + goodDay + "' equal? " + helloWorld.equals(goodDay));
        System.out.println("Are Strings '" + helloWorld + "' and '" + helloWorldLowerCase + "' equal ignore case? " + helloWorld.equalsIgnoreCase(helloWorldLowerCase));
        System.out.println("Index of '" + lastSymbol + "' in string '" + helloWorld + "' is " + helloWorld.indexOf(lastSymbol));
        System.out.println("Index of '" + world + "' in string '" + helloWorld + "' is " + helloWorld.indexOf(world));
        System.out.println("Last index of '" + lastSymbol + "' in string '" + helloWorld + "' is " + helloWorld.lastIndexOf(lastSymbol));
        System.out.println("Last index of '" + world + "' in string '" + helloWorld + "' is " + helloWorld.lastIndexOf(world));
        System.out.println("'" + helloWorld + "' String length is " + helloWorld.length());
        System.out.println("Replace '" + world + "' in '" + helloWorld + "' to '" + sunny + "': "+ helloWorld.replace(world, sunny));
        System.out.println("Split '" + helloWorld + "' with spaces:");
        for (String retval : helloWorld.split(" ")) {
            System.out.println(retval);
        }
        System.out.println("Is '" + helloWorld + "' starts with '" + lastSymbol + "'? " + helloWorld.startsWith(lastSymbol));
        System.out.println("Show string '" + helloWorld + "' from " + i + " symbol: " + helloWorld.substring(i));
        System.out.println("Show string '" + helloWorld + "' from " + i + " to 6 symbols: " + helloWorld.substring(i, 6));
        System.out.print("Convert '" + helloWorld + "' to a new character array: " );
        for (char retval : helloWorld.toCharArray()) {
            System.out.print(retval + " ");
        }
        System.out.println();
        System.out.println("Convert all of the characters in '" +  helloWorld + "' string to lower case using the rules of the default locale: " + helloWorld.toLowerCase());
        System.out.println("Convert all of the characters in '" +  helloWorld + "' string to upper case using the rules of the default locale: " + helloWorld.toUpperCase());
        System.out.println("Return string '" + helloWorldAdditionalSpaces + "' without spaces at the begin and end: " + helloWorldAdditionalSpaces.trim());
    }

}
