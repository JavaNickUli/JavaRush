package sandbox;

public class Grade {

    public static void main(String[] args) {
        new Grade().gradeBeautifier("вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5");
    }

    public void gradeBeautifier(String grades) {
        for (String line : grades.split(";")) {
            String[] el = line.split(",");
            System.out.printf("%s %s %s - %s\n",
                    capitalize(el[0]), capitalize(el[1]), el[2].toLowerCase(), gradeToString(el[3]));
        }
    }

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5":
                return "Безупречно";
            case "4":
                return "Потрясающе";
            case "3":
                return "Восхитительно";
            case "2":
                return "Прекрасно";
            default:
                return "Очаровательно";
        }
    }
}
