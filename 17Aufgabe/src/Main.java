import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueFetching = "j"; // Variable zur Steuerung der Schleife

        while (continueFetching.equalsIgnoreCase("j")) {
            try {
                // URL der API
                URL url = new URL("https://witzapi.de/api/joke/");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                // Überprüfen des HTTP-Antwortcodes
                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    // Stream öffnen, um die Antwort zu lesen
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    StringBuilder jsonResponse = new StringBuilder();
                    String inputLine;

                    // Zeilenweise Lesen der Antwort
                    while ((inputLine = in.readLine()) != null) {
                        jsonResponse.append(inputLine);
                    }
                    in.close();

                    JSONObject jsonObject = (JSONObject) JSONValue.parse(jsonResponse.toString());

                    String joke = (String) jsonObject.get("joke");

                    // Ausgabe des Witzes
                    System.out.println("Witz: " + joke);
                } else {
                    System.out.println("Fehler beim Abrufen des Witzes: " + responseCode);
                }

                connection.disconnect();

            } catch (Exception e) {
                e.printStackTrace();
            }


            System.out.print("Nächsten Witz holen? j/n: ");
            continueFetching = scanner.nextLine();
        }
    }
}
