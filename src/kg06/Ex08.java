package kg06;

class Ex08 {

    public static void main(String[] args) {

        String is = "2015 CS Computer Science";
        String os = "";
        os = is.replaceAll("C", "G");
        System.out.println(os);
        os = is.replaceAll("[0-9]", "*");
        System.out.println(os);

        os = is.replaceAll("\\w+", "@");
        System.out.println(os);

        os = is.replaceAll("e$", "E");
        System.out.println(os);

        os = is.replaceAll("[CS]", "cs");
        System.out.println(os);
    }
}
