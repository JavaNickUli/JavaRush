package sandbox;

public class Alphabet {
    public static void main(String[] args) {
        Alphabet alphabet = new Alphabet(); // один метод у тебя не статичный ради которого пришлось создавать объект
        alphabet.sout(); // почему не сделать его тоже статичным? минус одна строка кода, минус один объект
        String englishLine = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char en : englishLine.toCharArray()){ // ctrl+alt+l религия не позволяет использовать?
            String line = Character.toString(en); // зачем создавать переменную, когда проще кинуть сразу в sout?
            // что за пустые строки?
            System.out.println(line + op(line) + getRuValue(en)); // зачем op(), когда проще сразу " = "?
            // зачем вообще передавать line в op()? какой смысл преследовался?
        }
    }
    // getRuValue(en)
    public static String getRuValue (char ru) { // параметр принимает английские символы, а не ru
        return switch (ru) { // switch - наверно единственное к чему нет претензий... кроме одной:
            case 'A'->"эй"; // достаточно было сделать 5 символов для примера
            case 'B'->"би"; // остальное - тупая трата времени, не дающая опыта программирования
            case 'C'->"си";
            case 'D'->"ди";
            case 'E'->"и";
            case 'F'->"эф";
            case 'G'->"джи";
            case 'H'->"эйч";
            case 'I'->"ай";
            case 'J'->"джей";
            case 'K'->"кей";
            case 'L'->"эл";
            case 'M'->"эм";
            case 'N'->"эн";
            case 'O'->"оу";
            case 'P'->"пи";
            case 'Q'->"кью";
            case 'R'->"а";
            case 'S'->"эс";
            case 'T'->"ти";
            case 'U'->"ю";
            case 'V'->"ви";
            case 'W'->"дабл ю";
            case 'X'->"экс";
            case 'Y'->"уай";
            case 'Z'->"зет";
            default -> "ошибка";
        };

    }

    public static String op (String s) { // в данном случае s из параметра у тебя не используется
        s = " = "; // почему не сразу return " = ";?
        return s;
    }

    public void sout() { // старайся давать нормальные имена, к примеру printTitle
        System.out.println("Английский алфавит с произношением:");
    }
}
