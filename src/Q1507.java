public class Q1507 {
    public String reformatDate(String date) {
        //str[0] = day, [1] = month, [2] = year
        String[] str = date.split(" ");
        StringBuilder sb = new StringBuilder();
        //append year and -
        sb.append(str[2]).append('-');
        //append month and -
        String month = "";
        switch (str[1]) {
            case "Jan":
                month = "01-";
                break;
            case "Feb":
                month = "02-";
                break;
            case "Mar":
                month = "03-";
                break;
            case "Apr":
                month = "04-";
                break;
            case "May":
                month = "05-";
                break;
            case "Jun":
                month = "06-";
                break;
            case "Jul":
                month = "07-";
                break;
            case "Aug":
                month = "08-";
                break;
            case "Sep":
                month = "09-";
                break;
            case "Oct":
                month = "10-";
                break;
            case "Nov":
                month = "11-";
                break;
            case "Dec":
                month = "12-";
                break;
        }
        sb.append(month);
        //append day
        //check if second character of str[0] is digit, if it's digit append first and second
        //characters, else append '0'+first character
        if (Character.isDigit(str[0].charAt(1))) sb.append(str[0].substring(0, 2));
        else sb.append('0').append(str[0].charAt(0));
        return sb.toString();
    }
}
