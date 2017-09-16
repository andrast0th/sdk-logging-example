package co.atoth;

import com.hpe.adm.nga.sdk.Octane;
import com.hpe.adm.nga.sdk.authentication.SimpleClientAuthentication;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Octane octane = new Octane.Builder(new SimpleClientAuthentication("","")).build();
    }
}
