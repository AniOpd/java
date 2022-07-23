public class string_method {
    public static void main(String[] arg) {
        String name = "Bhai op akki";
        int value = name.length();
        String name1 = "    op akki    ";
        System.out.println(name1);
        String ch = name.toLowerCase();
        System.out.println(value);
        System.out.println(ch);
        System.out.println(name1.trim());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(2, 3));
        System.out.println(name.replace('a', 't'));
        System.out.println(name.replace('a', 'p'));
        System.out.println(name.charAt(6));
        System.out.println(name.startsWith("akki"));
        System.out.println(name.endsWith("akki"));
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(9));
        System.out.println(name.indexOf("a"));
        System.out.println(name.equals("akki"));
        System.out.println(name.equalsIgnoreCase("bhai op akki"));
    }
}