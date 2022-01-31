package HackerRank;

class IPRegex {
    private String ptn =  "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern = ptn +  "\\." + ptn + "\\." +  ptn + "\\." +  ptn ;
}
