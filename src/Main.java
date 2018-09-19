public class Main {
    public static void main(String[] args) {
        String w1 = WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt");
        String w2 = WebScraper.urlToString("https://www.bls.gov/tus/charts/chart9.txt");
        String w3 = WebScraper.urlToString("http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt");
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for (char current : w1.toCharArray()){
            if (current == ' ') {
                c1 += 1;
            }
        }
        for (char current : w2.toCharArray()){
            if (current == ' ') {
                c2 += 1;
            }
        }
        for (char current : w3.toCharArray()){
            if (current == ' ') {
                c3 += 1;
            }
        }
        System.out.println(c1 + " " + c2 + " " + c3);
    }
}
