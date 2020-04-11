import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import dto.ValCurs;
import dto.Valute;
import org.xml.sax.InputSource;

import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.xpath.*;
import java.beans.XMLDecoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Curs {

    public static void main(String[] args) throws IOException {
//        XStream xstream = new XStream(new StaxDriver());
//        String xml = "<ValCurs Date=\"01.12.2019\" name=\"Official exchange rate\">\n" +
//                "<Valute ID=\"47\">\n" +
//                "<NumCode>978</NumCode>\n" +
//                "<CharCode>EUR</CharCode>\n" +
//                "<Nominal>1</Nominal>\n" +
//                "<Name>Euro</Name>\n" +
//                "<Value>19.1952</Value>\n" +
//                "</Valute>\n" +
//                "<Valute ID=\"44\">\n" +
//                "<NumCode>840</NumCode>\n" +
//                "<CharCode>USD</CharCode>\n" +
//                "<Nominal>1</Nominal>\n" +
//                "<Name>US Dollar</Name>\n" +
//                "<Value>17.4446</Value>\n" +
//                "</Valute>" +
//                "</ValCurs>";
//        ValCurs valCurs = (ValCurs) xstream.fromXML(xml);


//        List<Valute> valute = new ArrayList<Valute>();

//        valute.add(new Valute("12","USD","NAme","as","as"));
//        valute.add(new Valute("12","USD","NAme","as","as"));
//        valute.add(new Valute("12","USD","NAme","as","as"));
//        valute.add(new Valute("12","USD","NAme","as","as"));
//        valute.add(new Valute("12","USD","NAme","as","as"));
//        valute.add(new Valute("12","USD","NAme","as","as"));

        String url = "http://bnm.md/en/official_exchange_rates?get_xml=1&date=01.12.2019";

        URL obj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        String xml = response.toString();
        System.out.println(xml.trim());

//        ValCurs curs = new ValCurs(valute);
        XStream xstream = new XStream(new DomDriver());
        xstream.autodetectAnnotations(true);
        xstream.processAnnotations(ValCurs.class);
        xstream.setMode(XStream.ID_REFERENCES);
        //String xml = xstream.toXML(curs);
        System.out.println(xml);
        Class<?>[] classes = new Class[] { ValCurs.class, Valute.class };
        XStream.setupDefaultSecurity(xstream);
        xstream.allowTypes(classes);
        ValCurs valCurs = (ValCurs) xstream.fromXML(xml);

        System.out.println(valCurs.toString());




    }
}
