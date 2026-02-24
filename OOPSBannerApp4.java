/**
 * OOPSBannerApp UC4
 * Render OOPS banner using String array and loop
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Define array with full banner rows
        String[] lines = {

            "  *****     *****     ******     *****  ",
            " **   **   **   **    **   **   **    *  ",
            " **   **   **   **    **   **   **      ",
            " **   **   **   **    ******      *****  ",
            " **   **   **   **    **              ** ",
            " **   **   **   **    **         *    ** ",
            "  *****     *****     **          *****  "

        };

        // Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}