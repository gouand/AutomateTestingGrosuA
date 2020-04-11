package dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@XStreamAlias("ValCurs")
public class ValCurs {
    @XStreamImplicit(itemFieldName = "Valute")
    private List<Valute> Valute;
    @XStreamAlias("Date")
    @XStreamAsAttribute
    private String Date;
    @XStreamAlias("Name")
    @XStreamAsAttribute
    private String Name = "Official exchange rate";

    public ValCurs(){
        SimpleDateFormat formatter= new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date(System.currentTimeMillis());
        this.Date = formatter.format(date);
    }


    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Курс валют {\n" +
                 Valute.toString() +
                '}';
    }
    public ValCurs(List<Valute> valute) {
        Valute = valute;
        SimpleDateFormat formatter= new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date(System.currentTimeMillis());
        this.Date = formatter.format(date);
    }

    public List<Valute> getValute() {
        return Valute;
    }

    public void setValute(List<Valute> valute) {
        Valute = valute;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
