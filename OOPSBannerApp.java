/**
 * OOPSBannerApp UC3 - OOPS Banner Display Application
 *
 * This class demonstrates optimized banner rendering using String.join()
 * to reduce temporary string object creation and improve memory efficiency.
 *
 * @author Developer
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String banner = String.join("\n",
                "  ******      ******      ********      ******  ",
                " **    **    **    **     **      **    **      ",
                " **    **    **    **     **      **    **      ",
                " **    **    **    **     ********      ******   ",
                " **    **    **    **     **                **",
                " **    **    **    **     **                **",
                "  ******      ******      **            ******  "
        );

        System.out.println(banner);
    }
}