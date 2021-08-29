public class Q1694 {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        for (char ch : number.toCharArray()) {
            if (Character.isDigit(ch)) sb.append(ch);
        }
        number = sb.toString();
        sb.setLength(0);
        int index = 0;
        while (index < number.length() - 4) {
            sb.append(number.substring(index, index + 3)).append('-');
            index += 3;
        }
        if (number.length() - index <= 3) sb.append(number.substring(index, number.length()));
        else
            sb.append(number.substring(index, index + 2)).append("-").append(number.substring(index + 2, number.length()));
        return sb.toString();
    }
}
