package puzzlers;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @see URL.equals() is doing DNS lookup
 * google.github.io and square.github.io:80 hosted at the same IP address
 * @author yevhenii.valkovskyi 9/12/2016
 */
public class URLPuzzler {

    public static void main(String[] args) throws MalformedURLException {
        Set<URL> set = new LinkedHashSet<>();

        set.add(new URL("http://Square.GitHub.io/"));
        set.add(new URL("http://square.github.io:80/"));
        set.add(new URL("http://google.github.io/"));

        System.out.println(set);
    }

}
